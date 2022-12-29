public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("88005553535", "Huawei", 345.3);
        Phone phone2 = new Phone("89999999999", "Nokia", 234);
        Phone phone3 = new Phone("84951111111", "iPhone", 3.3);

        System.out.println(phone1.getModel() + " " + phone1.getNumber() + " " + phone1.getWeight());
        System.out.println(phone2.getModel() + " " + phone2.getNumber() + " " + phone2.getWeight());
        System.out.println(phone3.getModel() + " " + phone3.getNumber() + " " + phone3.getWeight());

        phone1.receiveCall("Это я");
        phone1.receiveCall("Да да я", "88005553535");
        phone2.sendMessage("89999999999", "84951111111", "88005553535");

    }
}
