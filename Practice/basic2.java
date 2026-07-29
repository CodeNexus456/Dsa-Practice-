package Practice;

public class basic2 {

  // swap number
  public static void main(String[]args) {
    int a = 3;
    int b = 5;

    if(a < b ) {
      // swap number 
      int temp = b ;
      b = a ;
      a  = temp ;

      int temp2 = a ;
      a = b;
      b = temp2;
      System.out.println(a);
      System.out.println(b);
    }
  }
}