package sluts;

import pages.Page;

public class Comment {
    private User user;
    private Page page;
    private String message;

    public Comment (User u, Page p, String m){
        this.user = u;
        this.page = p;
        this.message = m;
    }

    public Page getPage() {
        return page;
    }

    public User getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }

    public String toString(){
        return message;
    }
}
