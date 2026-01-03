
public class balancedString {

	public static void main(String[] args) {
               String str = "[(())]"; // Example string
               //TO Check the above string is Balanced or not!!
               boolean isbalance = true;
               int balance =0;
               for(char ch:str.toCharArray()) {
            	   if(ch == '[') {
            		   balance++;
            		   
            	   }
            	   if(ch == ']') {
            		   balance--;
            		   if(balance<0) {
            			   System.out.println("Not balanced String");
            			    isbalance = false;
            			    break;
            		   }
               }
               
            
		      
	}
	
	if(isbalance== true & balance==0) {
		System.out.println("Balanced String");
	}
}
}	  