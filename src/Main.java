import java.util.Scanner;

/**
 * Initializes program and manages inputs.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your budget.");
        while(!scanner.hasNextInt()) {
            System.out.println("Please enter your budget");
            scanner.next();
        }
        int budget = scanner.nextInt();

        FishSalesManager fishSalesManager = new FishSalesManager();
        fishSalesManager.printOffer(fishSalesManager.makeOffer(budget));

    }
}