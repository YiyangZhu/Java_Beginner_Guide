class UpCase{
    public static void main(String[] args){
        char ch, sh;
        
        for(int i = 0; i < 10; i++){
            ch = (char)('a'+i);
            sh = (char)(ch & 65503);
            System.out.print(ch+" "+sh+"\t");
        }
    }
}