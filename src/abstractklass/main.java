package abstractklass;

abstract class Car {
	protected String name;
	abstract void topspeed();
	abstract void fuel();
	abstract void doors();

	public static void hej() {
		System.out.println("bilen är bra!");	
	}
}
