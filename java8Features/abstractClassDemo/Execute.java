package abstractClassDemo;

class Execute{
	  public static void main(String[] args){
	    Branch mumbaiBranch=new MumbaiBranch();
	    mumbaiBranch.openAccount("pan card","ration card",2000);
	    
	    int a = 50;
	    int b= 100;
	    
	   a= a+b; //a=150
	   b=a-b; //b=50
	    a=a-b;
	    
	    System.out.println("a -> " + a + " " + "b ->" + b);
	  }
	}
