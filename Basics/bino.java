public class bino {
    public static int binCoeff(int n,int r){
            int fact_n = factorialfnx(n);
            int fact_r = factorialfnx(r);
            int fact_nmr = factorialfnx(n-r);

            int binCoeff = fact_n / (fact_r*fact_nmr);
            return binCoeff;

    }


    public static int factorialfnx(int n){
        int f = 1;
        for (int i = 1; i<=n;i++){
            f=f*i;
            
        }
        return f;
    }

    
    
    public static void main(String args[]){
        System.out.println(binCoeff(5, 2));
    }
}
