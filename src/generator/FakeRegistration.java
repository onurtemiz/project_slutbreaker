package generator;


import sluts.Lesson;
import sluts.Teacher;

import java.util.List;
import java.util.Random;

public class FakeRegistration {
    private TeacherGenerator tGenerator;
    private LessonGenerator lGenerator;
    private Random random = new Random();
    private List<String> teachers;
    private List<String> lessons;

    public FakeRegistration(int numberOfTeachers, int numberOfLessons) {
        this.tGenerator = new TeacherGenerator(numberOfTeachers);
        this.lGenerator = new LessonGenerator(numberOfLessons);
    }

    public void createComponents() {
        this.tGenerator.createNewList();
        this.teachers = this.tGenerator.getNames();

        this.lGenerator.createLessons();
        this.lessons = this.lGenerator.getLessons();
    }

    public void createRegistration() {
        createComponents();
        for (String t : teachers) {
            Teacher k = new Teacher(t);
            for (String l : lessons) {
                double prob = random.nextDouble();
                if (prob > 0.9) {
                    Lesson s = new Lesson(l);

                    k.addLesson(s);
                    s.addTeacher(k);
                }
            }
        }

    }

}
