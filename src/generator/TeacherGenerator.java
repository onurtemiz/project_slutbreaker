package generator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TeacherGenerator {
    private List<String> names = new ArrayList<String>();
    private int numberOfTeachers;
    private Random random = new Random();
    private List<String> actualNames = new ArrayList<String>();
    public TeacherGenerator(int i) {
        createNames();
        numberOfTeachers = i;
    }

    public void createNames(){
        try {
            FileReader fileReader = new FileReader("/Users/onurtemiz/project_slutbreaker/src/babynames-clean.csv");
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                names.add(values[0]);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void createNewList(){
        List<String> randomNames = new ArrayList<String>();
        for (int i = 0; i < this.numberOfTeachers; i++){
            int randomInt = random.nextInt(this.names.size()) + 1;
            String name = this.names.get(randomInt);
            randomInt = random.nextInt(this.names.size()) + 1;
            String surname = this.names.get(randomInt);
            randomNames.add(name + " " + surname);
        }
        this.actualNames = randomNames;
    }

    public List<String> getNames(){
        return this.actualNames;
    }

}
