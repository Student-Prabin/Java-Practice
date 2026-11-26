class Calculation{	
		public void wish(){
			System.out.println("Hello, Good morning..");
		}
		void sum(){
			int a = 10, b= 15;
			int s = a+b;
			System.out.println("Sum of numbers is "+s);
			
		}
		public int average(int a, int b, int c){
			int A = (a+b+c/3);
			return A;
		}
}

class CalculationMainInstance{
	public static void main(String... args){
		Calculation c1 = new Calculation();
		c1.wish();
		c1.sum();
		System.out.println("Average is "+c1.average(10,20,30));
	}
}