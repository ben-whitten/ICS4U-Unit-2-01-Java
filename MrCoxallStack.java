/*
* The MrCoxallStack program implements an application that
* creates a stack.
*
* @author  Ben Whitten
* @version 1.0
* @since   2020-12-7 
*/

import java.util.ArrayList;  // Import the ArrayList class

///////////////////////////////////////////////////////////////////////////////

public class MrCoxallStack {

  ArrayList<Integer> someStack = new ArrayList<Integer>();

  public void push(int addition) {
    someStack.add(addition);
  }
}
