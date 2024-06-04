public class JaegerTest {

	public static void main(String[] args) {
		Jaeger brodyaga = new Jaeger("Бродяга", "Серия 3", "США", 87.54f, 1980f);

		// brodyaga.setModelName("Бродяга");
		// brodyaga.setMark("Серия 3");
		// brodyaga.setOrigin("США");
		// brodyaga.setHeight(87.54f);
		// brodyaga.setWeight(1980f);

		Jaeger jager = new Jaeger("Егерь", "Серия 7", "США", 85.33f, 7500f);

		Jaeger jagerError = new Jaeger();

		// jager.setModelName("Егерь");
		// jager.setMark("Серия 7");
		// jager.setOrigin("США");
		// jager.setHeight(85.33f);
		// jager.setWeight(7500f);

		System.out.println(brodyaga);
		System.out.println(jager);

		jager.drift();
		System.out.println(brodyaga.scanKaiju());
		jager.useWeapon();
		jagerError.move();


	}
}