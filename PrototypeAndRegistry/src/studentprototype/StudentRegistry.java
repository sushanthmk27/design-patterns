package studentprototype;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private Map<String, Student> studentsHMap;

    //Whenever the object gets created the HashMap gets created
    public StudentRegistry() {
        studentsHMap = new HashMap<>();
    }

    public void addStudent(String studentIdKey, Student student) {
        studentsHMap.put(student.getStudentId(), student);
    }

    public void removeStudent(String studentIdKey) {
        studentsHMap.remove(studentIdKey);
    }

   /* This method returns a deep copy of the student object
    using the copy method defined in the studentprototype.Prototype interface*/
    public Student getStudentNewStudentObj(String studentIdKey) {
        return studentsHMap.get(studentIdKey).copy();
    }

    public void fillRegistryWithStudents() {
        Student std1 = new Student("Aarav Sharma",
                "STU101",
                "aarav.sharma@example.com",
                20,
                "Batch A",
                Arrays.asList("Mathematics", "Physics", "Computer Science"));

        Student std2 = new Student("Priya Mehta",
                "STU102",
                "priya.mehta@example.com",
                21,
                "Batch B",
                Arrays.asList("Chemistry", "Biology", "English Literature"));

        Student std3 = new Student("Rahul Verma",
                "STU103",
                "rahul.verma@example.com",
                19,
                "Batch A",
                Arrays.asList("Economics", "Statistics", "Business Studies"));

        Student std4 = new Student("Sneha Nair",
                "STU104",
                "sneha.nair@example.com",
                22,
                "Batch C",
                Arrays.asList("History", "Political Science", "Sociology"));

        Student std5 = new Student("Vikram Iyer",
                "STU105",
                "vikram.iyer@example.com",
                20,
                "Batch B",
                Arrays.asList("Philosophy", "Psychology", "Anthropology"));

        //add the student objects to hMap and create a registry of student objects
        studentsHMap.put("ASN001",std1);
        studentsHMap.put("ASN002",std2);
        studentsHMap.put("ASN003",std3);
        studentsHMap.put("ASN004",std4);
        studentsHMap.put("ASN005",std5);
    }
}
