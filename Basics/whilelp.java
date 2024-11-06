import java.util.*;

public class whilelp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //int i = 0;
        /*while(i<101){
            System.out.println(i);
            i++;
        }*/
      //  int counter = 0;
      //  while(counter<11){
     //       System.out.println(counter);
      //      counter++;
      //  }


      // Print 1 to n 

        /*System.out.println("Choose a number n: ");
        int n = sc.nextInt();
        //System.out.println("Choose a number i: ");
        int i = 0;
        
        while(i<n){
            System.out.println(i);
            i++;
        }*/

        // Print SUm of first n natural number
        System.out.println("Choose the number where you have to print the sum: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n){
            sum +=i;
            i++;
           
        }
        System.out.println(sum);
    }
}
