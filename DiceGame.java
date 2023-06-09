import java.util.Random;
import java.util.Scanner;

class DiceGame{
    public static void main(String[] args){
	int d1 = RollDice();
	int d2 = RollDice();
	int total = d1 + d2;
	String name;
	Scanner sc = new Scanner(System.in);

	System.out.println("What is your name?");
	System.out.print("> ");
	name = sc.next();
	System.out.println("Hello, " + name + "!");

	System.out.println("Rolling dice...");
	System.out.println("Die 1:" + d1);
	System.out.println("Die 2:" + d2);
	System.out.println("Total value: " + total);

	if(total >= 7)System.out.println(name + " won!");
	else System.out.println(name + " lost!");
    }
    
    public static int RollDice(){
	Random ra = new Random();
	return ra.nextInt(6) + 1;
    }
}
