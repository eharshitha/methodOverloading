package methodOverloading;

public class Addition {
	
	
	  public int add(int a,int b) {
		  
		  
		  int r = a+b;
		  System.out.println(r);
		  return a+b;
		  
	  }
	  
	  public int add(int a,int b,int c) {
		  int r = a+b+c;
		  System.out.println(r);
		  return a+b+c;
		  
	  }
	  
	  public int add (int a,int b, int c, int d) {
		  int r = a+b+d+c;
		 
		  return r;
		 
	  }
	  


}
