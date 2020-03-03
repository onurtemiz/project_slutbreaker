package sluts;

import pages.Page;

public class Comment {
    private User user;
    private Page page;

    public Comment (User u, Page p){
        this.user = u;
        this.page = p;
    }

    public Page getPage() {
        return page;
    }

    public User getUser() {
        return user;
    }
}
