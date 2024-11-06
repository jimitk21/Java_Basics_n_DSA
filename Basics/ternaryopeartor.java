public class ternaryopeartor {
    public static void main(String args[]){
        // Variable = cond1? statemtn1 : sttement2;
        // if statmnt 1 is true then that value get stores in the variable else stt 2 value 
        //gets stores in the variable
        //int larger = (5>3)? 5:3;
       // String type = (5%2==0)? "even": "odd";

        int number = 4;
        String value = (number%2)==0? "even":"odd";
        System.out.println(value);

        int marks = 30;
        String result = (marks>33)? "Pass":"Fail";
        System.out.println(result);
    }
}
