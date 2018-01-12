public class BlockTest{
    public static void main(String[] args){
        Block ob1 = new Block(15,4,6);
        Block ob2 = new Block(15,4,6);
        Block ob3 = new Block(3,40,3);
        
        System.out.println("ob1 and ob2 have same dimensions: "+ob1.sameBlock(ob2));
        System.out.println("ob1 and ob3 have same dimensions: "+ob1.sameBlock(ob3));
        System.out.println("ob1 and ob3 have same volume: "+ob1.sameVolume(ob3));
    }
}