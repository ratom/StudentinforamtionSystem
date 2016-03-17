/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atom.sis.impl;

import com.atom.sis.dao.StudentDAO;
import com.atom.sis.entity.Student;
import java.util.List;

/**
 *
 * @author rabin dulal
 */
public class StudentDAOimpl implements StudentDAO{
    private List<Student> studentList;

    public StudentDAOimpl(List<Student> studentList) {
        this.studentList = studentList;
    }
    

    @Override
    public void insert(Student s) {
        studentList.add(s);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public void update(Student s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        boolean success=false;
        for(Student s:studentList){
        if(s.getId()==id){
            studentList.remove(s);
            success=true;
            break;
             }
        }
        return success;
    }
        
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    

    @Override
    public Student searchById(int id) {
        Student student=null;
        for(Student s:studentList){
        if(s.getId()==id){
            student=s;
            break;
            }
        }  
      return student;
    }

    @Override
    public List<Student> getAll() {
        return studentList;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
