public class Main {

    public static void main(String[] args) {
        /*Teacher ahmet = new Teacher("Ahmet Yusuf");
        Teacher mehmet = new Teacher("Mehmet Kahra");
        Teacher zeynep = new Teacher("Zeynep Koyun");
        Lesson htr = new Lesson("HTR331");
        Lesson ed = new Lesson("ED101");

        ahmet.addLesson(htr);
        htr.addTeacher(ahmet);

        zeynep.addLesson(ed);
        ed.addTeacher(zeynep);

        for (Teacher t : Teacher.getTeachers()){
            System.out.println(t.pagePrint());
        }

        for (Lesson l : Lesson.getLessons()){
            System.out.println(l.pagePrint());
        }*/

        /*TeacherGenerator t = new TeacherGenerator(10);
        t.createNewList();
        System.out.println(t.getNames());*/

        LessonGenerator l = new LessonGenerator(10);
        l.createLessons();
        System.out.println(l.getLessons());
    }
}
