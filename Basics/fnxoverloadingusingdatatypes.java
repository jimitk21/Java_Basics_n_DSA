public class fnxoverloadingusingdatatypes {
    // fnx overloadinf using data types
    // same fnx name but different data types;
    
    // func to calculate integr sum
    public static int sum(int a , int b){
        return a+b;
    }

    // func to calculate the float sum
    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3.4f, 2.5f));
        System.out.println(sum(10, 5));

    }
}
