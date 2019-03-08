public class AClassDice{


	class Dice extends AClassDice{
		
		void roll(int number){
			
			number = (int)((Math.random()+1)*3);
		
	}

		int getCurrentValue(){
			this.roll();
	}

	}


	public static void main(String[] args){
		Dice dice;
		dice = new Dice();
		System.out.println("Inital value: " + dice.getCurrentValue());
		for(int i = 0; i < 10; i++){
			dice.roll();
			System.out.println("Next value: " + dice.getCurrentValue());
		}
	}
}