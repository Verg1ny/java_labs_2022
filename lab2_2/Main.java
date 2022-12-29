import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Animal> animals = new ArrayList<>();
    static {
        animals.add(new Cat("Рыба ", "1"));
        animals.add(new Dog("Косточки ", "2"));
        animals.add(new Horse("Овёс ", "3"));
    }

    public static void main(String[] arg){
        Veterinarian veterinarian = new Veterinarian();
        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
