public class Phone {
    private String  number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone() {
    }
    public void receiveCall(String callerName) {
        System.out.println("Кто звонит " + callerName);
    }

    public void receiveCall(String callerName, String number) {
        System.out.println("Звонит " + callerName + " номер: " + number);
    }

//    public void receiveCall(String callerName, int number) {
//        System.out.println("Звонит " + callerName + " номер: " + number);
//    }

    public void sendMessage(String... numbers) {
        System.out.println("Кому отправить сообщения:");
        for (String number : numbers)
            System.out.println("\t" + number);

    }

    public String getNumber() {
        return number;
    }


    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }
}
