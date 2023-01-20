package Conditional_statement;

public class If_else_ladder {
	public static void main(String[] args) {
	int Runs =7 ;
	if(Runs >= 100) {
		System.out.println("Batsman hits century");
	}
	else if(Runs >= 75) {
		System.out.println("Batsman hits 75++");
	}
	else if(Runs >= 50) {
		System.out.println("Batsman hits fifty");
	}
	else if(Runs >= 30) {
		System.out.println("Batsman played well");
	}
	else if(Runs >= 10) {
		System.out.println("Batsman need to improve their batting");
	}
	else {
		System.out.println("Player might be a bowler");
	}
	}

}
