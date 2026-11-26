class Dog{
	String name, color, breed;
	int age,leg,ear;
	
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
		System.out.println(d1.name);
		System.out.println(d1.leg);
		
	}
}