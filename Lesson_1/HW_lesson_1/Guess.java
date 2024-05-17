import java.util.Random;
import java.util.Scanner;

public class Guess{
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner console = new Scanner(System.in);

      	
		int randomNumber = rand.nextInt(100);

		while(true){
			int userNumber = console.nextInt();
			if (userNumber == randomNumber) {
				System.out.print("Число угадано");
				break;
			}else{
				if (randomNumber - userNumber > 0) {
					System.out.println("Число меньше ожадаемого");
						}else{System.out.println("Число больше ожадаемого");}
			}
		}

	}
}