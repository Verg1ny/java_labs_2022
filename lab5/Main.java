import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("One", "Один");
        map.put("Two", "Два");
        map.put("Three", "Три");
        System.out.println(map);

        Scanner sc = new Scanner(System.in);
        String login = sc.nextLine();
        String password = sc.nextLine();


        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (login == key && password == value){
                User user = new User(login,password);
                break;
            } else {
                User user = new User();
            }
        }
        Product огурец = new Product("Огурец");
        Product помидор = new Product("Помидор");

        Product[]  овощи = {огурец, помидор};
        Category category1 = new Category("Овощи", овощи);

        Product молоко = new Product("молоко");
        Product сыр = new Product("сыр");

        Product[]  молочные = {молоко, сыр};
        Category category2 = new Category("Молочные", молочные);
        Category[] all = {category2, category1};

        category2.getCategory();
        category1.getCategory();


        Basket basket = new Basket(молочные);
        basket.getBasket();
        basket.buyBasket();

    }

    public static void tovari(Product[] a,Product[] b,Product[] c,Product[] d){

    }
}

class User{
    String login;
    String password;

    public User(String login, String password){
        this.login = login;
        this.password = password;
    }

    public User(){
        this.login = "";
        this.password = "";
    }

}

class Product {
    String nameProduct;

    Product(String nameProduct) {
        this.nameProduct = nameProduct;
    }
}

class Category {
    String nameCategory;
    Product[] products;

    Category(String nameCategory, Product[] products) {
        this.nameCategory = nameCategory;
        this.products = products;
    }

    public void getCategory(){
        System.out.println(nameCategory);
        System.out.println(products[0].nameProduct);
        System.out.println(products[1].nameProduct);
    }
}


class Basket {
    Product[] purchased;

    Basket(Product[] purchased) {
        this.purchased = purchased;
    }

    public void getBasket(){
        System.out.println("В корзине: ");
        for(int i = 0; i<purchased.length;i++){
            System.out.println(purchased[i].nameProduct);
        }
    }

    public void buyBasket(){
        System.out.println("Вы купили: ");
        for(int i = 0; i<purchased.length;i++){
            System.out.println(purchased[i].nameProduct);
        }

    }
}
