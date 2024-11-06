import java.util.*;

public class linearsearch {
    public static int LinearSearch(int numbers[], int key){
        for (int i = 0;i<numbers.length;i++){
            return i;
        }

        return -1;
    }


    public static void main(String args[]){
        int number[] =  {1,2,3,4,5,6,7,8,9,0};
        int key = 3;

        int index = LinearSearch(number, key);
        if(index == -1){
            System.out.println("Not FOund");
        }else {
            System.out.println("Key is at index: "+index);
        }
    
    }
}
