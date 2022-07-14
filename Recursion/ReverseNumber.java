import java.util.Scanner;

public class ReverseNumber {

    static int recursionHelper(int num,int power){
        if(num == 0) return 0;
        int rem = num%10;
        int temp = (int)Math.pow(10,power);
        temp = rem*temp;
        return  temp+recursionHelper(num/10, power-1);
    }

    static int reverseNumber(int num){
        int power = 0;
        while(num!=0){
            num /= 10;
            power += 1;
        }

        int reversedNum = recursionHelper(num, power);
        return reversedNum;
    }

    static void reverse(int num){
        if(num == 0) return;
        System.out.print(num%10);
        reverse(num/10);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        System.out.println(reverseNumber(num));
        reverse(num);
        scn.close();
    }
}
