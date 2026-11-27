/*
Class load hune bela execute hune block static block
It loads only once

*/
class Person{ // ya vako variable is instance variable
	String name;
	int age,id;
	
	Person(String name,int age, int id){ //ya vako variables are local variables
		this.name=name;//whicheever variable u use this keyword on jvm thinks tat variable as an instance variable
		this.age=age;
		this.id=id;//if instance variable and local variable are same it it give null or 0 so usins this.variable fixes it
	}
	{
		System.out.println("Object Created..........");//Instance Block
	}
	static {
		System.out.println("Static Block is here..........");//Static block
	}
	
	public void display(){
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("id: "+id);
	}
}

class StaticBlockNotes{
	public static void main(String... args){
		Person p1 = new Person("Roshan",23,102); //method made using class name is caled constructor;
		p1.display();
		Person p2 = new Person("Hari",23,103); 
		p2.display(); 
}
}