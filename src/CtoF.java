import java.util.Scanner;
public class CtoF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String trash = "";
        int degC = 0;

        System.out.println("Input temperature in degrees Celsius: ");
        if (!in.hasNextInt()) { //check for valid input
            do {
                trash = in.nextLine();
                System.out.println("Invalid input, try again.\nInput temperature in degrees Celsius: ");
            } while(!in.hasNextInt());
            degC = in.nextInt();
        }
        else {
            degC = in.nextInt();
        }

        int degF = (degC * 9/5) + 32;
        System.out.println( degC + "°C is equivalent to " + degF + "°F");
    }
}