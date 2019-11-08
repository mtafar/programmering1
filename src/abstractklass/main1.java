package abstractklass;

public class main1 {
public static void main(String [] args){
	Car[] abstractklass = {new bmw(), new volvo(), new audi() };
	for (Car  bilar:abstractklass) {
		System.out.println(bilar.name);
		
		bilar.doors();
		
		bilar.fuel();
		
		bilar.topspeed();
		
		System.out.println("");
	}
}
}
