import java.util.Scanner;

public class TotalWaterConsumption {
    static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter morning water usage in litres: ");
        int morningUsage = input.nextInt();

        System.out.print("Enter evening water usage in litres: ");
        int eveningUsage = input.nextInt();

        int total = calculateTotal(morningUsage, eveningUsage);
        System.out.println("Total water consumption: " + total + " litres");

        input.close();
    }
}