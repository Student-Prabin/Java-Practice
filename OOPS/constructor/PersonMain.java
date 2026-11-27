class Person{
	String name;
	int age,id;
	/*Person(){
		name="Tyson";
		age=12;
		id=101;
	}*/
	Person(String n,int a, int i){
		name=n;
		age=a;
		id=i;
	}
	
	public void display(){
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("id: "+id);
	}
}

class PersonMain{
	public static void main(String... args){
		Person p1 = new Person("Roshan",23,102); //method made using class name is caled constructor;
		p1.display();
		Person p2 = new Person(); //error falxa why: because we have not defined the default constructor, we have already made a parameter constructor so jvm wont make its own default constructor 
		p2.display();
	}
}