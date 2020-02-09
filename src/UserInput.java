import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.print("Input first No.::");
        int num1 = in.nextInt();
        System.out.print("Input second No.::");
        int num2 = in.nextInt();
        System.out.println("Multiplication of Integers = " + num1 +"*"+ num2 +" ="+num1 * num2);
        System.out.print(num1 * num2);
    }
}
