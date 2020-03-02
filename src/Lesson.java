import java.util.ArrayList;
import java.util.List;

public class Lesson {
    private String name;
    private List<Teacher> teachers = new ArrayList<Teacher>();

    public Lesson(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void addTeacher(Teacher teacher){
        this.teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher){
        this.teachers.add(teacher);
    }

}
