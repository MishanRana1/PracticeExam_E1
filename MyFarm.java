import java.util.ArrayList;

public class MyFarm {

    public static void main(String[] args) {
        ArrayList<FarmAnimal> animals = new ArrayList<>();

        animals.add(new Duck("Donald", "male", 3.2, 5));
        animals.add(new Duck("Cheese", "female", 3.6, 5));
        animals.add(new Cow("Molly", "Female", 1600.0, 3));
        animals.add(new Chicken("Albert", "male", 1.8, 2));
        animals.add(new Chicken("Amelia", "female", 1.7, 4));
        animals.add(new Chicken("Dixie", "female", 1.7, 4));
        
        for(FarmAnimal animal : animals){
            System.out.println(animal);
        }
        
        for(FarmAnimal animal : animals){
            System.out.println(animal.getName() + ": " + animal.feedLoadingSchedule());
        }
    }
}