package Practice;

import java.util.*;

// Count digits in a number

public class basic6 {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number :");
    int num = sc.nextInt();

    int count = 0;
    while (num!=0) {
      num = num / 10;
      count++;
    }
    System.out.println("number of digits is : " + count);
  }

}
