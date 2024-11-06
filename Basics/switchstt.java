public class switchstt {
    public static void main(String args[]){
        // SYtax
        
        int number = 2;
        switch(number){
            case 1 : System.out.println("Mango");
            case 2 : System.out.println("Apple");
            case 3 : System.out.println("Banana");
            case 4 : System.out.println("Guava");
            default : System.out.println("Fruit");
            // Will give output eveyrting after case 2 (so we need to add the break;)
        /* 
        
        int number = 2;
        switch(number){
            case 1 : System.out.println("Mango");
            break;
            case 2 : System.out.println("Apple");
            break;
            case 3 : System.out.println("Banana");
            break;
            case 4 : System.out.println("Guava");
            break;
            default : System.out.println("Fruit");*/
        }
    }
}
