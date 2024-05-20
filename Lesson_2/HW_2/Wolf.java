public class Wolf{

	private String gender = "М";
	private String name = "Мухтар";
	private int weigh = 20;
	private int age = 5;
	private String color = "Черный";

	public void go(int step){
		System.out.println("Собака сделала " + step + " шагов");
	}

	public void set_doun(){
		System.out.println("Собака сидит");
	}

	public void sprint(int step){
		System.out.println("Собака пробежала " + step + " шагов");
	}

	public void setWeigt(int weigh){
	this.weigh = weigh;
	}

	public String getName(){
		return name;
	}

	public int getWeigt(){
		return weigh;
	}

}