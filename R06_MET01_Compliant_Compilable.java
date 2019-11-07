/******************************************************************************
 *  Rule06 - MET01
 *  Compliant
 ******************************************************************************/ 

public class R06_MET01_Compliant_Compilable{
    
    public static void main(String[] args){   
        
        int a = Integer.MIN_VALUE; 
        System.out.println("a = " + a);
        int b = Integer.MAX_VALUE;
        System.out.println("b = " + b); 
        int c = getAbsAdd(a, b); 
        System.out.println("c = " + c);
    }
    
    public static int getAbsAdd(int x, int y) {
        if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
            throw new IllegalArgumentException ();
        }
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        if (absX>Integer.MAX_VALUE-absY){
            throw new IllegalArgumentException ();
        }
        return absX + absY ;
    }
    
}
