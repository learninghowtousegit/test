package StackSkills;

import java.util.*;


public class LabThingy {
	public static void main(String[] args) {
		boolThingy();
		noVowels();
		multiplyWithWhile();
		multiplyWithFor();
		switchThingy();
		
		
	}

static void boolThingy() {
	
	boolean a = true;
	boolean b = true;
	boolean c = true;

	if(a && b && !c) {
		System.out.println("cool");
		}
	if (a || b || c) {
		System.out.println("cool2");
		}
	if ((a && b && c) ||  (!a&& !b && !c)) {
		System.out.println("cool3");
		}
	if (a || b) {
		System.out.println("cool4");
		}
	}

static void noVowels() {
	Scanner input = new Scanner(System.in);
	System.out.println("Type a word");
	String word = input.next();
	String lowerWord = word.toLowerCase();
	if(lowerWord.contains("a") || lowerWord.contains("e")|| lowerWord.contains("i")|| lowerWord.contains("o")|| lowerWord.contains("u")|| lowerWord.contains("y")) {
		System.out.println(word + " does contain vowels");
	} else {
		System.out.println(word + " does not contian vowels");
		}
	
	}

static void multiplyWithWhile() {
	int i = 1;
	while(i <= 10) {
		int product = i*i;
		System.out.println(product);
		i++;
	}
	
	}

static void multiplyWithFor() {
	for(int i = 0; i < 10; i++) {
		int product = i*i;
		System.out.println(product);
	}
	
	}

static void switchThingy() {
	Scanner input = new Scanner(System.in);
	System.out.println("Type a number idk");
	int i = input.nextInt();
	switch(i) {
	case 1:
		System.out.println("Green");
		break;
	case 2:
		System.out.println("Red");
		break;
	case 3:
		System.out.println("Blue");
		break;
	case 4:
		System.out.println("Yellow");
		break;
	default:
		System.out.println("White");
		break;
	}


}
}

