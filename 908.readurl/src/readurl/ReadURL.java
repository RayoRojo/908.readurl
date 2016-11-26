package readurl;
//
/*Contents:
- Access web pages contents through URLResource. Iterables can be used: .lines(), .words()
  .asString(): returns the entire contents as one String; .getCSVParser().
- Manage StorageResource (from Duke); similar to arrays but easier, using .add() and
  size(); we can also use .clear(), .contains(item). See iterable below to print contents.
  Note: .contains() used below is not from the StorageResource method, it is from 
  the String method. 
- String method: using .indexOf(), .contains(); For other methods, review 909.readstrings
- Note: if(!unique.contains(w)) is equivalent to "not contains".
*/
import edu.duke.*;
//
public class ReadURL {
	//
	public static void main(String[] args) {
		URLResource rs = new URLResource("http://www.theclothespin.ca");
		StorageResource store = new StorageResource();
		System.out.println("Printing URLResource line by line through Iterable");
		for (String l : rs.lines()) {
 			//one way determine is "string" is present using indexOf
			int start = l.indexOf("http"); 
			if (start != -1)
			{
				System.out.println(l); 
				store.add(l);
			}
			// a second way using contains
			//if (l.contains("http")) {System.out.println(l);} 
			
		}
 		System.out.println("Number of elements in the StorageResource, size: " + store.size());
 		//Iterable to print contents of Storage Resource
 		System.out.println("Printing StorageResource contents through Iterable");
 		for (String link : store.data()) 
 		{
 			System.out.println(link);
 		}
	}

}
