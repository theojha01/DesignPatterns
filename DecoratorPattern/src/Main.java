public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        BasePizza basePizza=new ExtraCheese(new MargheritaPizza(null));
        int xc= basePizza.cost();
        System.out.println("Cost"+xc);
    }
}