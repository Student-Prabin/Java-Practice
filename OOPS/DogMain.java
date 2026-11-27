class Dog{
	String name="Tyson", color, breed;
	int age,leg=4,ear;
	static String tail="Yes";
	
	public void eat(){
		System.out.println("Dog is eating...");
			
		System.out.println("Dog is barkinging...");
	}
	public void sleep(){
		System.out.println("Dog is sleeping...");
	}
	public void bark(){
		System.out.println("Dog is barkinging...");
	}
	
}

class DogMain{
	public static void main(String... args){
		Dog d1 = new Dog();
		d1.name="Sheru";
		d1.color="Black";
		System.out.println(d1.name);
		System.out.println(d1.leg);
		d1.sleep();
		System.out.println(Dog.tail); // Static variable is part of class not object 
		
		
	}
}