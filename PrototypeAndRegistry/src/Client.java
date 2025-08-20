import java.util.List;

public class Client {
    public static void main(String[] args) {
        Student student = new Student("Sushanth",
                "ASN0017",
                "shmk09@hotmail.com",
                21,
                "Batch C",
                List.of("Java", "Python", "C++"));

        //Create a deep copy of the student object using the copy method
        Student s3 = student.copy();

        StudentRegistry registry = new StudentRegistry();
        registry.fillRegistryWithStudents();

        Student student1 = registry.getStudentNewStudentObj("ASN003");
    }
}
