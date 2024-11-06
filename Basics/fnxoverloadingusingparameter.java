public class fnxoverloadingusingparameter {
    // Function Overloading
    // Multiple function with same name with different parameter
    // does not depend on return type
    // depend only parameter

    // same func name more paramters
    //func to calculate sum of two number
    public static int sum(int a, int b){
        return a+b;
    }


    // func to calculate sum of two numbers
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String args[]){
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
    }


}
