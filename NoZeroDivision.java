public class NoZeroDivision{
    public static void main(String[] args){
        int a = 200;
        for(int i = 7; i >= -7; i--){
            int result = i == 0? 0 : 100 / i;
            if(result == 0){
                continue;
            }
            System.out.println(a+" / "+i+" = "+result);
        }
    }
}