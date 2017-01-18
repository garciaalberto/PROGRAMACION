public class Yatzy_Game {
	
	public static int Chance(int... dice) {
		int score = 0;
		for (int i = 0; i < dice.length; i++) {
			score += dice[i];
		}
		return score;
	}
	
	public static int Yatzy(int... dice) {
		int comparator = dice[0];
		for (int die : dice) {
			if (die != comparator) {
				return 0;
			}
		}
		return 50;
	}
	
	public static int Ones(int... dice) {
		int score = 0;
		int ONE = 1;
		for (int i = 0; i < dice.length; i++) {
			if (dice[i] == ONE) {
				score += ONE;
			};
			}
			return score;
		}

	public static int Twos(int... dice) {
		int score = 0;
		int TWO = 2;
		for (int i = 0; i < dice.length; i++) {
			if (dice[i] == TWO) {
				score += TWO;
			};
			}
			return score;
		}
	
	public static int Threes(int... dice) {
		int score = 0;
		int THREE = 3;
		for (int i = 0; i < dice.length; i++) {
			if (dice[i] == THREE) {
				score += THREE;
			};
			}
			return score;
		}
	
	public int Fours(int... dice) { //Necesita inyector? Creo
		int score = 0;
		int FOUR = 4;
		for (int i = 0; i < dice.length; i++) {
			if (dice[i] == FOUR) {
				score += FOUR;
			};
			}
			return score;
		}
	
	public int Fives(int... dice) { //Necesita inyector? Creo
		int score = 0;
		int FIVE = 5;
		for (int i = 0; i < dice.length; i++) {
			if (dice[i] == FIVE) {
				score += FIVE;
			};
			}
			return score;
		}
	
	public int Sixes(int... dice) { //Necesita inyector? Creo
		int score = 0;
		int SIX = 6;
		for (int i = 0; i < dice.length; i++) {
			if (dice[i] == SIX) {
				score += SIX;
			};
			}
			return score;
		}
	
	public static int Pair(int... dice) {
		int[] anArray; 
		anArray = new int[6];
		for (int die : dice) {
			anArray[die - 1] += 1;	
		}
		for (int i = 6; i > 0; i--) {
			if (anArray[i-1] >= 2) {
				return i * 2;
			}
		}
		return 0;
	}
	
	public static int Two_Pairs(int... dice) {
		int[] anArray;
		int score = 0;
		int pairs = 0;
		anArray = new int[6];
		for (int die : dice) {
			anArray[die - 1] +=1;
		}
		for (int i = 6; i > 0; i--) {
			if (anArray[i-1] >= 2) {
				score += i * 2;
				pairs += 1;
			}
		}
		if (pairs == 2) {
			return score;
		}
		return 0;
	}
	
	public static int Three_Of_A_Kind(int... dice) {
		int [] anArray;
		int score = 0;
		anArray = new int[6];
		for (int die : dice) {
			anArray[die - 1] += 1;
		}
		for (int i = 6; i > 0; i--) {
			if (anArray[i-1] >= 3) {
				score += i * 3;
			}
		}
		return score;
	}

	public static int Four_Of_A_Kind(int... dice) {
		int [] anArray;
		int score = 0;
		anArray = new int[6];
		for (int die : dice) {
			anArray[die - 1] += 1;
		}
		for (int i = 6; i > 0; i--) {
			if (anArray[i-1] >= 4) {
				score += i * 4;
			}
		}
		return score;
	}
	
	public static int Small_Straight(int... dice) {
		int[] anArray;
		anArray = new int[6];
		for (int die : dice) {
			anArray[die - 1] += 1;
		}
		for (int i = 5; i > 0; i--) {
			if (anArray[i-1] != 1) {
				return 0;
			}
		}
		return 15;
	}
	
	public static int Large_Straight(int... dice) {
		int[] anArray;
		anArray = new int[6];
		for (int die : dice) {
			anArray[die - 1] += 1;
		}
		for (int i = 5; i > 0; i--) {
			if (anArray[i] != 1) {
				return 0;
			}
		}
		return 20;
	}
	
	public static int Full_House(int... dice) {
		int[] anArray;
		int pairs = 0;
		int trios = 0;
		int score = 0;
		anArray = new int[6];
		for (int die : dice) {
			anArray[die - 1] += 1;
		}
		for (int i = 6; i > 0; i--) {
			if (anArray[i-1] == 3) {
				score += i * 3;
				trios += 1;
			}
			if (anArray[i-1] == 2) {
				score += i * 2;
				pairs +=1;
			}
		}
		if (trios == 1 && pairs == 1) {
			return score;
		} else {
			return 0;
		}
	}
	
	// Voy a hacer los casos test en este mismo archivo ya que no sé muy bien como se hace una hoja a parte para los casos test con Eclipse
	
  public static void main(String[] args){ //Fours, Fives y Sixes no seran testeados, pues CREO que necesitan un inyector
    if (Yatzy_Game.Chance(1, 2, 3, 4, 5) == 15){
    	System.out.println("Caso test CHANCE1 OK");
    } else {
	  System.out.println("Caso test CHANCE1 FAIL");
  	}
    if (Yatzy_Game.Chance(2, 6, 3, 4, 5) == 20){
    	System.out.println("Caso test CHANCE2 OK");
    } else {
	  System.out.println("Caso test CHANCE2 FAIL");
  	}
    if (Yatzy_Game.Yatzy(4, 4, 4, 4, 4) == 50){
    	System.out.println("Caso test YATZY1 OK");
    } else {
	  System.out.println("Caso test YATZY1 FAIL");
  	}
    if (Yatzy_Game.Yatzy(4, 4, 4, 4, 5) == 0){
    	System.out.println("Caso test YATZY2 OK");
    } else {
	  System.out.println("Caso test YATZY2 FAIL");
  	}
    if (Yatzy_Game.Ones(1, 2, 1, 4, 5) == 2){
    	System.out.println("Caso test ONES1 OK");
    } else {
	  System.out.println("Caso test ONES1 FAIL");
  	}
    if (Yatzy_Game.Ones(6, 2, 3, 4, 5) == 0){
    	System.out.println("Caso test ONES2 OK");
    } else {
	  System.out.println("Caso test ONES2 FAIL");
  	}
    if (Yatzy_Game.Twos(6, 2, 3, 2, 5) == 4){
    	System.out.println("Caso test TWOS1 OK");
    } else {
	  System.out.println("Caso test TWOS1 FAIL");
  	}
    if (Yatzy_Game.Twos(6, 1, 3, 4, 5) == 0){
    	System.out.println("Caso test TWOS2 OK");
    } else {
	  System.out.println("Caso test TWOS2 FAIL");
  	}
    if (Yatzy_Game.Threes(3, 2, 3, 2, 5) == 6){
    	System.out.println("Caso test THREES1 OK");
    } else {
	  System.out.println("Caso test THREES1 FAIL");
  	}
    if (Yatzy_Game.Threes(6, 1, 2, 4, 5) == 0){
    	System.out.println("Caso test THREES2 OK");
    } else {
	  System.out.println("Caso test THREES2 FAIL");
  	}
    if (Yatzy_Game.Pair(3, 3, 3, 4, 4) == 8){
    	System.out.println("Caso test PAIR1 OK");
    } else {
	  System.out.println("Caso test PAIR1 FAIL");
  	}
    if (Yatzy_Game.Pair(1, 1, 6, 2, 6) == 12){
    	System.out.println("Caso test PAIR2 OK");
    } else {
	  System.out.println("Caso test PAIR2 FAIL");
  	}
    if (Yatzy_Game.Pair(3, 3, 3, 4, 1) == 6){
    	System.out.println("Caso test PAIR3 OK");
    } else {
	  System.out.println("Caso test PAIR3 FAIL");
  	}
    if (Yatzy_Game.Pair(3, 3, 3, 3, 1) == 6){
    	System.out.println("Caso test PAIR4 OK");
    } else {
	  System.out.println("Caso test PAIR4 FAIL");
  	}
    if (Yatzy_Game.Two_Pairs(1, 1, 2, 3, 3) == 8){
    	System.out.println("Caso test TWOPAIRS1 OK");
    } else {
	  System.out.println("Caso test TWOPAIRS1 FAIL");
  	}
    if (Yatzy_Game.Two_Pairs(1, 1, 2, 3, 4)  == 0){
    	System.out.println("Caso test TWOPAIRS2 OK");
    } else {
	  System.out.println("Caso test TWOPAIRS2 FAIL");
  	}
    if (Yatzy_Game.Two_Pairs(1, 1, 2, 2, 2) == 6){
    	System.out.println("Caso test TWOPAIRS3 OK");
    } else {
	  System.out.println("Caso test TWOPAIRS3 FAIL");
  	}
    if (Yatzy_Game.Three_Of_A_Kind(3, 3, 3, 4, 5) == 9){
    	System.out.println("Caso test THREEOFAKIND1 OK");
    } else {
	  System.out.println("Caso test THREEOFAKIND1 FAIL");
  	}
    if (Yatzy_Game.Three_Of_A_Kind(3, 3, 4, 5, 6) == 0){
    	System.out.println("Caso test THREEOFAKIND2 OK");
    } else {
	  System.out.println("Caso test THREEOFAKIND2 FAIL");
  	}
    if (Yatzy_Game.Three_Of_A_Kind(3, 3, 3, 3, 1) == 9){
    	System.out.println("Caso test THREEOFAKIND3 OK");
    } else {
	  System.out.println("Caso test THREEOFAKIND3 FAIL");
  	}
    if (Yatzy_Game.Four_Of_A_Kind(2, 2, 2, 2, 5) == 8){
    	System.out.println("Caso test FOUROFAKIND1 OK");
    } else {
	  System.out.println("Caso test FOUROFAKIND1 FAIL");
  	}
    if (Yatzy_Game.Four_Of_A_Kind(2, 2, 2, 5, 5) == 0){
    	System.out.println("Caso test FOUROFAKIND2 OK");
    } else {
	  System.out.println("Caso test FOUROFAKIND2 FAIL");
  	}
    if (Yatzy_Game.Four_Of_A_Kind(2, 2, 2, 2, 2) == 8){
    	System.out.println("Caso test FOUROFAKIND3 OK");
    } else {
	  System.out.println("Caso test FOUROFAKIND3 FAIL");
  	}
    if (Yatzy_Game.Small_Straight(1, 3, 5, 4, 2) == 15){
    	System.out.println("Caso test SMALLSTRAIGHT1 OK");
    } else {
	  System.out.println("Caso test SMALLSTRAIGHT1 FAIL");
  	}
    if (Yatzy_Game.Small_Straight(1, 3, 5, 6, 4) == 0){
    	System.out.println("Caso test SMALLSTRAIGHT2 OK");
    } else {
	  System.out.println("Caso test SMALLSTRAIGHT2 FAIL");
  	}
    if (Yatzy_Game.Large_Straight(2, 3, 5, 6, 4) == 20){
    	System.out.println("Caso test LARGESTRAIGHT1 OK");
    } else {
	  System.out.println("Caso test LARGESTRAIGHT1 FAIL");
  	}
    if (Yatzy_Game.Large_Straight(2, 3, 5, 1, 4) == 0){
    	System.out.println("Caso test LARGESTRAIGHT2 OK");
    } else {
	  System.out.println("Caso test LARGESTRAIGHT2 FAIL");
  	}
    if (Yatzy_Game.Full_House(1, 1, 2, 2, 2) == 8){
    	System.out.println("Caso test FULLHOUSE1 OK");
    } else {
	  System.out.println("Caso test FULLHOUSE1 FAIL");
  	}
    if (Yatzy_Game.Full_House(2, 2, 3, 3, 4) == 0){
    	System.out.println("Caso test FULLHOUSE2 OK");
    } else {
	  System.out.println("Caso test FULLHOUSE2 FAIL");
  	}
    if (Yatzy_Game.Full_House(4, 4, 4, 4, 4) == 0){
    	System.out.println("Caso test FULLHOUSE3 OK");
    } else {
	  System.out.println("Caso test FULLHOUSE3 FAIL");
  	}
    
  }
}