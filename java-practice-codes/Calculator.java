import java.util.*;

class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome tO our Calculator");

        Scanner sc = new Scanner(System.in);
        System.out.print("input first digit: ");
        double a = sc.nextDouble();
        System.out.print(" Valid Operation ( +, -, *, /, %): ");
        char b = sc.next().charAt(0);
        System.out.print("input next digit: ");
        double c = sc.nextDouble();
        double d = 0;
        boolean ValidOperation = true;
        switch (b) {
            case '+':
                d = a + c;
                break;
            case '-':
                d = a - c;
                break;
            case '*':
                d = a * c;
                break;
            case '/':
                if (c != 0) {
                    d = a / c;
                } else {
                    System.err.println("Error: Division by Zero not allowed!!");
                }
                break;
            case '%':
                d = a % c;
                break;
            default:
                System.out.println("Invalid input!!");
                ValidOperation = false;
                break;
        }
        if (ValidOperation) {
            System.out.println("Calculations Result: " + d);
        }

    }
}