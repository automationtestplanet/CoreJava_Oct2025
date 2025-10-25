package demo;

public class TypeConversions {

	static int division(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		
		System.out.println("--------------Primitive to priitive--------------");

		byte byte1 = 100;

		short short1 = byte1; // Implicit Conversion

		short short2 = 100;

		byte byte2 = (byte) short2; // Explicit Conversion

		byte byte3 = 127;
		short short3 = byte3;
		System.out.println(short3);

		short short4 = 200;
		byte byte4 = (byte) short4; // -128 to +127 ->
		System.out.println(byte4);

		short short5 = 130;
		byte byte5 = (byte) short5;
		System.out.println(byte5);
		
		byte result = (byte)division(100,100);
		
		byte byte6 = (byte)division(100,100);  //Explicit Conversion
		System.out.println(byte6);
		
		int int1 = 100;
		float float1 = int1;
		System.out.println(float1);
		
		float float2 = 100.9F;
		int int2 = (int)float2;
		System.out.println(int2);  // loss of data is 0.9
		
		System.out.println("--------------Non-Primitive to primitive--------------");
		
		String str = "200";      // Non primitive datatype
		System.out.println(str);
		
//		int int3 = (int)str; // Explicit Conversion from Non-primitive to primitive
		
		System.out.println("--------------Primitive to Non-primitive--------------");
		int int4 = 200;
//		String str2 = (String)int4;// Explicit Conversion from primitive to non-primitive
		
		
		
		

	}

}
