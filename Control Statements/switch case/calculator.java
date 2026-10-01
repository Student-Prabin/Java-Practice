// WAP to input any two numbers from the keyboard and 
//calculate arithmetic operations based on given operators
class Calculator{
		public static void main(String args[]){
			double a = Double.parseDouble(args[0]);
			char b = args[1].charAt(0);
			double c = Double.parseDouble(args[2]);
			
			switch(b){
				case '+':System.out.println(a + c);
						break;
				case '-':System.out.println(a - c);
						break;
				case '*':System.out.println(a * c);
						break;
				case '/':System.out.println(a / c);
						break;
				case '%':System.out.println(a % c);
						break;
				default: System.out.println(" type in a + b format");
					
			}
		}
}