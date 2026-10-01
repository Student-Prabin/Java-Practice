// WAP to take input from the keyboard and display week days on the give number.
class WeekDayCheck{
		public static void main(String args[]){
			int a = Integer.parseInt(args[0]);
			if(a == 1){
			System.out.println("Sunday");
			}else if(a==2){
				System.out.println("Monday");
			}else if(a==3){
				System.out.println("Tuesday");
			}else if(a==4){
				System.out.println("Wednesday");
			}else if(a==5){
				System.out.println("Thursday");
			}else if(a==6){
				System.out.println("Friday");
			}else if(a==7){
				System.out.println("Saturday");
			}else{
				System.out.println("Please enter numbers from 1-7 only");
			}
		}
}