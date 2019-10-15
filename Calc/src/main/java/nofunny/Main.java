package nofunny;


import java.math.BigInteger;
import java.util.Scanner;


public class Main {

    static Scanner in = new Scanner(System.in);

    public static BigInteger get() {
        System.out.println("Enter operand");
        BigInteger a;
        if(in.hasNextBigInteger()){
            a = in.nextBigInteger();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            in.next();//рекурсия
            a = get();
        }
        return a;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(in.hasNext()){
            operation = in.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            in.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static BigInteger math(BigInteger a, BigInteger b, char operation) {
        BigInteger c = BigInteger.valueOf(0);
        switch (operation) {
            case '+':
                c = a.add(b);
                break;
            case '-':
                c = a.subtract(b);
                break;
            case '*':
                c = a.multiply(b);
                break;
            case '/':
                c = a.divide(b);
                break;
            default:
                System.out.println("Incorret action, repeat...");
                operation = getOperation();
                c = math(a, b, operation);
        }
        return c;
    }

    public static void main(String[] args){
        char operation;
        BigInteger a,b;
        BigInteger result;
        a = get();
        b = get();
        operation = getOperation();
        result = Main.math(a, b, operation);
        System.out.println("Result operation = " +result);

    }
}