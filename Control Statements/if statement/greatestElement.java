// WAP to take 3 input from the keyboard and find the greatest element 

class GreatestElement{
		public static void main(String args[]){
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);
			
			if((a > b) && (a > c)){
			System.out.println(a+" is the greatest element");
			}else if((b > a) && (b > c)){
			System.out.println(b+" is the greatest element");
			}else{
				System.out.println(c+" is the greatest element");
			}
		}
}