/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gsontest;

/**
 * Represents one section of a class
 * @author novac
 */
public class Section {
    private final String courseName;
    private final String sectionName;
    
    public Section(String course, String section) {
        courseName = course;
        sectionName = section;
    }

    @Override
    public String toString() {
        return courseName + " " + sectionName;
    }
    
    
}
