import java.util.Scanner;
class ScannerExample1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first value");
		int a = sc.nextInt();
		System.out.println("Enter first value");
		int b = sc.nextInt();
		System.out.println("Sum of " + a + " and " + b + " is " + (a+b));
	}
}

