import java.util.*;


public class oddeven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number");
        int i  = sc.nextInt();

        //int i = 10;
        if(i%2==0){
            System.out.println("The number is divisible by 2");

        }else{
            System.out.println("The number is not divisible by 2");
        }
    }
}
