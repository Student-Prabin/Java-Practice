//WAP  to check if a person is eligible to vote or not


class ConditionalStatement{
		public static void main(String args[]){
			int a = Integer.parseInt(args[0]);
			if(a>=18){
			System.out.println("Eligible to vote ");
			}else{
				System.out.println("Not eligible to vote");
			}
		}
}