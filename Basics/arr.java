import java.util.*;

public class arr {
    // Array:  
    // List of elements of the same type placed in contigous memory location
    // Operations on Array:
    // Create, Input, Output, Update

    // Creating an array
    // dataType arrayname[] = new dataType[size];
    // int marks[] = new int[50];
    // int numbers[] = {1,2,3};
    // Static Size: once declared then size cant be changed in runtime
    // String fruits[] = {"apple","mango"};

    public static void update(int marks[]){
        for(int i = 0; i<marks.length;i++){
            marks[i] = marks[i]+1;

        }
    }


    public static void main(String args[]){
        /*int marks[] = new int[10];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); //maths

        
        System.out.println("Physics :"+marks[0]);
        System.out.println("Chemistry :"+marks[1]);
        System.out.println("Maths :"+marks[2]);

       // marks[2] = 100 + 1;
        //System.out.println("Maths :"+marks[2]);
        float percent = (marks[0]+ marks[1]+ marks[2])/3;
        System.out.println("Your Percentage is  :"+ percent);
        
        System.out.println("Lenght of Array: "+ marks.length);*/

        int marks[] = {97,88,98};
        update(marks);
        // print our marks
        for(int i = 0 ; i <marks.length; i++){
            System.out.print(marks[i]+"");
        }

    }


}
