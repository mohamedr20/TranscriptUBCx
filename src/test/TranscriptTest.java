package test;

import model.Transcript;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TranscriptTest {
    private Transcript testTranscript;
    private List<String> testCourseNames = new ArrayList();
    private List<Double> testCourseGrades = new ArrayList();

    @Before
    public void setup() {
        testTranscript = new Transcript("Mohamed",2000);
        testCourseNames.add("ENG-102");
        testCourseGrades.add(3.2);
    }
    @Test
    public void addGrade() {
        assertThat(testCourseNames,hasItems("ENG-102"));
        assertThat(testCourseGrades,hasItems(3.2));
    }

    @Test
    public void getCourseNameAndGrade() {
        testCourseNames.add("CALC-113");
        testCourseGrades.add(3.7);
        assertEquals("ENG-102: 3.2",testCourseNames.get(0)+": "+testCourseGrades.get(0));
    }

    @Test
    public void getOverallGPA(){
        testCourseGrades.add(3.7);
        testCourseGrades.add(1.8);
        testCourseGrades.add(2.6);
        double sum = 0.0;
        for(int i=0;i<testCourseGrades.size();i++){
            sum+=testCourseGrades.get(i);
        }
        assertEquals("Overall GPA is: 2.825","Overall GPA is: "+ sum/testCourseGrades.size());
    }

    @After
    public void teardown(){
        testCourseNames = null;
        testCourseGrades = null;
    }


}