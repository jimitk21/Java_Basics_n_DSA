import java.util.Scanner;

public class fnx {
    public static void printHelloWorld(){
        System.out.println("Hello 1");
        System.out.println("Hello 2");
        System.out.println("Hello 3");
    }
    // Function ke andar method hota hai
    public static int printHello(){
        System.out.println("Aloha 1");
        System.out.println("Aloha 2");
        System.out.println("Aloha 3");
        return 3;
    }

    public static void main(String args[]){
        printHelloWorld();
        printHello();
    }
}
