/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atom.sis;

import com.atom.sis.entity.Student;
import com.atom.sis.service.StudentService;
import com.atom.sis.service.impl.StudentServiceImpl;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author rabin dulal
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StudentService studentService=new StudentServiceImpl(new ArrayList());
        
        // TODO code application logic here
      while(true){
            System.out.println("Welcome to Student Management System");
            System.out.println("======================================");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Show All");
            System.out.println("5. Search By Id");
            System.out.println("6. Search by Any");
            System.out.println("7. Exit");
            System.out.println("Enter your choice[1-7]:");
        
            switch (scanner.nextInt()){
             case 1:
                 
                 while(true){
                Student student=new Student();
                System.out.println("Enter Id:");
                student.setId(scanner.nextInt());
                System.out.println("Enter First Name:");
                student.setFirstName(scanner.next());

                System.out.println("Enter Last Name:");
                student.setLastName(scanner.next());
                System.out.println("Enter Email:");
                student.setEmail(scanner.next());
                System.out.println("Enter Contact No:");
                student.setPhoneNo(scanner.next());
                System.out.println("Enter Join Date [yy/mm/dd Format]");

               /* try{
                    DateFormat df=new SimpleDateFormat("yy/mm/dd");
                    student.setJoinDate(df.parse(scanner.next()));
                }catch(ParseException pe){
                    System.out.println(pe.getMessage());
                }*/

                System.out.println("Enter Status:");
                student.setStstus(scanner.nextBoolean());

                studentService.insert(student);
                System.out.println("Do you want to continue[Y/N]:");
                if(scanner.next().equalsIgnoreCase("n")){
                    break;
                }

        }
             case 2:
                 break;
             case 3:
                 break;
             case 4:
                 System.out.println("Printing all Students");
                System.out.println("===========================");
                System.out.println(studentService.getAll().size());
                studentService.getAll().forEach(s->{
                    System.out.println(s.toString());
                });
                 
                 
                 break;
                 
                 
        
    }
      }  
            
            
}
}
