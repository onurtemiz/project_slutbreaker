package sluts;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<Comment> comments = new ArrayList<Comment>();
    private String name;
    private String class_;
    private String dep;

    public User(String n, String c, String d){
        this.name = n;
        this.class_ = c;
        this.dep = d;
    }

    public String getClass_() {
        return class_;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public String getDep() {
        return dep;
    }

    public String getName() {
        return name;
    }

}
