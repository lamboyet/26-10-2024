import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendentStudentCompartor implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getId(),student2.getId());
    }
}

public class StudentsCollectionRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(100,"ceva nume"), new Student(20,"altceva nume")
        ,new Student(3,"altceva ceva nume"));

        List<Student> studentsAl = new ArrayList<>(students);

        System.out.println(students);

        Collections.sort(studentsAl);
        System.out.println("ascending order " + studentsAl);

        Collections.sort(studentsAl,new DescendentStudentCompartor());
        System.out.println("desc order" + studentsAl);
                //to compare 2 students you need to have a comparable interface, to understand the criterias
        //for comparison and how a student is greater than another

    }
}
