package Constructor;

public class Bike {//BLC
	String bikeName;
	int noOfBike;
	public Bike(String bikeName,int noOfBike) {
		this.bikeName=bikeName;
		this.noOfBike=noOfBike;
		
	}
public void sound() {
	for(int i=1;i<=noOfBike;i++) {
		System.out.println("bhroom");
	}
}
}
