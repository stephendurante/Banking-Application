
public class isEven {

    public static void main(String[] args) {

        String even = new String("true");
        String odd = new String("false");

        for (int n = 1; n <= 100; n++) {
            if (isEven(n)) {
                System.out.println(n + " = " + even);
            } else {
                System.out.println(n + " = " + odd);
            }
        }

    }
    public static boolean isEven(int n){
        if((n % 2) == 0) {
            return true;
        }else {
            return false;
        }
    }



}
