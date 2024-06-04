public class Calculator{

	private int firstNumber;
	private int secontNumber;
	private char mathOperation;

	public void setFirstNumber(int firstNumber){
		this.firstNumber = firstNumber;
	}

	public void setSecontNumber(int secontNumber){
		this.secontNumber = secontNumber;
	}

	public void setMathOperation(char mathOperation){
		this.mathOperation = mathOperation;
	}

	private void pow(){
		int result5 = firstNumber;
		for (int i = 1; i<secontNumber; i++) {
			result5 = result5 * firstNumber;
		}
		System.out.println(firstNumber + "" + mathOperation + "" + secontNumber + "=" + result5);
	}


	public void calculete(){
		switch(mathOperation){
	case '+':
		int result = firstNumber + secontNumber;
		System.out.println(firstNumber + "" + mathOperation + "" + secontNumber + "=" + result);
		break;
	case '-': 
		int result2 = firstNumber - secontNumber;
		System.out.println(firstNumber + "" + mathOperation + "" + secontNumber + "=" + result2);
		break;
	case '*': 
		int result3 = firstNumber * secontNumber;
		System.out.println(firstNumber + "" + mathOperation + "" + secontNumber + "=" + result3);
		break;
	case '/': 
		int result4 = firstNumber / secontNumber;
		System.out.println(firstNumber + "" + mathOperation + "" + secontNumber + "=" + result4);
		break;
	case '^': 
		pow();
		break;
	case '%': 
		int result6 = firstNumber % secontNumber;
		System.out.println(firstNumber + "" + mathOperation + "" + secontNumber + "=" + result6);
		break;
	default:
		System.out.println("Ошибка");
		}
	}

}