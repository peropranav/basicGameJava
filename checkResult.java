package basicGame;

public class checkResult {
int[] locationCell;
int noOfHits=0;
int noOfGuesses=0;
public void setLocationCells(int[] loc){
	locationCell=loc;
}

String checkResultGame(int input){
	
for(int i=0;i<locationCell.length;i++){
	if(input==locationCell[i]){
		noOfHits++;
		locationCell[i]=1000;
		if(noOfHits==locationCell.length){
			return "Kill";
		}
		return "Hit";
	}
	
}
return "miss";
}
}