import java.util.Scanner;

public class financial {

    public static void main(String[] args) {

        double subtotal, gratuity_rate, gratuity, total;

        Scanner sc = new Scanner(System.in);
        subtotal = sc.nextDouble();
        gratuity_rate = sc.nextDouble();

        gratuity = (gratuity_rate / 100.0) * subtotal;
        total = subtotal + gratuity;

        System.out.println("Gratuity = $" + gratuity);
        System.out.println("Total = $" + total);
    }
}
