/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess;

import common.Validation;
import java.io.File;
import model.InputData;

/**
 *
 * @author Admin
 */
public class FileDao {

    private static FileDao instance = null;
    private static Validation valid = new Validation();

    public static FileDao Instance() {
        if (instance == null) {
            synchronized (FileDao.class) {
                if (instance == null) {
                    instance = new FileDao();
                }
            }
        }
        return instance;
    }

    public int countWord(InputData input) {
        String pathname = input.getPathname();
        int count = 0;
        if (valid.checkFileExist(pathname)) {
            String content = valid.contentFile(pathname);
            String word = input.getWord();
            int position = 0;
            while (content.indexOf(word, position) != -1) {
                count++;
                position = content.indexOf(word, position)+ word.length();
            }
        } else {
            System.err.println("File does not exist");
        }
        return count;
    }

    public void findFileByWord(InputData input) {
        System.out.println("----------- File Name -----------");
        String pathname = input.getPathname();
        if (valid.checkFolderExist(pathname)) {
            File folder = new File(pathname);
            File[] listOfFiles = folder.listFiles();
            for (File file : listOfFiles) {
                if (file.isFile() && (file.getAbsolutePath().endsWith(".txt"))) {
                    input.setPathname(file.getAbsolutePath());
                    if (countWord(input) != 0) {
                        System.out.println("file name: " + file.getName());
                    }
                }
            }
        } else {
            System.err.println("Folder does not exist");
        }

    }
}
