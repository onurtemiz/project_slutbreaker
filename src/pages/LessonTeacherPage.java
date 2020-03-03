package pages;

import sluts.Comment;
import sluts.Lesson;
import sluts.Teacher;

import java.util.ArrayList;
import java.util.List;

public class LessonTeacherPage extends Page{
    private static List<LessonTeacherPage> lessonTeacherPages = new ArrayList<LessonTeacherPage>();
    private Lesson lesson;
    private Teacher teacher;
    private List<Comment> comments = new ArrayList<Comment>();

    public LessonTeacherPage(Lesson l, Teacher t){
        this.lesson = l;
        this.teacher = t;
        lessonTeacherPages.add(this);
    }

    public static List<LessonTeacherPage> getLessonTeacherPages(){
        return lessonTeacherPages;
    }

    public String pagePrint(){
        String s = "";
        s += "Ders Ismi:" + this.lesson.getName() + "\n";
        s += "Hoca Ismi:" + this.teacher.getName() + "\n";
        s += "Yorumlar:\n" ;
        for (Comment c : this.comments){
            s+= c;
        }
        return s;
    }
}
