package assignment;

public class AssignmentMain {

	public static void main(String[] args) {
		Assignment1 a1=new Assignment1();
		Assignment2 a2= new Assignment2();
		Assignment3 a3=new Assignment3();
				
		System.out.println(a1.barMarker(0.9));
		System.out.println("..................");
		System.out.println(a2.customSearch("hi","bye hi sigh"));
		System.out.println(a2.customSearch("jeopardy","monopoly scrabble jeopardy"));
		System.out.println("..................");
		System.out.println(a3.lengthLongestWord("interesting"));
		System.out.println("...................");
		System.out.println(a3.letterCount("these programs are very interesting", 'a'));
		System.out.println("......................");
		System.out.println(a3.wordLengthOrder("these programs are very interesting"));
	}

}
