import java.util.Scanner;

public class WaterBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter water consumption in litres: ");
        double consumption = input.nextDouble();

        int bill;
        if (consumption <= 500) {
            bill = 100;
        } else {
            bill = 200;
        }

        System.out.println("Water bill: Rs." + bill);
        input.close();
    }
}