import java.util.Scanner;

public class TwoDicePlayer{
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
		Amount = new int[]{0,0,0,0,0,0,0,0,0,0,0};
		Dice dice1;
		Dice dice2;
		dice1 = new Dice();
		dice2 = new Dice();

        Scanner scan = new Scanner(System.in);       
        System.out.println("Type the number:");
        
        if (scan.hasNext()) {
            str = scan.nextInt();}
        else{str = 10000;}
        	scan.close();
    	
	

		for(int i = 0; i < str; i++){
			dice1.roll();
			dice2.roll();
		switch(dice1.getCurrentValue()+dice2.getCurrentValue()){
			case 2: Amount[0]++;break;
			case 3: Amount[1]++;break;
			case 4: Amount[2]++;break;
			case 5: Amount[3]++;break;
			case 6: Amount[4]++;break;
			case 7: Amount[5]++;break;
			case 8: Amount[6]++;break;
			case 9: Amount[7]++;break;
			case 10: Amount[8]++;break;
			case 11: Amount[9]++;break;
			case 12: Amount[10]++;
			}
		}
		System.out.println("Result: " + Amount[0]+" "+Amount[1]+" "+Amount[2]+
			" "+Amount[3]+" "+Amount[4]+" "+Amount[5]+
			" "+Amount[6]+" "+Amount[7]+" "+Amount[8]+
			" "+Amount[9]+" "+Amount[10]);
	}
}