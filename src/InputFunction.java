import java.util.Scanner;
public class InputFunction {
    public static void main (String[] args){
        int i;
        int j;
            Scanner s= new Scanner(System.in);
            System.out.println("Please enter First number ::");
            i= s.nextInt();
            System.out.println("Please enter Second number ::");
            j= s.nextInt();
            System.out.println("Multiplication of Integers = " + i +"*"+ j +" ="+i * j);
    }
}
