import java.util.Scanner;

public class SetDicePlayer{
		int number;
		void roll(){
			
			number = (int)(Math.random()*6)+1;
		
	}

		int getCurrentValue(){
			return number;
	}

public static void main(String[] args){
		
		
		int str;
		int n;
		int value;
		value=0;
//Get the number of dices(n) and how many times of rolling(str)
        Scanner scan = new Scanner(System.in);       
        System.out.println("Type the number of rolling:");
        
        if (scan.hasNext()) {
            str = scan.nextInt();}
        else{str = 50000;}
    	      
        System.out.println("Type the number of dice:");
        
        if (scan.hasNext()) {
            n = scan.nextInt();}
        else{n = 2;}
        	scan.close();
//Define an array to record the final result with all dices
		int Amount[] = new int[5*n+1];
		for(int i=0; i<Amount.length; i++){
			Amount[i]=0;
		}
//Define an array to record each rolling result
		int[] diceNumber = new int[n];
		for(int i=0; i<n; i++){
			diceNumber[i]=0;
		}
//
		for(int j = 0; j < str; j++){
			value=0;
			for(int i=0; i<n; i++){
			Dice dice;
			dice = new Dice();
			dice.roll();
			diceNumber[i]=dice.getCurrentValue();
			value = value + diceNumber[i];
		}
			Amount[value-n]++;
			}

		for(int i=0; i<5*n+1; i++){System.out.println( Amount[i]); }
		
		
			
	}
}