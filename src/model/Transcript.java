package model;

import java.util.ArrayList;
import java.util.List;

public class Transcript {

    public String studentName;
    public int id;
    private List<String> courseNames = new ArrayList();
    private List<Double> courseGrades = new ArrayList();

    public Transcript(String studentName, int id){
        this.studentName = studentName;
        this.id = id;
    }

    //TODO: Design specification for this method
    //
    //Requires: GPA must be between 0.0 and 4.0 and/or the course should not be null
    // Modifies: this
    // Effects: Adds the GPA to the transcript set
    public void addGrade(String course, double grade){
     if(grade>=0.0 && grade<=4.0){
         courseGrades.add(grade);
     }
     if(course != null){
         courseNames.add(course);
     }
    }

    //TODO: Design specification for this method
    //Requires: Course should not be null
    //Modifies: Changes GPA to String
    //Effects: This method should return course name and grade in format CourseName: Grade
    //
    public String getCourseNameAndGrade(){
        String testTranscriptString = "";
        for(int i=0;i<courseNames.size();i++){
         testTranscriptString += courseNames.get(i)+": "+courseGrades.get(i)+", ";
        }
        testTranscriptString = getStudentName()+": "+testTranscriptString;
       return testTranscriptString;
    }

    //TODO: Design specification for this method
    //Requires: Nothing
    // Modifies: Nothing
    // Effects: Displays student academic record
    public void printTranscript(){
        System.out.println(getCourseNameAndGrade());
        System.out.println(getOverallGPA(courseGrades));
    }

    //TODO: Design specification for this method
    //
    private String getOverallGPA(List<Double> courseGrades){
        double sum = 0.0;
        double average;
        for(int i=0;i<courseGrades.size();i++){
            sum+=courseGrades.get(i);
        }
        average = sum/courseGrades.size();
        return "Overall GPA is: "+average;
    }

    public int getId(){return id;}
    public String getStudentName(){return studentName;}
}

