class StringExample{
	public static void main(String... args){
		String s1 = "Bishal";
		String s2 = "Bishal";
		       s1 = "Patel";
		String s4 = new String("Bishal");
		String s5 = new String("Bishal");
		String s6 = new String("Lbef");
		       s4 = new String("College");
		
		System.out.println(s1==s2); // address
		System.out.println(s1.equals(s2)); // content
	}
}