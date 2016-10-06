package tw.org.iii_1;

public class java0821_bike_main {

	public static void main(String[] args) {
		
		Bike myBike,urBike;
		myBike=new Bike();
		urBike=new Bike();
		System.out.println("myBike:"+myBike.getspeed());
		System.out.println("urBike:"+urBike.getspeed());
		
		System.out.println("+++++++");
		for(int i=0;i<14;i++){
		myBike.upSpeed();
		}
		
//		urBike.upSpeed();
//		urBike.upSpeed();
//		urBike.downSpeed();
//		
		System.out.println(myBike.getspeed());
//z		System.out.println(urBike.getspeed());
	}

}
