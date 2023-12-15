import java.util.Scanner;

public class isPalindromeForNumber {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();

        System.out.println(isPalindrome(num));
    }

    public static Boolean isPalindrome(int nums){
        String num = String.valueOf(nums);
        System.out.println(num.length());
        String revNum = "";
        for(int i =num.length()-1; i>=0; i--){
            revNum = revNum + num.charAt(i);
            System.out.println(revNum);
        }
        System.out.println(revNum);
        if(num.equals(revNum)){
            return true;
        }
        return false;
    }
}
