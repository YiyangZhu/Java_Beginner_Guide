public class Phone{
    public static void main(String[] args){
        String[][] numbers = {{"Taylor","566-6545"},{"John","789-6781"},
            {"Jack","345-7656"},{"Jenny","233-9000"}};
        int i;
        if(args.length != 1){
            System.out.println("Usage: java Phone name");
        } else {
            for(i = 0; i < numbers.length; i++){
                if(numbers[i][0].equals(args[0])){
                    System.out.println(numbers[i][0]+": "+numbers[i][1]);
                    break;
                }
            }
            if(i == numbers.length){
                System.out.println("Name not found.");
            }
        }
    }
}
        
        
