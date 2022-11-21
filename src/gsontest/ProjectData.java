/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gsontest;

import java.util.ArrayList;

/**
 * Contains all data used by the project in a single class
 * @author novac
 */
public class ProjectData {
    private final ArrayList<Student> studentList = new ArrayList();
    private final ArrayList<Section> sectionList = new ArrayList();

    @Override
    public String toString() {
        return "studentList=" + studentList + "\nsectionList=" + sectionList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public ArrayList<Section> getSectionList() {
        return sectionList;
    }
    
}
