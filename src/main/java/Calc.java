import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        double num1=scanner.nextDouble();
        double num2;
        double result;
        char symbol;
        System.out.println("Enter second number");
        num2=scanner.nextDouble();
        System.out.println("Enter symbol of operation");
        symbol=scanner.next().charAt(0);
        switch (symbol) {
            case '+':
                result=CalcUtil.sum(num1, num2);
                System.out.println(result);
            break;
            case '-':
                result=CalcUtil.sub(num1, num2);
                System.out.println(result);
            break;
            case '*':
                result=CalcUtil.mupliplic(num1, num2);
                System.out.println(result);
            break;
            case '/':
                if (num2 != 0) {
                    result = CalcUtil.div(num1, num2);
                    System.out.println(result);
                } else {
                    System.out.println("Division by 0 is prohibited");
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = CalcUtil.percent(num1, num2);
                    System.out.println(result);
                } else {
                    System.out.println("Unable to calculate percent when second number is 0");
                }
                break;
            default:
                System.out.println("Error");
                System.exit(0);
                break;
        }
    }
}
