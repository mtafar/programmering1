package abstractklass;

public class audi extends Car {

public audi(){
	super.name = "audi";
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
		System.out.println(" 340 km/h");
	}
}
