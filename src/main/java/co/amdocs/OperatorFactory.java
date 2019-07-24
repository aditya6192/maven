package co.amdocs;

public class OperatorFactory {
        
       public static Operation getOpearatorObject(String s) {
    	   Operation operation=null;
    	   
    	   switch(s.charAt(0)) {
    	   
    	   case '+':
    		        operation=new Add();
    		        break;
    	   case '-':
		        operation=new Sub();
		        break;
    	 
    	   
    	  }
    	   
    	   return operation;
    	   
    	   
       }
	
}
