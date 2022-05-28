package homework;

public class tendiffstringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String Methods -length
		String text1 = "What is my length";
		String text2 = "I am bigger than text1";
		System.out.println("My lenght is :" + text1.length());
		System.out.println("I am bigger- my lenght is: " + text2.length());	
//		toUpperCase:
		String uppercase = "I need to put some extra effort to learn Java.";
		System.out.println(uppercase.toUpperCase());
	// toLowerCase:
		String lowercase = "I WILL DEFINETELY SUCCEED IN LEARNING JAVA.";
		System.out.println(lowercase.toLowerCase());
	// indexOf
		String findme = "Pls indentify me where I am located-'I'.";
		System.out.println(findme.indexOf("I"));
//		Concat
		String greet = "Hello!! Good Morning!!!";
		String whom  = "Keerthi kotturu.";
	    String combine = greet.concat(whom);
		System.out.println(combine);	
//		replace
	    System.out.println(combine.replace(whom, combine));
//	    Why output is hsowing still Keerthi kotturu?
	    System.out.println(combine.replace(whom, combine).length());
//	    contains
	    String kirti = "I am learning Java to ace in interview.";
	    System.out.println(kirti.contains("ace"));
	    System.out.println(kirti.contains("learnt"));
//	    endsWith and startsWith
	    String name = "My Name is KeerthiKotturu";
	    System.out.println(name.endsWith("u"));
	    System.out.println(name.startsWith("name"));
//	    compareTo
	    String A1 = "Hi";
	    String A2 = "Hello";
	    String A3 = "Pollo";
	    String A4 = "hi";
	    String A5 = "Hello";
	    System.out.println(A1.compareTo(A4));
	    System.out.println(A2.compareTo(A5));
	    System.out.println(A2.compareTo(A3));
	}

}
