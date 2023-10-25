class A3Within10 extends ConsoleProgram {

  /**
  * Given 2 int values via user input, output whichever value is nearest to the value 10, or output 0 in the event of a tie.
  * @author: L. Wong
  */
  
  public void run() {
    int intNumber1;
    int intNumber2;
    int intDiff1;
    int intDiff2;

    intNumber1 = readInt("Enter a number: ");
    intNumber2 = readInt("Enter a second number: ");

    intDiff1 = Math.abs(10 - intNumber1);
    intDiff2 = Math.abs(10 - intNumber2);

    if (intDiff1 > intDiff2){
        System.out.println(intNumber2);
    }
    else if (intDiff2 > intDiff1){
        System.out.println(intNumber1);
    }
    else {
        System.out.println("0");
    }
    




    
  }
}
