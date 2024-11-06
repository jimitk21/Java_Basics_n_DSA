public class reversenumber{
    public static void main(String args[]){
        // if we want last digit of any number we will take modulo of the number with 10
        // if we want to remove any digit from last we will divide it with 10

       /* int n = 10899;
        while(n>0){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n/10;
        }
        System.out.println();*/ 
        int rev = 0;
        int n = 10899;
        while(n>0){
            int lastDigit = n%10;
            rev = (rev*10) + lastDigit;
            n = n / 10 ;
        }
        System.out.print(rev);
        
    }
}