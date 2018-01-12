public class Block{
    int a,b,c;
    int volume;
    
    public Block(int i, int j,int k){
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }
    
    public boolean sameBlock(Block ob){
        if((ob.a == this.a)&&(ob.b==this.b)&&(ob.c==this.c)){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean sameVolume(Block ob){
        if(this.volume == ob.volume){
            return true;
        } else {
            return false;
        }
    }
    
}