package testJava1;

import java.util.Arrays;

//import java.time.LocalDate;
//import java.util.Scanner;


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
//		////Arrays
//		int [] numbersForEach = new int[3]; // For single each
//		numbersForEach[0] = 8;
//		numbersForEach[1] = 6;
//		numbersForEach[2] = 4;
//		int [] numbers = {5, 6, 10, 13, 64, 3, 2, 19}; // For multiple 
////		boolean [] booleans = new boolean[3]; //  For single each
//		boolean [] booleans = { true, false, true};
////		String [] strings = new String[5]; //  For single each
//		
//		String [] strings = {"First", "Second", "Third", "Forth", "Fifth"};
//		
//		System.out.println(Arrays.toString(numbersForEach));
//		System.out.println(Arrays.toString(numbers));
//		System.out.println(numbers.length);
//		System.out.println(Arrays.toString(booleans));
//		System.out.println(Arrays.toString(strings));
//		
//		int varN = numbers[numbers.length - 1];
//		System.out.println(varN);
		
		
		
		////  Enhanced For Loop
//
//		int [] nums = {5, 6, 10, 13, 64, 3, 2, 19}; //  regular For Loop
////		for (int i = 0; i < nums.length; i++ ) {
////			System.out.println(nums[i +1 ]);//starting on naibor
////		}
//		
////		for (int num : nums) { //  Enhanced For Loop. Same thing.
////		System.out.println(num);
////	}
//		
//		Arrays.stream(nums).forEach(System.out::println); // Looping for loop using stream and forEach.
		
		
		
		////  Break and Continue
		
//		String [] strings = {"First", "Second", "Third", "Forth", "Fifth"};
//		for (String str: strings) {
////			if (str.equals("Third")) {
////				break;
////			}
//			if (str.startsWith("F")) {
//				continue;
//			}
//			System.out.println(str);
//		}
		
		
		////  While Loop
//		int x = 0;
//		while (x <= 13) {
//			System.out.println(x++);
//		}
		
		
//		////  Do While
//		int x = 1;
//		do {
//			System.out.println("X is " + x); ////executes at least once
//			x++;
//		}
//		while (x <= 13);
//		
		
//		////  Taking user input with the Scanner class
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("What's your name?");
//		String name = scanner.nextLine();
//		System.out.println("Your namer is " + name);
//		System.out.println("What's your favorite color?");
//		String color = scanner.nextLine();
//		System.out.println("Your favorite color is " + color);
//		System.out.println("What's your age?");
//		int age = scanner.nextInt();
//		int year = LocalDate.now().minusYears(age).getYear();
//		System.out.println("You were born in " + year);
//		
//		String ternaryAgeString = age >= 18 ? " and you are an adult" : " and you are not an adult";
//		System.out.println(ternaryAgeString);
		

	}
	
	public static int countLetters(char [] letters, char searchLetter) {
		int count = 0;
		for (char letter : letters) {
			if (letter == searchLetter) {
				count++;
			}
		}
		return count;
	}

}
