public class NotDemo{
    public static void main(String[] args){
        int t;
        int b = -41;
        
        for(t = 128; t > 0; t /= 2){
            if((b&t) == 0){
                System.out.print("0 ");
            } else{
                System.out.print("1 ");
            }
        }
        
        System.out.println();
        b= ~b;
        
        for(t = 128; t > 0; t /= 2){
            if((b&t) == 0){
                System.out.print("0 ");
            } else {
                System.out.print("1 ");
            }
        }
    }
}
            