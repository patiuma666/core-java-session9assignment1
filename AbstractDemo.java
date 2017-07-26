/*here we are showing how the abstract class and abstract methods are used 
 * if we want to built something new for example mobile, in mobile if i build a feature called calling 
 * but i don't know how to implement camera,music. so here i implement the calling and i defined music,camera 
 * but failed to implement them so,we use abstract to define a method not for implementing them.
 */


package assignment9;        //i have created a package 

public class AbstractDemo {        //here i have created main class 
	public static void main(String[]args){  //here i have created main method 
		Mobile obj = new AndroidMobile();//here we cannot  instantiate the object class 
		                                 //so we create object of AndroidMobile which is not an abstract class
		obj.call();
		obj.camera();
		obj.flashlight();
		obj.music();
	}
}
    abstract class Mobile{            //a class is declared as abstract is known as abstract class
    	// here i have created a parent class .if we define abstract methods so that class must be an abstract class
    	public void call(){       //if i have created a method and i have declared it 
    		   System.out.println(" mobile features :calling.........");
    	   }
      public abstract void camera();               //here i have defined the abstract methods  
      public abstract void flashlight();
      public abstract void music();
       }

  class AndroidMobile extends Mobile{   //here i have extended the parent to the child class
	   public void camera(){                                              //here i have implemented them in this class
		   System.out.println("android mobiles has a feature : camera");
		   
	   }
	   public  void flashlight(){
		   System.out.println("android mobiles has a another feature : flashlight");  
	   }
	   public  void music(){
		   System.out.println("android mobiles has a one more feature : music");
	   }
   }


