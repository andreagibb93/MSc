package week11.mainimplementation;
public class MyEmptyStackException extends RuntimeException {
 
  public MyEmptyStackException(String err) {

    super("Customised empty stack exception: " + err);

  }

}