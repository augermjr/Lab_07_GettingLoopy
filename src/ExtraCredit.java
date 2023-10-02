public class ExtraCredit {
    public static void main(String[] args) {
        for(int i = 0; i <= 5; i++) {
            System.out.printf("*".repeat(6));
            System.out.printf(" ".repeat(i));
            System.out.printf("*".repeat(6));
            System.out.printf(" ".repeat(5-i));
            System.out.printf(" ".repeat(5-i));
            System.out.printf("*".repeat(6));
            System.out.printf(" ".repeat(i));
            System.out.printf("*".repeat(6));
            System.out.printf("\n");
        }
    }
}
