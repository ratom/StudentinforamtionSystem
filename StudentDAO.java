/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atom.sis.dao;

import com.atom.sis.entity.Student;
import java.util.List;

/**
 *
 * @author rabin dulal
 */
public interface StudentDAO {
    void insert(Student s);
    void update(Student s);
    boolean delete(int id);
    Student searchById(int id);
    List<Student> getAll();
    
    
}
