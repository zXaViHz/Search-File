/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.FileDao;
import model.InputData;

/**
 *
 * @author Admin
 */
public class FileRepository implements IFileRepository {
    @Override
    public void countWord (InputData input){
        System.out.println("Bout: " + FileDao.Instance().countWord(input));
    }
    
    @Override
    public void findFileByWord(InputData fileData){
        FileDao.Instance().findFileByWord(fileData);
    }
}
