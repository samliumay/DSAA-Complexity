import java.awt.desktop.SystemSleepEvent;

/*

- So When we are dealing with complexity, we have 3 main rankings of complexity
1- Best Case - Omega Ω
2- Avarage Case  - Theta Θ
3- Worst Case - Omicron O

- Also we are dividing the complexity in to two: 
1- Time Complexity 
2- Space Complexity 

At this chapter we will be looking at how to calculate the worst case time complexity for the algorithms. 

*/

public class ComplexityExamples {

  private int n;

  public ComplexityExamples(int n) {
    this.n = n;
  }

  // O(1) complexity examples.
  // Example-1
  public void Oone1() {
    System.out.println("Number: " + n);
    System.out.println("Complexity is O(1)");
  }
  // Explanation: In any case we have just 1 computation. So complexity is O(1).

  // Example-2
  public void Oone2() {
    System.out.println("Number: " + n);
    System.out.println("Number: " + n);
    System.out.println("Number: " + n);
    System.out.println("Number: " + n);
    System.out.println("Complexity is O(1)");
  }
  // Explanation: As you see we have 4 dofferent compuations inside the function.
  // So should we say O(4). No. becouse of droping constant rules, we will be
  // saying this is O(1).

  // O(logn) complexity examples.
  // Example-1
  public void Ologn() {

    int m = n;
    for (; m > 1; m = m / 2) {
      System.out.println("Number: " + m);
    }
    System.out.println("Complexity is O(logn)");
  }
  // Explanation: When we start to divide all the dataset to somethink for finding
  // a number or just printing them, we are doing Logn number of computations. You
  // can look for the proofs but becaouse nature of this notes are warm-ups,
  // knowing this is enoguh.
  
  // O(n) complexity examples.
  // Example-1
  public void On1() {
    for (int i = 0; n > i; i++) {
      System.out.println("Number: " + 1);
    }
    System.out.println("Complexity is O(n)");
  }
  // Explanation: A classic for loop. We are writing the number n time. So we are
  // doing somethink n times.

  // Example -2
  public void On2() {
    for (int i = 0; n > i; i++) {
      System.out.println("Number-i: " + 1);
    }

    for (int z = 0; n > z; z++) {
      System.out.println("Number-z: " + 1);
    }
    System.out.println("Complexity is O(n)");
  }
  // Explanation: So as we can see number of computation is 2n. But becaouse of
  // the 'drop constant rule of complexity calculation, we still stay this is
  // O(n)'

  // O(n^2) complexity examples.
  // Example-1
  public void Onsquare1() {
    for (int i = 0; n > i; i++) {
      for (int z = 0; n > z; z++) {
        System.out.println("Number-i: " + i);
        System.out.println("Number-z: " + z);
        System.out.println("--------------");
      }
    }
    System.out.println("Complexity is O(n^2)");
  }
  // Explanation: A normal for loop inside a for loop with same number of
  // iteration. So the complexity is O(n^2)

  // Example-2
  public void Onsquare2() {
    for (int i = 0; n > i; i++) {
      for (int z = 0; n > z; z++) {
        System.out.println("Number-i: " + i);
        System.out.println("Number-z: " + z);
        System.out.println("--------------");
      }
    }
    for (int i = 0; n > i; i++) {
      System.out.println("Number: " + 1);
    }
    System.out.println("Complexity is O(n^2)");
  }
  // Explanation: Number of computation at here is n + n^2. But becaouse of the
  // 'Drop non-dominant' rule, we will be still saying this functions complexity
  // is O(n^2).

 

}