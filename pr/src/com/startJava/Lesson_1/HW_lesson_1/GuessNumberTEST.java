import java.util.Scanner;


public class GuessNumberTEST{
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Введите имя первого игрока ");
		String name1 = console.nextLine();
		Player player1 = new Player(name1);
		System.out.println(player1.getName());

		System.out.print("Введите имя второго игрока ");
		String name2 = console.nextLine();
		Player player2 = new Player(name2);
		System.out.println(player2.getName());

		GuessNumber game = new GuessNumber(player1, player2);
		String answer = "yes";

		while("yes".equals(answer)){
			game.Start();

			System.out.println("Хотите продолжить игру? yes or no");
			answer = console.nextLine();
		}

		

		
	}
}