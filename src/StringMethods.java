
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is a test string";
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Welcome";
		String str4 = "";
		String str5 = "      There are spaces at the beginning and end         ";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(8));
		
		System.out.println(str.concat(" This string is now being checked" ));
		
		System.out.println(str.contains("good"));
		
		System.out.println((str.startsWith("is")));
		
		System.out.println(str.endsWith("This"));
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str.indexOf('i'));
		
		System.out.println(str4.isEmpty());
		
		System.out.println(str5.trim());
		
		
	}

}
