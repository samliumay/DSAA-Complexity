import java.util.Scanner;

//Firslty you should check out the ComplexityExamples class. 
//All the explanation is at the complexityExamples class.
//Then you can try the functions. 

public class Main {
  public static void main(String[] args) {

    Scanner myObj = new Scanner(System.in);
    
    System.out.println("Enter a number to test the complexity.");
    int number = Integer.parseInt(myObj.nextLine());
    
    ComplexityExamples examples = new ComplexityExamples(number);

    System.out.println("O(1) examples:");
    // O(1) examples:
    examples.Oone1();
    examples.Oone2();
    System.out.println("");

    System.out.println("O(logn) examples:");
    // O(logn) examples:
    examples.Ologn();
    System.out.println("");

    System.out.println("O(n)");
    // O(n) examples:
    examples.On1();
    examples.On2();
    System.out.println("");

    System.out.println("O(n^2)");
    // O(n^2) examples:
    examples.Onsquare1();
    examples.Onsquare2();
    System.out.println("");
  }

}