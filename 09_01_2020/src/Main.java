public class Main {
    
    static int count = 0;
    
    public static void main(String[] args) {
        while(true) {
        	
            try 
            {
              
                if (count++ == 0)
                    throw new MyException("Exception Occured..");
            }
            
            catch (MyException e)
            {
                e.printStackTrace();// exception handler
            } 
            finally 
            {
                System.out.println("In finally clause");
                if (count == 2)
                    break; 
            }
        }
    }
} 