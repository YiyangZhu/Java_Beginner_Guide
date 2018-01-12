class UpCase{
    public static void main(String[] args){
        char ch, sh;
        
        for(int i = 0; i < 27; i++){
            ch = (char)('a'+i);
            //95 and 223 work as well
            sh = (char)(ch & 65503);
            System.out.print(ch+" "+sh+"\t");
        }
    }
}