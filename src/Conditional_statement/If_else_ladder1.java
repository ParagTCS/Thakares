package Conditional_statement;

public class If_else_ladder1 {
	public static void main(String[] args) {
		char Grade = 'A' ;
		if(Grade <= 'A') {
			System.out.println("Pappu have passed with above 85%");
		}
		else if(Grade <= 'B') {
			System.out.println("Pappu have passed with above 70%");
		}
		else if(Grade <='C') {
			System.out.println("Pappu have passed with above 50");
		}
		else if(Grade <='D') {
			System.out.println("Pappu have passed with above 35%");
		}
		else {
			System.out.println("Pappu have failed his exam");
		}
	}

}
