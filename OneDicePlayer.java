import java.util.Scanner;

public class OneDicePlayer{
	int number;
		void roll(){
			
			number = (int)(Math.random()*6)+1;
		
	}

		int getCurrentValue(){
			return number;
	}

	


public static void main(String[] args){
		
		int[] Amount;
		int str;
		Amount = new int[]{0,0,0,0,0,0};
		Dice dice;
		dice = new Dice();

        Scanner scan = new Scanner(System.in);       
        System.out.println("Type the number:");
        
        if (scan.hasNext()) {
            str = scan.nextInt();}
        else{str = 10000;}
        	scan.close();
    	
	

		for(int i = 0; i < str; i++){
			dice.roll();
			
		switch(dice.getCurrentValue()){
			case 1: Amount[0]++;break;
			case 2: Amount[1]++;break;
			case 3: Amount[2]++;break;
			case 4: Amount[3]++;break;
			case 5: Amount[4]++;break;
			case 6: Amount[5]++;
			}
		}
		System.out.println("Result: " + Amount[0]+" "+Amount[1]+" "+Amount[2]+" "+Amount[3]+" "+Amount[4]+" "+Amount[5]);
	}
}