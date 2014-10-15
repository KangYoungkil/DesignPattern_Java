//Singleton.java
package classic;
public class Singleton {
   private Singleton(){
     System.out.println("Creating instance");
   }
   private static Singleton uniqueInstance;
   public static Singleton getInstance() {
     if (null == uniqueInstance){
    	 uniqueInstance = new Singleton();
     }
     return uniqueInstance; 
   }
}
