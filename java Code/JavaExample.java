public class JavaExample{
   public static void main(String args[]) {
	String mystring = new String("Lets Learn Java");
	/* The index starts with 0, similar to what we see in the arrays
	 * The character at index 0 is s and index 1 is u, since the beginIndex
	 * is inclusive, the substring is starting with char 'u'
	 */
	System.out.println("substring(1):"+mystring.substring(1));
		
	/* When we pass both beginIndex and endIndex, the length of returned
	 * substring is always endIndex - beginIndex which is 3-1 =2 in this example
	 * Point to note is that unlike beginIndex, the endIndex is exclusive, that is 
	 * why char at index 1 is present in substring while the character at index 3 
	 * is not present.
	 */
	System.out.println("substring(1,3):"+mystring.substring(1,3));
   }
}