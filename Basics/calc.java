import java.util.*;

public class calc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Basic Calculator");

        System.out.println("Choose a number a: ");
        int i = sc.nextInt();
        System.out.println("Choose a number b:");
        int j = sc.nextInt();

        System.out.println("Choose the Operator +,-,*,/");
        char operator = sc.next().charAt(0); // See it 
        switch(operator){
            case '+' : System.out.println("The Sum is : " + (i+j));
            break;
            case '-' : System.out.println("The Diff is : " + (i-j));
            break;
            case '*' : System.out.println("The product is : " + (i*j));
            break;
            case '/' : System.out.println("The division is : " + (i/j));
            break;
            default : System.out.println("Wrong Selection");
            break;
        }

    }
}
