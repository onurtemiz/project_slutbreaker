import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LessonGenerator {
    private Random random = new Random();
    private String letters = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private int numberOfLessons;
    private List<String> actualLessons = new ArrayList<String>();

    public LessonGenerator(int n) {
        this.numberOfLessons = n;
    }

    public void createLessons() {
        List<String> randomLessons = new ArrayList<String>();
        for (int i = 0; i < numberOfLessons; i++) {
            randomLessons.add(getStrThree()+getIntThree());
        }
        this.actualLessons = randomLessons;
    }

    public String getStrThree() {
        String s = "";
        int t = random.nextInt(2);
        for (int i = 0; i < 3; i++) {
            if (t == 1 && s.length() == 2) {
                break;
            }
            s += letters.charAt(random.nextInt(this.letters.length()));

        }
        return s;
    }

    public String getIntThree() {
        String s = "";
        for (int i = 0; i < 3; i++) {
            s += random.nextInt(9);
        }
        return s;
    }

    public List<String> getLessons() {
        return this.actualLessons;
    }

}
