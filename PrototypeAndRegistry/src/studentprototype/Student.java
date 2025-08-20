package studentprototype;

import java.util.ArrayList;
import java.util.List;

public class Student implements Prototype<Student> {

    private String studentName;

    private String studentId;

    private String email;

    private int age;

    private String batch;

    private List<String> subjects;


    public Student(String studentName, String studentId, String email, int age, String batch, List<String> subjects) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.email = email;
        this.age = age;
        this.batch = batch;
        this.subjects = subjects;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

   /* this is a copy constructor used to create a DEEP COPY of an
    existing student object*/
    protected Student(Student student) {
        this.studentName = student.getStudentName();
        this.studentId = student.getStudentId();
        this.age = student.getAge();
        this.batch = student.getBatch();
        this.email = student.getEmail();
        this.subjects = new ArrayList<>(student.subjects);
    }

    @Override
    public Student copy() {
        return new Student(this);
    }

/*    @Override
    public studentprototype.Student clone() {
        return new studentprototype.Student(this);
    }*/
}
