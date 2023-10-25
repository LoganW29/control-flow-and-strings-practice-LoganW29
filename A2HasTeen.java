class A2HasTeen extends ConsoleProgram {

  /**
  * Given 3 int values via user input, output true if 1 or more of them is in the range 13..19.
  * @author: L. Wong
  */
  
  public void run() {
    int intValue1;
    int intValue2; 
    int intValue3; 

    intValue1 = readInt("What is your first value? ");
    intValue2 = readInt("What is your second value? ");
    intValue3 = readInt("What is your third value? ");

    if ((intValue1 >= 13 && intValue1 <=19) || (intValue2 >= 13 && intValue2 <=19) || (intValue1 >= 13 && intValue1 <=19)) {
        System.out.printf("%d%n%d%n%d%ntrue", intValue1, intValue2, intValue3);
    }
    else {
        System.out.printf("%d%n%dn%d%nfalse", intValue1, intValue2, intValue3);

    }





    
  }
}
