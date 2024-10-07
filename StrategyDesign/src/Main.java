public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Vehicle v=new NormalVehicle();
        v.drive();
        Vehicle v2=new SportsVehicle();
        v2.drive();
    }
}