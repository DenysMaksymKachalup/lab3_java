package Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(final String[] args) {
        final Subject english = new Subject("English");
        final Subject physic = new Subject("Physic");
        final Subject math = new Subject("Math");

        final List<Subject> subjects = new ArrayList<>();
        subjects.add(english);
        subjects.add(physic);
        subjects.add(math);

        final Student stud1 = new Student("Yura", "Kachalup", "2", subjects);
        final Student stud2 = new Student("Vlad", "Tyhocky", "4", subjects);
        final Student stud3 = new Student("Denys", "Kachalup", "3", subjects);

        final List<Student> students = new ArrayList<>();
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);

        final StudentSimple studentSimples = new StudentSimple();
        studentSimples.transformationList(students);

        System.out.println(stud1.averageMark());

        students.get(0).addMark(12, "English");
        students.get(0).addMark(4, "English");
        students.get(0).addMark(6, "English");

        students.get(1).addMark(1, "English");
        students.get(2).addMark(12, "English");

        students.get(0).addMark(3, "Physic");
        students.get(1).addMark(12, "Physic");
        students.get(2).addMark(2, "Physic");

        students.get(0).addMark(7, "Math");
        students.get(1).addMark(2, "Math");
        students.get(2).addMark(1, "Math");

        final Group group = new Group(students);
        group.addSubject(subjects,"IT");

        //System.out.println(group.bestStudentStream());

        students.get(0).addMark(12, "IT");
        students.get(1).addMark(2, "IT");
        students.get(2).addMark(3, "IT");
        System.out.println(group);

    }
}

