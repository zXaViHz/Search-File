/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import model.InputData;

/**
 *
 * @author Admin
 */
public interface IFileRepository {

    void countWord(InputData input);

    void findFileByWord(InputData fileData);
    
}
