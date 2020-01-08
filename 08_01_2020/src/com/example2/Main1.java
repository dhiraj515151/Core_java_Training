package com.example2;
public class Main1 {
    
    public static void main(String[] argv) {
        new Main1().doTheWork();
    }
    
    public void doTheWork() {
        Object o = null;
        
        for (int i=0; i<5; i++) {
        	
            try 
            {
                o = makeObj(i);
            } 
            
            catch (IllegalArgumentException e)
            {
            	e.printStackTrace();
            	
                System.err.println("IllegalArgumentException has caught: (" + e.getMessage() + ").");
                
                return;   
            }
            System.out.println(o);  
        }
    }
    
 
    public Object makeObj(int type) throws IllegalArgumentException {
        if (type == 1) 
            throw new IllegalArgumentException("Don't like type " + type);
        return new Object();
    }
}