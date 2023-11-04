/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Validation {

    public String contentFile(String pathname) {
        String content = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(pathname)));
            String line;
            while ((line = br.readLine()) != null) {
                content = content + line;
            }
            br.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
        return content;
    }

    public String inputString(String title) {
        String s = "";
        while (s.isBlank() || s.isEmpty()) {
            System.out.print(title + ": ");
            Scanner sc = new Scanner(System.in);
            s = sc.nextLine();
        }
        return s;
    }

    public boolean checkFileExist(String pathname) {
        File file = new File(pathname);
        if (file.exists() && !file.isDirectory()) {
            return true;
        }
        return false;
    }
    
    public boolean checkFolderExist(String pathname) {
        File folder = new File(pathname);
        if (folder.isDirectory()) {
            return true;
        }
        return false;
    }
}
