package abstractklass;

public class bmw extends Car {
	public bmw(){
		super.name = "bmw";
	}

	@Override
	void fuel() {
		// TODO Auto-generated method stub
		System.out.println("Bensin");
	}

	@Override
	void doors() {
		// TODO Auto-generated method stub
		System.out.println("4");
	}

	@Override
	void topspeed() {
		// TODO Auto-generated method stub
		System.out.println("320 km/h");
	}
}
