package pages;

import sluts.Comment;

import java.util.ArrayList;
import java.util.List;

public class Page {
    private List<Comment> comments = new ArrayList<Comment>();


    public void addComment(Comment c){
        this.comments.add(c);
    }

    public List<Comment> getComments(){
        return this.comments;
    }

    public String pagePrint() {
        return "ANNEN";
    }
}
