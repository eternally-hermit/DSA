public class intro{

    static void numberPrint(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        numberPrint(n-1);
    }
    public static void main(String[] args){
        numberPrint(5);
    }
}