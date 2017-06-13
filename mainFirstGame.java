package basicGame;
import java.util.Scanner;
public class mainFirstGame {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		// TODO Auto-generated method stub
checkResult a=new checkResult();

		int [] arr={3,4,5}; //we wish to send array by main
		a.setLocationCells(arr); //array is at the location cell
		
		for(int i=0;i<100;i++){
			int guess=s.nextInt();
		String answer=a.checkResultGame(guess);
		System.out.println(answer);
		if(i>10){
			System.out.println("Max guess reached");
			break;
		}
		if(answer=="Kill"){
			System.out.println("You win");
			break;
		}
		}
		
	}

}
