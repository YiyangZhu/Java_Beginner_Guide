public class ANDDemo{
    public static void main(String[] args){
        int t;
        byte val;
        //val = 123 = 1111011
        val = 123;
        //t1  = 128 = 1000 0000
        //t2 = 64 = 100 0000
        //t3 = 32 = 10 0000
        //t4 = 16 = 1 0000
        //t5 = 8 = 1000
        //t6 = 4 = 100
        //t7 = 2 = 10
        //t8 = 1 = 1
        //t9 = 1/2 = 0
        // outcome should be:0 1 1 1 1 0 1 1
        for(t = 128; t > 0; t = t / 2){
            if((val & t) != 0){
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
        System.out.println();
        
        int status = 8;
        for(int i = 0; i < 19; i++){
            if((i & 8)!= 0 ){
                // outcome should be: when i = 8,9,10,11,12,13,14,15, bit 4 is on
                // 8 = 1000, 9 = 1001, 10 = 1010, 11 = 1011, 12 = 1100, 
                //13 = 1101, 14 = 1110, 15 = 1111
                System.out.println("bit 4 is on when i = "+i);
            } else {
                System.out.println("bit 4 is off when i = "+i);
            }
        }
            
            
        if((status & 8) != 0) {
            System.out.println("bit 4 is on");
        }
        
    }
}