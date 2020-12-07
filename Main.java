/*
* The Main program implements an application that
* pushes an integer onto a stack.
*
* @author  Ben Whitten
* @version 1.0
* @since   2020-12-7 
*/

import java.util.Scanner;  // Import the Scanner class

///////////////////////////////////////////////////////////////////////////////

class Main {

  ////////////////////////////////////////////////////////////////////////////

  /**
   * This function handels the input and output.
   */
  public static void main(String[] args) {

    // Creating a scanner.
    Scanner scan = new Scanner(System.in);

    int number;

    MrCoxallStack someStack = new MrCoxallStack();

    while (true) {
      try {

        System.out.println("Insert a number to add to the stack:");
        number = scan.nextInt();

        someStack.push(number);
        System.out.println("push(" + number + ")");

      } catch (Exception e) {
        System.out.println("ERROR: INVALID INPUT");
        break;
      }
    }
  }
}
