/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gsontest;

/**
 * Represents a student
 * @author novac
 */
public class Student {
    private final String name;
    private final int grade; //9 - 12 for high shcool
    private final String section;

    public Student(String name, int grade, String section) {
        this.name = name;
        this.grade = grade;
        this.section = section;
    }

    @Override
    public String toString() {
        return name + " g" + grade + " (" + section + ")";
    }
    
    

}
