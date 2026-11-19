class EqualsExample{
	public static void main(String... args){
		StringBuilder s1 = new StringBuilder("Bishal");
		StringBuilder s2 = new StringBuilder("Bishal");
		
        String s3 = new String("Patel");	
		String s4 = new String("Patel");			
		
		System.out.println(s1.equals(s2)); 
		System.out.println(s3.equals(s4)); 
		
		
	}
}