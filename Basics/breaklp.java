import java.util.*;

public class breaklp {
    public static void main(String args[]){
         // break ststment: to exit the loop
        /*  for(int i = 0; i<=10;i++){
            if(i==3){
                break;

            }
            System.out.println(i);
         }
         System.out.println("I am out of the loop");*/

        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter your number");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
        }while(true);

    }
}
