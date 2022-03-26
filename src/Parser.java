import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Parser {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(Arrays.toString(fileParser()));
    }
    public static Food[] fileParser() throws FileNotFoundException {
        ArrayList<String> temp = new ArrayList<>();
        File file = new File("C:\\Users\\aidan\\IdeaProjects\\RecipeMaker\\src\\foodCSV.txt");
        Scanner sc = new Scanner(file);

        Food[] temp = new Food[50];
        int i = 0;
        while (sc.hasNext()) {
            Food test = new Food();
            test.name = sc.next();
            test.type = sc.next();
            test.price = sc.next();
            test.weight = sc.next();
            //test.calories = sc.next();
            temp[i] = test;
            i++;
            if (i == 8) {
                System.out.println();
            }
        }
        return temp;
    }
}

class Food {

    public String name;
    public String type;
    public String price;
    public String weight;
    public String calories;

    public Food() {
        this.name = name;
        this.type = type;
        this.price = price;
        this.weight = weight;
        this.calories = calories;
    }
}
