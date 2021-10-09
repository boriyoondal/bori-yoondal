package Question5;

public class TransMain {


	public static void main(String[] args) {
		
		Bus bus = new Bus();
		Train train = new Train();
		AirPlane air = new AirPlane();
		
		goBusan(new Train());
		goBusan(new Bus());
		goBusan(new AirPlane());
		
		transport trans = train;

	}
	
	private static void goBusan(transport trans) {
		trans.go();
	}

}
