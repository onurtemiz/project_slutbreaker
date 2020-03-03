import generator.FakeRegistration;
import pages.LessonPage;
import sluts.User;

public class Main {

    public static void main(String[] args) {
        FakeRegistration reg = new FakeRegistration(20,20);
        reg.createRegistration();

        User u = new User("Mehmeht","FLED","EF");

        u.comment(LessonPage.getLessonPages().get(0),"Annen");

        System.out.println(u.getComments());
        System.out.println(LessonPage.getLessonPages().get(0).getComments());
    }
}
