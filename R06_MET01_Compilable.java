/******************************************************************************
 *  Rule06 - MET01
 *
 ******************************************************************************/ 

public class R06_MET01_Compilable{
    
    public static void main(String[] args){
        int a = 25;       
        System.out.println("a = " + a);       
        int b = 15;       
        System.out.println("b = " + b);       
        int c = getAbsAdd(a, b);       
        System.out.println("c = " + c);      
    }
    
    public static int getAbsAdd(int x, int y) { 
        assert x != Integer.MIN_VALUE;
        assert y != Integer.MIN_VALUE;
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        assert (absX <= Integer.MAX_VALUE-absY); 
        return absX + absY;
    }
    
}
