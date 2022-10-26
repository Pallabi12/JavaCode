package firstcode;

public class DataTypeConcept {

	public static void main(String[] args) {

		// data types:
		// strict data type
		// 1. primitive data types: can be used directly inside the memory
		// no need to create any object
		// a. boolean type: boolean (true/false)
		// b. Numeric type:
		// b.1: character type: char
		// b.2: Integral type:
		// b.2.1: Integer: byte, short, int, long
		// b.2.2: floating-point: float, double

		// 2. non primitive data types: class, String, Array, interface, Abs class

		// 1. byte:
		// size: 1 byte = 8 bits
		// range: -128 to 127
		// 2x2x2x2x2x2
		byte b = 1;
		b = 10;
		System.out.println(b); // 10
		byte b1 = -10;

		// 2. short:
		// size: 2 bytes = 2x8 = 16 bits
		// range: -32768 to 32767
		short s = 10000;
		System.out.println(s);
		short s1 = 1;
		System.out.println(s1);

		// 3. int:
		// size: 4 bytes = 4x8 = 32 bits
		// range: -2147483648 to 2147483647
		// -2^32 to 2^32-1
		int i = 1212121;
		int p = 1;

		// 4. long:
		// size: 8 bytes = 8 x8 = 64 bits
		// range: -2^64 to 2^64-1
		long num = 88889898989l;
		System.out.println(num);
		long dis = 10;

		
		char sw = 'd';
		switch(sw) {
		case 'e':
			System.out.println("working as expected");
			break;
		case 'd': 
			System.out.println("second option");
			break;
		default:
			System.out.println("not working");
			break;
		}
		}
	}


