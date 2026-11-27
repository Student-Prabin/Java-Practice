class Calculation{
		public static void wish(){
			System.out.println("Hello, Good morning..");
		}
		static void sum(){
			int a = 10, b= 15;
			int s = a+b;
			System.out.println("Sum of numbers is "+s);
			
		}
		static public int average(int a, int b, int c){
			int A = (a+b+c/3);
			return A;
		}
}

class CalculationMainStatic{
	public static void main(String... args){
		//Calculation c1 = new Calculation();
		Calculation.wish();
		Calculation.sum();
		System.out.println("Average is "+Calculation.average(10,20,30));
	}
}