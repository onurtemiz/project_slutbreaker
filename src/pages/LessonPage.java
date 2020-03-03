package pages;

import sluts.Lesson;

import java.util.ArrayList;
import java.util.List;

public class LessonPage {
    private Lesson lesson;
    private static List<LessonPage> lessonPages = new ArrayList<LessonPage>();

    public LessonPage(Lesson l){
        this.lesson = l;
        lessonPages.add(this);
    }

    public static List<LessonPage> getLessonPages(){
        return lessonPages;
    }

    public String pagePrint(){
        String s = this.lesson.getName() + "\n";
        s += "ID: " + this.lesson.getId() + "\n";
        s += "Teachers: \n";
        for (Integer id : this.lesson.getTeachers().keySet()){
            s+= this.lesson.getTeachers().get(id).toString() + "\n";
        }
        return s;
    }
}
