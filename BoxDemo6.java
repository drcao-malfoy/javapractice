// Java Program to illustrate calling a 
// no-argumenructor 

class Geek 
{ 
	int num; 
	String name = "what the shit"; 

	// this would be invoked while an object 
	// of that class is created. 
	Geek() 
	{ 
		System.out.println("Constructor called"); 
	} 
} 

class BoxDemo6 
{ 
	public static void main (String[] args) 
	{ 
		// this would invoke default constructor. 
		Geek geek1 = new Geek(); 

		// Default constructor provides the default 
		// values to the object like 0, null 
		System.out.println(geek1.name); 
		System.out.println(geek1.num); 
	} 
} 
