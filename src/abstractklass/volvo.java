package abstractklass;

public class volvo extends Car {
	public volvo(){
		super.name = "volvo";
	}

		@Override
		void fuel() {
			// TODO Auto-generated method stub
			System.out.println("Disel");
		}

		@Override
		void doors() {
			// TODO Auto-generated method stub
			System.out.println("4");
		}

		@Override
		void topspeed() {
			// TODO Auto-generated method stub
			System.out.println("250 km/h");
		}
}
