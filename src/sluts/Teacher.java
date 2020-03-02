package sluts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teacher {
    private String name;
    private Map<Integer,Lesson> lessons = new HashMap<Integer,Lesson>();
    private String photo;
    private static int currentId = 0;
    private int id;
    private static List<Teacher> teachers = new ArrayList<Teacher>();

    public Teacher(String name){
        this.name = name;
        this.photo = "PHOTO";
        this.id = createId();
        teachers.add(this);
    }

    public static int createId(){
        currentId++;
        return currentId-1;
    }

    public static List<Teacher> getTeachers(){
        return teachers;
    }

    public void addLesson(Lesson lesson){
        this.lessons.put(lesson.getId(),lesson);
    }


    public String getName(){
        return this.name;
    }

    public Map<Integer,Lesson> getLessons(){
        return this.lessons;
    }

    public int getId(){
        return this.id;
    }

    public String toString(){
        return this.name;
    }

    public String pagePrint() {
        String s = this.name + "\n";
        s += this.photo + "\n";
        s += "ID: " + this.id + "\n";
        s += "Dersler: \n";
        for (Integer id : lessons.keySet()){
            s+= lessons.get(id).toString() + "\n";
        }
        return s;
    }
}
