import java.util.*;

public class fnxwithpara {
    public static void sum(int a,int b){
        
        int c = a+b;
        System.out.println(c);
    }
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a,b); // a and b are called argument;
        // function ke time argument call krte hai
        // Actual Paramter -> Arguments -> call time par aate hai woh
        // formal Parameter -> Parameters -> defination
    }
}
