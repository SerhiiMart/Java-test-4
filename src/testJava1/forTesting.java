package testJava1;

import java.util.Arrays;

public class forTesting {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
//		System.out.println("Printing something");
//		System.out.println("Something text 1");
//		System.out.println("Print me");
//		int result = 10;
//		result = result * 15;
//		++result;
//		if (result >= 4 &&  result != 10) {
//			System.out.println("Kinda True");
//		} else {
//			System.out.println(result);
//		}
		
		//// Побітові операції
//		int i = 10;
//		int n = i++;
//		int m = ++i;
//		System.out.println(n);
//		System.out.println(m);
		
		
		////Math
//		System.out.println(Math.abs(-50));
//		System.out.println(Math.max(4.5, 17.5));
//		System.out.println(Math.min(4.5, 17.5));
//		System.out.println((int)Math.pow(3.0, 2));
//		System.out.println((int)Math.sqrt(144));
//		System.out.println(Math.PI);
//		System.out.println(Math.toDegrees(6));
//		
		////Ternary operator in Java
//		int someVar = 20;
//		String messString = someVar >= 30 ? "Message 1" : "Message 2";
//		System.out.println(messString);
		
		  //Switch Statements
//		String dayOfTheWeek = "Friday";
//			switch (dayOfTheWeek) {
//			case "Saturday" :
//				System.out.println("Today is Saturday");
//				break;
//			case "Monday":
//				System.out.println("Today is Monday");
//				break;
//			case "Tuesday":
//				System.out.println("Today is Tuesday");
//				break;
//			case "Wednesday":
//				System.out.println("Today is Wednesday");
//				break;
//			case "Thursday":
//				System.out.println("Today is Thursday");
//				break;
//			case "Friday":
//				System.out.println("Today is Friday");
//				break;
//			default:
//				System.out.println("It's Sunday today");
//			}
		////Arrays
//		int [] numbers = new int[3]; // For single
//		numbers[0] = 8;
//		numbers[1] = 6;
//		numbers[2] = 4;
		int [] numbers = {5, 6, 10, 13, 64, 3, 2, 19}; // For multiple 
		boolean [] booleans = new boolean[3];
		String [] strings = new String[5];
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(booleans));
		System.out.println(Arrays.toString(strings));
	}

}
