public class Calculator{

	public static void main(String[] args) {
	
	int one = 7;
	int two = 2;
	String sing = "%";

	switch(sing){
	case "+":
		int result = one + two;
		System.out.println(one + sing + two + "=" + result);
		break;
	case "-": 
		int result2 = one - two;
		System.out.println(one + sing + two + "=" + result2);
		break;
	case "*": 
		int result3 = one * two;
		System.out.println(one + sing + two + "=" + result3);
		break;
	case "/": 
		int result4 = one / two;
		System.out.println(one + sing + two + "=" + result4);
		break;
	case "^": 
		int result5 = one;
		for (int i = 1; i<two; i++) {
			result5 = result5 * one;
		}
		System.out.println(one + sing + two + "=" + result5);
		break;
	case "%": 
		int result6 = one % two;
		System.out.println(one + sing + two + "=" + result6);
		break;
	}

// 	public void plus(int onee, int twoo){
// int result = one1 + two2;
// System.out.println(onee + " + " + twoo + " = " + result);
// 	}
	}
}