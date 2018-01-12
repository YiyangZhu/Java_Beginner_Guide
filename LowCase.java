public class LowCase{
    public static void main(String[] args){
        char ch, sh;
        for(int i = 0; i < 26; i++){
            ch = (char)('A'+i);
            // as UpCase letter is exactly 32 smaller than LowCase
            // use 32 to turn on the 6th binary position
            // UpCase + 32 = LowCase, example: A + 32 = a
            sh = (char)(ch | 32);
            System.out.println(ch+" "+sh);
        }
    }
}