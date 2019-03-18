package testforstepic;

import java.util.ArrayList;
import java.util.List;
import Classes.Student;
import static java.util.Collections.reverseOrder;
import static java.util.Comparator.comparing;

public class TestForStepic {
    
    public static ArrayList<Student> students = new ArrayList<Student>();
   

    public static ArrayList<Student> fillStudents() {        
        students.add(new Student("Antonio", 85));
        students.add(new Student("Alisa", 100));
        students.add(new Student("John", 100));
        students.add(new Student("Elizabet", 97));
        students.add(new Student("Vladimir", 94));
        students.add(new Student("Francis", 85));
        students.add(new Student("Mary", 82));
        return students;
    }
}