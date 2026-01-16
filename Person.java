package firstProject;


public class Person {
	// Instance variables
	String name;
	int age;
	String city;
	double height ;
	   // Static variable 
	 static int totalPeople=0;
	 
	
		
	 public void DisplyingInfo() {
		 System.out.println("Name:" + name);
		 System.out.println("AGE:"+ age);
		 System.out.println("CITY:"+ city);
		 System.out.println("HEIGHT:"+ height);
		 
		 
	 }
 public void setHeight( double newheight) {
	 double oldHeight =  this.height;
	 // local variable 
	  this.height= newheight; 
	System.out.println(name+"s¨height changed  from "+ oldHeight + "to" + newheight );
}
 public void  haveBirthday() {
	 age++;
	 System.out.println( "Happy Birthday"+ name+ "you are now"+age+"year old.");
 }
 public void showTotalPeople() {
	 System.out.println( "Total nnumber of created:"+ totalPeople);
 }
	
 }
 


 
  
 
 
	


	
	
	


