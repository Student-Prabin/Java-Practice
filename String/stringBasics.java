// String:
// Sequence of characters enclosed in " " 
// ways of creation of string:
// 1. By using string literals
// 			String s1 = "Bishal";
// 2. By using new keyword
// 			String s2= new String("Bishal");

// equals()-----------> checks content
// == -----------------> checks reference 

// String is immutable in java-----------cant change the value

/*NOTE:: 
	    #######all Objects created in Java are stored in Heap memory 
		but String is the only object with sometimes get stored
		in scp{string constant pool} 
		

		#####Where objects get stored
		String literal ---> scp
		new ----> heap , scp
		
		#######example#########
		String s0 = "Prabin";------------------------- made with literal so stored in 
		String s1 = "Prabin";------------------------- made with literal so stored in 
		String s2 = "Dahal";------------------------- made with literal so stored in 
		String s3 = new String("LBEF");------------------------- made with literal so stored in 
		String s4 = new String("College");"------------------------- made with literal so stored in 
		
		#############DIFFERENCE BTW HEAP AND SCP
		******HEAP***************************************************************************SCP**********************
		1. If 2 string have same content then both gets stored			creates different reference even if the string content is same
			in the same variable
			
		2. Can write and delete											No concept of delete
		3. If a single variable has 2 different reference variables		If a single variable has 2 different references java internally manages 
			the one content gets deleted and new value is set			the reference (nothing gets deleted)
				
		
*/


