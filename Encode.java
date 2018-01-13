public class Encode{
    public static void main(String[] args){
        String message = "This is a test.";
        String encodeMessage = "";
        String decodeMessage = "";
        int key = 66;
        
        System.out.println("The original message is: "+message);
        
        for(int i = 0; i < message.length();i++){
            char letter = (char)(message.charAt(i) ^ key);
            encodeMessage += letter;
        }
        
        System.out.println("The encoded message is: "+encodeMessage);
        
        for(int i = 0; i < encodeMessage.length();i++){
            char letter = (char)(encodeMessage.charAt(i) ^ key);
            decodeMessage += letter;
        }
        
        System.out.println("The decoded message is: "+decodeMessage);
    }
}
            