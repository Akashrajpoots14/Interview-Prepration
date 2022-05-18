public class SumParametirzed {

    public static void main(String[] args) {
        sumPar(3,0);
    }
    static void sumPar(int i ,int sum){
        if(i<0){
            System.out.println("Sum is " + sum);
            return;
        }
        sumPar(i-1, sum+i);
    }
}