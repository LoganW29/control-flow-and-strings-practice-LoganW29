class A1FreezingHot extends ConsoleProgram {

  /**
  * Given two temperatures via user input, output true if one is less than 0 and the other is greater than 100.
  * @author: L. Wong
  */
  
  public void run() {

    double dblTemp1;
    double dblTemp2; 

    dblTemp1 = readInt("What is the first temperature? ");
    dblTemp2 = readInt("What is the second temperature? ");
    
    if ((dblTemp1 < 0 && dblTemp2 > 100) || (dblTemp1 > 100 && dblTemp2 < 0)) {
        System.out.printf("%.0f%n%.0f%n%s", dblTemp1, dblTemp2, "true"); 
    }
    else {
        System.out.printf("%.0f%n%.0f%n%s", dblTemp1, dblTemp2, "false");
    }
  
  }

}

