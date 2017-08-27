/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.ex1;

import java.util.Scanner;
import static com.fpt.ex1.Ex1.studentList;

/**
 *
 * @author Admin
 */
public class Student {

    private String name;
    private String age;
    private String address;
    
    public Student(){
        name = "default";
        age = "default";
        address = "default";
    }
    public Student(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    Scanner input = new Scanner(System.in);
    public void Menu() {
        System.out.println("Menu: \n1.Display the Student List. \n2.Add a student. \n3. Modify Student. \n4.Delete a Student. \n5.Quit.");
        System.out.println("You choose: ");
        
        String choice = input.nextLine();
        switch(choice){
            case "1": 
                this.Display();
                break;
            case"2":
                this.Add();
                break;
            case"3": 
                this.Modify();
                break;
            case"4":
                this.Delete();
                break;
            case"5":
                this.Quit();
                break;
            default:
                System.out.println("Wrong key pressed....");
                this.Menu();
        }
    }
    
    //Displaying list Function in traditional for loop
    public void Display(){
        for(int i = 0;i<studentList.size();i++){
            Student stuSample = studentList.get(i);
            System.out.println("Name : "+ stuSample.getName()+"\nAge: "+ stuSample.getAge()+"\nAddress: "+ stuSample.getAddress());
            System.out.println("---");
        }
        //Displaying list function in for each loop
//        for(Student stuSample : studentList){
//            System.out.println("Name : "+ stuSample.getName()+"\nAge: "+ stuSample.getAge()+"\nAddress: "+ stuSample.getAddress());
//            System.out.println("---");
//        }

    this.Menu();
    }
    public void Add(){
        Student student = new Student();
        
        System.out.println("Enter student's name: ");
        String newName = input.nextLine();
        System.out.println("Enter Age: ");
        String newAge = input.nextLine();
        System.out.println("Enter Address: ");
        String newAddress = input.nextLine();
        student.address = newAddress;
        student.age = newAge;
        student.name = newName;
        studentList.add(student);
        
        this.Menu();
    }
    public void Modify(){
        int cnt = 0;
        System.out.println("Enter student's name: ");
        String stdName = input.nextLine();
        for(int i = 0; i <studentList.size();i++ ){
            if(stdName.equalsIgnoreCase(studentList.get(i).getName())){
                cnt++;
                System.out.println("Student Found... ");
                System.out.println("Enter new name:  ");
                String newName = input.nextLine();
                System.out.println("Enter new age: ");
                String newAge = input.nextLine();
                System.out.println("Enter new Address: ");
                String newAddress = input.nextLine();
                studentList.get(i).setName(newName);
                studentList.get(i).setAge(newAge);
                studentList.get(i).setAddress(newAddress);
            }
        }
        if(cnt==0) System.out.println("No data found....");
        this.Menu();
    }
    public void Delete(){
        int cnt = 0;
        System.out.println("ENter student's name: ");
        String stdName = input.nextLine();
        for (int i =0;i<studentList.size();i++){
            if(stdName.equalsIgnoreCase(studentList.get(i).getName())){
                cnt++;
                System.out.println("Student Found...");
                studentList.remove(i);
                System.out.println("Student has been deleted...");
            }
        }
        if(cnt==0)System.out.println("Data not found...");
        this.Menu();
    }
    public void Quit(){
        
    }
    
}
