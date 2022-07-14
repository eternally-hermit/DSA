import java.util.Scanner;

public class SumofDigits{

    static int sumDigits(int num){
        if(num == 0) return 0;
        int rem = num%10;
        return rem + sumDigits(num/10);
    }

    static int productDigits(int num){
        if(num == 0) return 1;
        int rem = num%10;
        return rem*productDigits(num/10);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int sum = sumDigits(num);
        System.out.println(sum);
        System.out.println(productDigits(num));
        scn.close();
    }
}