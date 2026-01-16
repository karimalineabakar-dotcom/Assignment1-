package firstProject;

public class PersonTest{
		public String name;
		public int age;
		public String city;
		public int height;


public static void main(String[] argS) {
	
	
	// create three Person Object
    System.out.println("====Creating three Person Objects===");
    Person p1 = new Person();
    p1.name= "jhon";
    p1.age=30; 
    p1.city="Kigali";
    p1.height=123;
    totalPeople++;
    
    p1.DisplyingInfo();

    
    Person p2 = new Person();
    p2.name= "Bob";
    p2.age=15; 
    p2.city="Miami";
    p2.height=190;
    totalPeople++;
    p2.DisplyingInfo();
  
      
    Person p3 = new Person();
    p3.name= "MIKE";
    p3.age=24; 
    p3.city="Kigali";
    p3.height=176;
     totalPeople++;
     p3.DisplyingInfo();
 
       System.out.println();
     
     // SHOW totalPerson
     Person.showTotalPeople();
     
     System.out.println("===Testing setHeight() Method===");
     p1.setHeight(123);
     p2.setHeight(190);
     System.out.println("Update p1 height:"+ p1.setHeight() + "cm");
     System.out.println("Update p2 height:"+ p2.setHeight() + "cm");
    
      System.out.println();
      
       // Test haveBirthday 
      System.out.println("=== Testing HaveBirthday() Method===");
      p1.haveBirthday();
      p2.haveBirthday();
     
      System.out.println();
      
        // use Loop to create 
      System.out.println("=== creating 5 additional Person with loop");
       for(int i=1; i<=5;i++) {
    	Person Person = Person();
    	Person name("Person" +i);
    	Person age(20 +i);
    	Person city ("city" + i);
    	Person.setHeight(160 + (i*2));
    	
    	Person.DisplyingInfo();
    	System.out.println();
    	// Displaying people
    	Person.showTotalPeople();
    	
       }
       

       
    
 
    

}

		
		
		}

