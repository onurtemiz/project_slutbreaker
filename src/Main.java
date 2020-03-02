import generator.FakeRegistration;
import sluts.Lesson;
import sluts.Teacher;

public class Main {

    public static void main(String[] args) {
        FakeRegistration reg = new FakeRegistration(20,20);
        reg.createRegistration();
        System.out.println(Teacher.getTeachers());
        System.out.println(Lesson.getLessons());
        for (Teacher t: Teacher.getTeachers()){
            System.out.println(t.pagePrint());
        }
    }
}
