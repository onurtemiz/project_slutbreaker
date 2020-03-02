import java.util.HashMap;
import java.util.Map;

public class Lesson {
    private String name;
    private Map<Integer,Teacher> teachers = new HashMap<Integer,Teacher>();
    private int id;
    private static int currentId = 0;

    public Lesson(String name){
        this.name = name;
        this.id = createId();
    }

    public static int createId(){
        currentId++;
        return currentId-1;
    }

    public String getName(){
        return this.name;
    }

    public void addTeacher(Teacher teacher){
        this.teachers.put(teacher.getId(),teacher);
    }


    public int getId(){
        return this.id;
    }

    public String toString(){
        return this.name;
    }
}
