import java.util.ArrayList;

public class CoinChange {

    public static void main(String[] args) {
        
        findMin(89);
    }
    

    static void findMin(int v){

        ArrayList<Integer> result = new ArrayList<>();

        int denominations[] = new int[]{1,2,5,10,20,50,100,500,1000}; 
        int n = denominations.length;

        for(int i = n-1 ; i > 0 ; i--){
            while(v>=denominations[i]){
                v -= denominations[i];
                result.add(denominations[i]);
            }
        }
        
      
            System.out.println(result);
        
    }
}