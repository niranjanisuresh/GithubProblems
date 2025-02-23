package TCS_Questions;
import java.util.Scanner;
public class Ques_1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int T=scan.nextInt();
		
		for(int i=0;i<T;i++) {
			
			int n=scan.nextInt();
			int handshakes = (n*n-1)/2;
			System.out.println(handshakes);
			
		}
	}
}
