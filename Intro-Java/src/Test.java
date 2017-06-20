
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var= "Hello world";
		String compare1 = "Hello world";
		String compare2 = "Hello world";
		System.out.println(var);
		System.out.println(compare1.compareTo(compare2));
		
		String strOrig = "Hello World, Hello Reader";
		int lastIndex = strOrig.lastIndexOf("Hello");
		
		if(lastIndex == - 1){
			System.out.println("Hello not found");
		} else {
			System.out.println("Last occurrence of Hello is at index "+ lastIndex);
		}
		String str = "Hello world";
		System.out.println(charRemoveAt(str, 7));
		
		System.out.println(var.replace('l', 'W'));
		System.out.println(var.replaceFirst("l", "W"));
		System.out.println(var.replaceAll("l", "W"));
		
		String input = var;
		StringBuilder input1 = new StringBuilder();
		input1.append(input);
		input1 = input1.reverse();
		for(int i=0; i<input1.length();i++)
			System.out.print(input1.charAt(i));
		
		System.out.println("");
		
		String testStr = "Hello world";
		String lookUp = "Hello";
		if (testStr.indexOf(lookUp) != -1)
		{
		 System.out.println("Found!");
		}
		
		String[] words = var.split(" ");
		for(String w:words) {
			System.out.println(w);
		}
		String strUpper = str.toUpperCase();
		System.out.println("Original String: " + str);
		System.out.println("String changed to upper case: " + strUpper);

	      String Str2 = new String("world");
	      String Str3 = new String("WORLD");

	      System.out.print("Return Value :" );
	      System.out.println(str.regionMatches(6, Str2, 0, 4));

	      System.out.print("Return Value :" );
	      System.out.println(str.regionMatches(6, Str3, 0, 4));
	      
	      long startTime = System.currentTimeMillis();
	      System.out.println(startTime);
	}
	public static String charRemoveAt(String str, int p) {
		return str.substring(0,p) + str.substring(p+1);
	}
}