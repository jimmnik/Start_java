public class JaegerTest {

	public static void main(String[] args) {
		Jaeger jagerOne;
		jagerOne = new Jaeger();

		System.out.println("modelName = " + jagerOne.getModelName());
		 jagerOne.setModelName("");
		 System.out.println("modelName = " + jagerOne.getModelName());

		// System.out.println("mark = " + jagerOne.height);
		// jagerOne.height = -1;
		// System.out.println("mark = " + jagerOne.height);

		// System.out.println("speed = " + jagerOne.mark);
		// System.out.println("speed = " + jagerOne.speed);
		// System.out.println(jagerOne.drift());
	}
}