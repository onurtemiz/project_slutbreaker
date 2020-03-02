import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private List<Lesson> lessons = new ArrayList<Lesson>();
    private String photo;

    public Teacher(String name){
        this.name = name;
        this.photo = "PHOTO";
    }

    public void addLesson(Lesson lesson){
        this.lessons.add(lesson);
    }

    public void removeLesson(Lesson lesson){
        this.lessons.remove(lesson);
    }

    public String getName(){
        return this.name;
    }

    public List<Lesson> getLessons(){
        return this.lessons;
    }

}
