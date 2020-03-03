package pages;

import sluts.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherPage {
    private Teacher teacher;
    private static List<TeacherPage> teacherPages = new ArrayList<TeacherPage>();

    public TeacherPage(Teacher t){
        this.teacher = t;
        teacherPages.add(this);
    }

    public static List<TeacherPage> getTeacherPages(){
        return teacherPages;
    }

    public String pagePrint() {
        String s = this.teacher.getName() + "\n";
        s += this.teacher.getPhoto() + "\n";
        s += "ID: " + this.teacher.getId() + "\n";
        s += "Dersler: \n";
        for (Integer id : this.teacher.getLessons().keySet()){
            s+= this.teacher.getLessons().get(id).toString() + "\n";
        }
        return s;
    }
}
