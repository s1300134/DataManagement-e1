import java.util.Random;

class DiceGame{
    public static void main(String[] args){
	int d1 = RollDice();
	int d2 = RollDice();
	int total = d1 + d2;

	System.out.println("Rolling dice...");
	System.out.println("Die 1:" + d1);
	System.out.println("Die 2:" + d2);
	System.out.println("Total value: " + total);
    }
    
    public static int RollDice(){
	Random ra = new Random();
	return ra.nextInt(6) + 1;
    }
}
