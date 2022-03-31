import java.util.Scanner;

    public class question7 {
        public static void main() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int n1 = in.nextInt();
            System.out.println("Enter second number: ");
            int n2 = in.nextInt();
            System.out.println("Enter third number: ");
            int n3 = in.nextInt();
            System.out.println("Choices: ");
            System.out.println("1) Largest number");
            System.out.println("2) Smallest number");
            System.out.println("Enter number corresponding to your choice: ");
            int choice = in.nextInt();
            in.close();
            switch(choice) {
                case 1:
                    int largest = Math.max(n1, Math.max(n2, n3));
                    System.out.printf("Largest : %d", largest);
                    break;
                case 2:
                    int smallest = Math.min(n1, Math.min(n2, n3));
                    System.out.printf("Smallest : %d", smallest);
                    break;
            }
        }
    }

