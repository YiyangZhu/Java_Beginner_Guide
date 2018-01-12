public class QDemo{
    public static void main(String[] args){
        Queue bigQ = new Queue(50);
        Queue smallQ = new Queue(6);
        char ch;
        int i;
        
        System.out.println("Using bigQ to store the alphabet.");
        for(i = 0; i < 26;i++){
            bigQ.put((char)('A'+i));
        }
        System.out.println("Contents of bigQ: ");
        for(i = 0; i < 26; i++){
            System.out.print(bigQ.get()+" ");
        }
        
        System.out.println("Using smallQ to generate errors.");
        for(i = 0; i < 7; i++){
            System.out.print("Attempting to store "+(char)('Z'-i));
            smallQ.put((char)('Z' - i));
            System.out.println();
        }
        
        System.out.println("Contents on smallQ: ");
        for(i = 0; i < 7;i++){
            System.out.print(smallQ.get()+" ");
        }
        System.out.println();
    }
}
    
    