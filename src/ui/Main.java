package ui;

import model.Coin;
import model.IntegerSet;
import model.Transcript;

public class Main {
    // Transcript creates a Transcript class instance with studentName and id as parameters
    // Transcript has the ability to:
        //Add CourseName & GPA
        //Print Transcript in readable format
        //Get Student Name or ID
    //
    public static void main(String[] args) {
        Transcript t1 = new Transcript("Jane Doe", 7830);
        //TODO: create another Transcript object
        t1.addGrade("CPSC-210", 3.5);
        t1.addGrade("CALC-113",3.2);
        t1.addGrade("GEO-112",1.5);
        t1.printTranscript();
//        //TODO: add grades to the other Transcript objects
//        System.out.print(t1.getStudentName() + ": ");
//        t1.printTranscript();
//        System.out.println(t1.getGPA());
//        //TODO: add more use cases here
    }
}
