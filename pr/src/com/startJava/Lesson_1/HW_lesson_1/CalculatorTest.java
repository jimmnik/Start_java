import java.util.Scanner;

public class CalculatorTest{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calc = new Calculator();

		System.out.print("Калькулятор запущен!");

		String answer = "yes";	
		while(answer.equals("yes")) {
		System.out.print("Введите первое число: ");	
		int firstNumber = scanner.nextInt();
		calc.setFirstNumber(firstNumber);

		System.out.print("Введите знак мат. операции: ");
		char mathOperation = scanner.next().charAt(0);
		calc.setMathOperation(mathOperation);
		

		System.out.print("Введите второе число: ");
		int secontNumber = scanner.nextInt();
		calc.setSecontNumber(secontNumber);
		
		calc.calculete();

		System.out.print("Хотите продолжить? [yes/no]: ");
		answer = scanner.next();	
		}

		System.out.print("Калькулятор закрылся!");
	}
		
}