public class palindrome {
    public static void main(String[] args) {
        System.out.println(pali("madam",0));
    }
    static boolean pali(String s,int i ){
        if(i>= s.length()-1/2)
            return true;
        if (s.charAt(i)!=s.charAt(s.length()-1-i)) {
            return false;
        }
        return pali(s, i+1);
    }
}
