package demo;

public class WrapperClasses {

	public static void main(String[] args) {
		byte byte1 = 100;
//		String str1 = byte;    // primitive to non-primitive is not possible
		String str2 = "100";
//		byte1 = str2;        from Non-primitive to primitive is not possible
		
		Byte byte2 = byte1;  // primitive to non-primitive is not possible
		Byte byte3 = 100;
		byte1 = byte3;
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		int int1 = 100;
		Integer int2 = 200;
		int2 = int1;
		int1 = int2;
		
		int a = 10;
		int b = 20;
		
		a=b;
		b=a;
		
		System.out.println("--------------String to Primitive--------------");
		
		String str = "100";      // Non primitive datatype
		System.out.println(str);
		
		int int3 = Integer.parseInt(str); //Wrapper class to convert Non-primitive to primitive
		byte byte4 = Byte.parseByte(str);
		short short4 = Short.parseShort(str);
		
		long lng4 = Long.parseLong(str);
		float float4 = Float.parseFloat(str);
		double double4 = Double.parseDouble(str);
		
		String str1 = "Hello";
//		int integer1 = Integer.parseInt(str1);  // Error Number format error
		
		String string1 = "true";
		boolean bool2 = Boolean.parseBoolean(string1);
		System.out.println(bool2);
		
		String string2 = "false";
		boolean bool3 = Boolean.parseBoolean(string2);
		System.out.println(bool3);
		
		String string3 = "Hello";
		boolean bool4 = Boolean.parseBoolean(string3);
		System.out.println(bool4);  // No Error but false
		
		
		System.out.println("--------------Primitive to String--------------");
		int int4 = 200;
		String str3 = String.valueOf(int4);// String class to convert primitive to non-primitive
		byte byte5 = 121;
		String str4 = String.valueOf(byte4);
		short short5 = 1001;		
		String str5 = String.valueOf(short4);
		long long5 = 10001;
		String str56 = String.valueOf(long5);
		float float5 = 100.5F;
		String str7 = String.valueOf(float5);
		double double5 = 100.345D;
		String str8 = String.valueOf(double5);		
		
	}

}
