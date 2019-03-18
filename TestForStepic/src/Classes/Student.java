package Classes;

public class Student {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }     
    public int getCsGrade(){
        return this.grade;
                
    }
    
    public String getName(){
        return this.name;
                
    }
}
/*
ArrayList<Student> students = TestForStepic.fillStudents();
        students.sort(comparing(Student::getCsGrade, reverseOrder()).thenComparing(Student::getName));
        
        for (Student x : students) {
            System.out.println(x.getName() + " " + x.getCsGrade());
        }
*/
