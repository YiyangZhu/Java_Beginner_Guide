public class ShiftDemo{
    public static void main(String[] args){
        int t;
        int b = 49;
        int c = b << 1;
        int d = b >> 1;
        System.out.println();
        System.out.print("b = 49; b is: \t");
        for(t = 128; t > 0; t /= 2){
            if((b & t) == 0){
                System.out.print(0);
            } else {
                System.out.print(1);
            }
        }
        System.out.println("\t\tThis is the original number.");
        System.out.print("c = b << 1; c is: \t");
        for(t = 128; t > 0; t /= 2){
            if((c & t) == 0){
                System.out.print(0);
            } else {
                System.out.print(1);
            }
        }
        System.out.println("\t\tThis is left shift.");
        System.out.print("d = b >> 1; d is: \t");
        for(t = 128; t > 0; t /= 2){
            if((d & t) == 0){
                System.out.print(0);
            } else {
                System.out.print(1);
            }
        }
        System.out.println("\t\tThis is right shift.");
    }
}