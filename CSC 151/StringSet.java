package Classes;

//import required package
	import java.util.ArrayList;

	

	/*StringSet extends ArrayList, making ArrayList the superclass and StringSet the subclass
	(StringSet more specialized class)*/
	public class StringSet extends ArrayList<String> {
			  
			/*no argument StringSet constructor creates an ArrayList object by calling the
			super class (which is ArrayList)*/
			   public StringSet() {
			       super();
			   }
			  
			   /*the pop method removes the last object in our ArrayList
			   we use "this" to refer to our StringSet object (which is an ArrayList)
			   we use the .remove and .size methods of the ArrayList class to remove
			   the value held in the last index of our ArrayList*/
			   public void pop() {
				   this.remove(this.size() - 1);
			   }
			  
			  /*we removed the add and size methods here because when acting on an ArrayList object,
			  we can directly call these in the tester class and they will work because we 
			  imported our ArrayList class*/
			   
			   
			   
			  /*the numChars method counts the number of characters in all of the strings contained
			  within our ArrayList. We use a for each loop to count the number of characters in each string*/
			   public int numChars() {
			       int count = 0;
			       for(String str: this) {
			           count += str.length();
			       }
			       return count;
			   }
			  
			   /*the countStrings method counts the number of strings that contain the
			   specified substring
			   we use a for each loop and the .contains method count each time a string
			   contains the specified substring*/
			   public int countStrings(String stringToLookFor) {
			       int count = 0;
			       for(String str: this) {
			           if(str.contains(stringToLookFor))
			               count++;
			       }
			       return count;
			   }

}
