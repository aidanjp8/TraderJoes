import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Parser {
    public Food[] allFood = new Food[50];

    public Food[] fileParser() throws FileNotFoundException {
        //ArrayList<String> temp = new ArrayList<>();
        //File file = new File("C:\\Users\\Aidan\\IdeaProjects\\TraderJoes\\src\\foodCSV.txt");
        File file = new File("C:\\Users\\aidan\\IdeaProjects\\RecipeMaker\\out\\production\\RecipeMaker\\foodCSV.txt");
        Scanner sc = new Scanner(file);


        int i = 0;
        while (sc.hasNext()) {
            Food test = new Food();
            test.name = sc.next();
            test.type = sc.next();
            test.price = Double.parseDouble(sc.next());
            test.weight = sc.next();
            //test.calories = sc.next();
            allFood[i] = test;
            i++;
        }
        return allFood;
    }
}

class Food {

    public String name;
    public String type;
    public double price;
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
