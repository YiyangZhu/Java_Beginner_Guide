// Characters can be handled like integers.

public class CharArithDemo{
    public static void main(String[] args){
        char ch = 'X';
        System.out.println("After assigning 'X' to ch, ch contains "+ch);
        ch++;
        System.out.println("After ch++, ch contains "+ch);
        ch = 90;
        System.out.println("After assigning 90  to ch, ch contains "+ch);
        
        System.out.println("The follows is the conversion table of char and integers");
        for(ch = 0; ch <= 130; ch++){
            int i = ch;
            System.out.println("After assigning "+i+" to ch, ch contains "+ch);
        }
    }
}