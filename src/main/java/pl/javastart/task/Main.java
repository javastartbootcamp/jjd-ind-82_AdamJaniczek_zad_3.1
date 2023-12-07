package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Phone iphone = new Phone();
        iphone.model = "13mini";
        iphone.manufacturer = "Apple";
        iphone.colour = "red";
        iphone.weight = 130;

        Phone samsung = new Phone();
        samsung.model = "A54";
        samsung.manufacturer = "Samsung";
        samsung.colour = "black";
        samsung.weight = 190;

        System.out.printf("%s %s %s %d g.", iphone.model, iphone.manufacturer, iphone.colour, iphone.weight);
        System.out.println();
        System.out.printf("%s %s %s %d g.", samsung.model, samsung.manufacturer, samsung.colour, samsung.weight);
    }
}
