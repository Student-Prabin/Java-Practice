/*
 * ============================================================================
 * JAVA STRINGS: NOTES & QUICK REFERENCE
 * ============================================================================
 *
 * 1. WHAT IS A STRING?
 *    - Sequence of characters enclosed in double quotes (" ")
 *    - Immutable in Java: once created, its value cannot be changed
 *
 * 2. WAYS TO CREATE A STRING
 *    - String Literal:
 *        String s1 = "Bishal";
 *    - Using 'new' keyword:
 *        String s2 = new String("Bishal");
 *
 * 3. COMPARING STRINGS & OBJECTS
 *    - equals() -> Checks CONTENT only when called on String (String overrides
 *                  Object.equals()). In classes that do NOT override equals()
 *                  (such as StringBuilder and StringBuffer), equals() inherits
 *                  Object.equals() behavior and checks REFERENCE / address.
 *    - ==       -> Checks REFERENCE (whether both variables point to the same
 *                  object in memory)
 *
 * 4. HEAP MEMORY vs. STRING CONSTANT POOL (SCP)
 *    - All objects in Java are stored in Heap memory, but String has special
 *      handling with the String Constant Pool (SCP) inside the heap.
 *
 *    Where objects are stored:
 *    - String literal ("...")      -> SCP
 *    - new String("...")           -> Heap (and SCP literal if not already there)
 *
 *    Example:
 *    - String s0 = "Prabin";              // Literal -> stored in SCP
 *    - String s1 = "Prabin";              // Literal -> reuses "Prabin" in SCP
 *    - String s2 = "Dahal";               // Literal -> stored in SCP
 *    - String s3 = new String("LBEF");    // Object in Heap + literal in SCP
 *    - String s4 = new String("College"); // Object in Heap + literal in SCP
 *
 *    Differences between Heap and SCP:
 *    +--------------------------+-------------------------------------------+-------------------------------------------+
 *    | Feature                  | Heap (new String(...))                    | String Constant Pool (SCP)                |
 *    +--------------------------+-------------------------------------------+-------------------------------------------+
 *    | Duplicate content        | Creates separate objects/references even  | Reuses/shares the same reference if       |
 *    |                          | if the string content is identical        | content is identical                      |
 *    +--------------------------+-------------------------------------------+-------------------------------------------+
 *    | Deletion / GC            | Eligible for garbage collection when      | Pool entries are retained (no manual/     |
 *    |                          | unreferenced                              | standard deletion like regular objects)   |
 *    +--------------------------+-------------------------------------------+-------------------------------------------+
 *    | Reassigning references   | Old unreferenced object becomes eligible  | Java manages pool references; existing    |
 *    |                          | for garbage collection                    | pooled literals remain intact             |
 *    +--------------------------+-------------------------------------------+-------------------------------------------+
 *
 * 5. STRING vs. STRINGBUILDER vs. STRINGBUFFER
 *    +--------------+------------+---------------------------------------------+
 *    | Class        | Mutability | Thread Safety                               |
 *    +--------------+------------+---------------------------------------------+
 *    | String       | Immutable  | Thread-safe (due to immutability)           |
 *    | StringBuffer | Mutable    | Thread-safe (methods are synchronized)      |
 *    | StringBuilder| Mutable    | Not thread-safe (faster in single thread)   |
 *    +--------------+------------+---------------------------------------------+
 */

public class StringNotesDemo {
    public static void main(String[] args) {
        // String literal vs. new keyword
        String s1 = "Bishal";
        String s2 = new String("Bishal");

        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true (checks content)
        System.out.println("s1 == s2: " + (s1 == s2));           // false (checks reference)

        // SCP & Heap example
        String s0 = "Prabin";
        String sLiteralDuplicate = "Prabin";
        String s2Dahal = "Dahal";
        String s3 = new String("LBEF");
        String s4 = new String("College");

        System.out.println("s0 == sLiteralDuplicate: " + (s0 == sLiteralDuplicate)); // true
        System.out.println("s2Dahal: " + s2Dahal);
        System.out.println("s3: " + s3);
        System.out.println("s4: " + s4);

        // Mutable alternatives: StringBuilder and StringBuffer
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        sb1.append(" World");
        System.out.println("StringBuilder sb1: " + sb1);
        System.out.println("sb1.equals(sb2): " + sb1.equals(sb2)); // false (reference check)

        StringBuffer sbf = new StringBuffer("Java");
        sbf.append(" Notes");
        System.out.println("StringBuffer: " + sbf);
    }
}