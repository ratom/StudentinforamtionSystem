/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atom.sis.service.impl;

import com.atom.sis.dao.StudentDAO;
import com.atom.sis.entity.Student;
import com.atom.sis.impl.StudentDAOimpl;
import com.atom.sis.service.StudentService;
import java.util.List;

/**
 *
 * @author rabin dulal
 */
public class StudentServiceImpl implements StudentService{
    private StudentDAO studentDAO;
    
    public StudentServiceImpl(List<Student> studentList){
        studentDAO=new StudentDAOimpl(studentList);
    }
   
    @Override
    public void insert(Student s) {
        studentDAO.insert(s);
        
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Student s) {
        
        studentDAO.update(s);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        return studentDAO.delete(id);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student searchById(int id) {
        return studentDAO.searchById(id);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getAll() {
        return studentDAO.getAll();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
