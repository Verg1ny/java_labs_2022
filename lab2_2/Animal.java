public class Animal {
    private String food;
    private String location;
    public Animal(String food, String location){
        this.food = food;
        this.location = location;
    }
    public void makeNoise(){
        System.out.println("Какое-то животное изнаёт звук");
    }
    public void Eat(){
        System.out.println("Какое-то животное ест");
    }
    public void Sleep(){
        System.out.println("Животное спит");
    }
    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
