import java.util.Scanner;

public class Swap {

    static void swapWiththreeVar(int a ,int b){
        int thirdVariable =0;
        thirdVariable = b;
        b =a;
        a=thirdVariable;
        System.out.println("Print the value of a " + a +" value of b " + b);
    }

    static void swapWithoutThirdVariable(int  a, int b){
        a = a+b;
        b= a -b;
        a = a - b;
        System.out.println("Print the value of a " + a +" value of b " + b);
    }
    public static void main(String[] args) {

        Scanner obj=  new Scanner(System.in);
        System.out.println("EnterFirstnumber");
        int a = obj.nextInt();
        System.out.println("EnterSecondNumber");
        int b = obj.nextInt();
        //swapWiththreeVar(a,b);
        swapWithoutThirdVariable(a,b);
    }
}
