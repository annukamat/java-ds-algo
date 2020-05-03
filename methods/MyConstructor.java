package methods;

//make new class vehicle then initialize constructor
class vehicle{
	int wheels;
	//(---) parametirez constructor;
	vehicle(int noOfWheels){
		wheels = noOfWheels;
	}
}

public class MyConstructor {
	
	// create a constructor:
MyConstructor(){
	System.out.println("object is created");
}

//from there we make objects:
	public static void main(String[] args) {
		vehicle Car = new vehicle(4);
		System.out.println("my car has " + Car.wheels + " wheels");
		vehicle bike = new vehicle(2);
		System.out.println("my bike has " + bike.wheels + " wheels");

	}

}
