/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ct417.ct417seassign1.b;

import ct417.snoonan.softeng3assign1.*;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.*;
/**
 *
 * @author Steven
 */
public class ProjectDriver {
    public static void main(String[] args0){
        
        //Creating fictional students
        Student stu1 = new Student("Shawn Carter", new LocalDate(1969, 12, 4), 10001);
        Student stu2 = new Student("Trae Young", new LocalDate(1998, 9, 19), 10002);
        Student stu3 = new Student("Malcom Miller", new LocalDate(1992, 1, 19), 10003);
        Student stu4 = new Student("Kevin Gates", new LocalDate(1986, 2, 5), 10004);
        Student stu5 = new Student("Gary Garcia", new LocalDate(2000, 8, 17), 10005);
        Student stu6 = new Student("Gustav Elijah", new LocalDate(1996, 11, 1), 10006);
        Student stu7 = new Student("Radric Davis", new LocalDate(1980, 2, 12), 10007);
        Student stu8 = new Student("Miles McColum", new LocalDate(1997, 8, 23), 10008);
        
        //Adding students to a list
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(stu1);
        studentList.add(stu2);
        studentList.add(stu3);
        studentList.add(stu4);
        studentList.add(stu5);
        studentList.add(stu6);
        studentList.add(stu7);
        studentList.add(stu8);
        
        //Creating Modules
        Module mod1 = new Module("Software Engineering 3", "CT417");
        Module mod2 = new Module("Systems Modelling", "CT418");
        Module mod3 = new Module("Cryptography", "CS404");
        Module mod4 = new Module("Artificial Intelligence", "CT421");
        Module mod5 = new Module("Professional Skills", "CT436");
        
        //Adding Modules to a module list
        ArrayList<Module> modList = new ArrayList<>();
        modList.add(mod1);
        modList.add(mod2);
        modList.add(mod3);
        modList.add(mod4);
        modList.add(mod5);
        
        
        //Adding students to the modules
        mod1.addStudent(stu1);
        mod1.addStudent(stu2);
        mod1.addStudent(stu3);
        
        mod2.addStudent(stu1);
        mod2.addStudent(stu5);
        mod2.addStudent(stu8);
        
        mod3.addStudent(stu6);
        mod3.addStudent(stu7);
        mod3.addStudent(stu8);
        
        mod4.addStudent(stu2);
        mod4.addStudent(stu5);
        mod4.addStudent(stu4);
        
        mod5.addStudent(stu4);
        mod5.addStudent(stu3);
        mod5.addStudent(stu6);
        
        //Creating the course with module and student lists
        CourseProgramme cs = new CourseProgramme("Computer Science & I.T.", modList, studentList,
                new LocalDate(2015,9,1), new LocalDate(2019,5,1));

        System.out.println("Course Name: ");
        System.out.println(cs.getCourseName());
        //Getting modules associated with course and printing to console
        List<Module> csModList = cs.getModulesList();
        System.out.println("\nModule Name" + "\t" + "Module ID");
        csModList.forEach((m) -> {
            System.out.println("\n" + m.getModName() + "\t" + m.getModId());
            System.out.println("\tStudents Registered for Module:");
            System.out.println("\n\t\tStudent Name" + "\t\t" +"Username"+ "\t\t" +"Date Of Birth"+
                "\t\t" +"Age"+ "\t\t" +"ID");
            List<Student> sList = m.getStudents();
            sList.forEach((s) -> {
                System.out.println("\t\t" + s.getName()  + "\t\t" + s.getUsername()  + "\t\t" + s.getDateOfBirth()
                        + "\t\t" + s.getAge()  + "\t\t" + s.getId() + "\t");
            });
        });
        //Getting Students assigned to the course and printing to the console
        List<Student> csStuList = cs.getStudentsList();
        System.out.println("\n\nStudents registered for course: ");
        System.out.println("\nStudent Name" + "\t\t" +"Username"+ "\t\t" +"Date Of Birth"+
                "\t\t" +"Age"+ "\t\t" +"ID");
        csStuList.forEach( (s) -> {
        System.out.println(s.getName()  + "\t\t" + s.getUsername()  + "\t\t" + s.getDateOfBirth()
                 + "\t\t" + s.getAge()  + "\t\t" + s.getId() + "\t\t");
    });
    }
}
