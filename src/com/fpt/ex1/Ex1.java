/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.ex1;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Ex1 {

    static ArrayList<Student> studentList = new ArrayList<>();
   
    public static void main(String[] args) {
        Student stu1 = new Student("NV A","18","HN 1");
        Student stu2 = new Student("NV B","18","HN 2");
        Student stu3 = new Student("NV C","18","HN 3");
        Student stu4 = new Student("NV D","18","HN 4");
        Student stu5 = new Student("NV E","18","HN 5");
       
        studentList.add(stu1);
        studentList.add(stu2);
        studentList.add(stu3);
        studentList.add(stu4);
        studentList.add(stu5);
        new Student().Menu();
    }
    
}
