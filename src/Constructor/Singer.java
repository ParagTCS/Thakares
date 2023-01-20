package Constructor;

public class Singer {//BLC
	String songName;
	int howManyTimes;
	public Singer(String songName,int howManyTimes) {
		this.songName=songName;
		this.howManyTimes=howManyTimes;
		
	}
public void good() {
	for(int i=1;i<=howManyTimes;i++) {
		System.out.println("Dil ne mere");
	}
}
}
