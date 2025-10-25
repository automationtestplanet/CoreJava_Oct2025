package demo;

public class StringClass {

	public static void main(String[] args) {

		String string1 = "Hello";
		
		System.out.println(string1);
		
		System.out.println(string1.toUpperCase());
		
		string1 = string1.toUpperCase();
		
		System.out.println(string1);
		
		int a = 10;
		System.out.println(a);
		
		System.out.println(++a); 
		
		System.out.println(a);
		
		String string2 = "Hello";
		String string3 = "Hello";
		
		System.out.println(string2 == string3);
		
		String string4 = new String("Hello");
		System.out.println(string4);
		
		System.out.println(string2 == string4);        // Binary comparison  -> memory address will be compared
		System.out.println(string3 == string4);
		System.out.println(string3.equals(string4));   // value comparison
		System.out.println(string2.equals(string4));
		
		System.out.println(string2.hashCode());
		
		System.out.println(string3.hashCode());
		System.out.println(string4.hashCode());
		
		string3 = string3.toUpperCase();
		
		System.out.println(string2.toUpperCase());
		System.out.println(string2.toLowerCase());
		
		System.out.println(string2.equals("Hello"));
		System.out.println(string2.equals("hello"));
		System.out.println(string2.equalsIgnoreCase("hello"));
		
		char firstChar = string2.charAt(0);
		System.out.println(firstChar);
		System.out.println(string2.charAt(4));
		
		System.out.println(string2.length());
		
		System.out.println(string2.charAt(string2.length()-1));  // BODMAS  -> Brackets
		
		System.out.println(string2.indexOf("H"));
		System.out.println(string2.indexOf("o"));
		System.out.println(string2.indexOf("y"));
		
		System.out.println(string2.indexOf("l"));
		System.out.println(string2.lastIndexOf("l"));
		
		char[] charArr = string2.toCharArray();   // char[] charArr = {'H','e','l','l','o'}
		for(char eachChar: charArr) {
			System.out.print(eachChar+" ");
		}
		
		System.out.println("");
		
		String string5 = string2.concat(" Java");
		System.out.println(string5);
		
		String[] strArr = string5.split(" ");   // delimiter
		for(String eachStr: strArr)
			System.out.print(eachStr+" ");
		
		System.out.println("");
		
		System.out.println(string4.replace('H', 'F'));
		System.out.println(string4.replace('l', 'b'));
		System.out.println(string4.replaceFirst("l", "b"));
		
		System.out.println(string4.replaceAll("l", "b"));
		
		
		String string6  = "ahcksnAJJDCB264826&@*$^@";
		System.out.println(string6.replaceAll("[^a-zA-Z]", ""));
		System.out.println(string6.replaceAll("[^0-9]", ""));
		System.out.println(string6.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(string6.replaceAll("[a-zA-Z0-9]", ""));
		
		System.out.println(string6.substring(0, 6));
		System.out.println(string6.substring(6, 12));
		System.out.println(string6.substring(12, 24));
		System.out.println(string6.substring(12));
		
		
		
		char ch1 = string2.charAt(0);
		System.out.println(ch1);
		char ch2 = string2.charAt(1);
		System.out.println(ch2);
		
		char ch5 = string2.charAt(4);
		System.out.println(ch5);
		
		System.out.println(string2.length());
		
		System.out.println(string2.charAt(string2.length()-1));
	}

}

