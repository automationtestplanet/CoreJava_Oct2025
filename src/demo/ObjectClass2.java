package demo;

public class ObjectClass2 {

	public static void displayValue(Object obj1) {
		System.out.println(obj1);
	}

	public static Object getValue(Object obj1) {
		return obj1;
	}

	public static void main(String[] args) {
		displayValue(100);
		displayValue(1000);
		displayValue(10000);
		displayValue(100000L);
		displayValue(100.5F);
		displayValue(100.354E54D);
		displayValue('A');
		displayValue("Hello");
		displayValue(true);
		
		System.out.println("-----------------------------");
		byte byte1 = (byte)((int)getValue(100));
		System.out.println(byte1);
		
		String str1 = (String)getValue("Java");
		System.out.println(str1);
		
		var str2 = getValue("Java");
		System.out.println(str2);
		System.out.println(str2.toString().toUpperCase());
		
		
	}

}
