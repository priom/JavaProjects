//Nrimoni Chowdhury
//A 00371596

/*
 * Stack ADT
 * By: Tami Meredith
 * Notes: A highly simplified stack implementation that
 *        only stores doubles.
 */

public class stack {

  private final int maxSize = 256;
  private double[] data;
  private int top;

  public stack() {
    data = new double[maxSize];
    top = 0;
  }

  public void push(double num) {
    data[top++] = num;
  }

  public double pop() {
    return (data[--top]);
  }

  public double peek() {
    return (data[top]);
  }

  public boolean isEmpty() {
    return (top == 0);
  }

  public boolean isFull() {
    return (top == maxSize);
  }

  public int numItems() {
    return (top);
  }

} // end of class stack
