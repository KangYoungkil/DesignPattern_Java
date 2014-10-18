//Singleton.java
package classic;
public class Singleton {
	private final static int  SIZE = 5;
	   private static Singleton []uniqueInstance;
   private Singleton(){
     System.out.println("Creating instance");
   }
   public static Singleton getInstance(int n) throws MyException {
	   if(0>n || SIZE<5)
	      throw(new MyException("SIZE error"));
     if (null == uniqueInstance){
    	 uniqueInstance = new Singleton[SIZE];
     }
     if(uniqueInstance[n] == null)
     {
    	 uniqueInstance[n] = new Singleton();
     }
     return uniqueInstance[n]; 
   }
}
