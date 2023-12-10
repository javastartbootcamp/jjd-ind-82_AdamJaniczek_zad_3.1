package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Phone iphone = new Phone("13mini", "Apple", "red", 120);
        Phone samsung = new Phone("A54", "Samsung", "black", 190);

        System.out.printf("%s %s %s %d g.", iphone.model, iphone.manufacturer, iphone.colour, iphone.weight);
        System.out.println();
        System.out.printf("%s %s %s %d g.", samsung.model, samsung.manufacturer, samsung.colour, samsung.weight);
    }
}
