/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gsontest;

import com.google.gson.*;

import java.io.*;
import java.util.*;

/**
 *
 * @author novac
 */
public class GSONTest {

    ProjectData data;
    String dataFileName = "data.json";

    public void start() {
        // read data from the file
        initializeData();

        System.out.println("Your starting data:");
        System.out.println(data);

        // Prompt the user for a new section and new student
        promptForNewSection();
        promptForNewStudent();

        //prompt for a new student
        System.out.println("Here is your updated data:");
        System.out.println(data);
        System.out.println("Saving now...");
        saveData();

    }

    /**
     * Read data from the file
     */
    public void initializeData() {
        Gson g = new Gson();
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(dataFileName));
            data = g.fromJson(br, ProjectData.class);
            br.close();
        } catch (IOException ex) {
            System.out.println("Error in file: " + ex.getMessage());
        }
        if (data == null) {
            data = new ProjectData();
            saveData();
        }
    }

    public void saveData() {
        Gson g = new Gson();
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(dataFileName));
            bw.write(g.toJson(data));
            bw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        GSONTest tester = new GSONTest();
        tester.start();
    }

    private void promptForNewSection() {
        Scanner s = new Scanner(System.in);
        System.out.println("Do you want a new section? Type Y or N.");
        String answer = s.nextLine().substring(0, 1).toLowerCase();
        if (answer.equals("y")) {
            System.out.println("What course?");
            String c = s.nextLine();
            System.out.println("What section name?");
            String sectionName = s.nextLine();
            data.getSectionList().add(new Section(c, sectionName));
        }
        s.close();
    }

    private void promptForNewStudent() {
        Scanner s = new Scanner(System.in);
        System.out.println("Do you want a new student? Type Y or N.");
        String answer = s.nextLine().substring(0, 1).toLowerCase();
        if (answer.equals("y")) {
            System.out.println("Student name?");
            String sname = s.nextLine();
            System.out.println("Student Grade? (enter an int)");
            int sgrade = s.nextInt();
            s.nextLine();
            System.out.println("Student Section?");
            String sectname = s.nextLine();
            data.getStudentList().add(new Student(sname, sgrade, sectname));
        }
        s.close();
    }

}
