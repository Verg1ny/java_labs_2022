public class Cat extends Animal{
    public Cat(String food, String location){
        super(food, location);
    }

    private double timeOfSleep;

    @Override
    public void makeNoise() {
        System.out.println("Мяяу!");
    }

    @Override
    public void Eat() {
        System.out.println("Кот ест " + this.getFood());
    }
}
