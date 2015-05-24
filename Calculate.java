package com.lirui.tju.sourceforge;

import java.util.Scanner;

public class Calculate {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b=sc.nextInt();
    System.out.println(add(a, b));
    System.out.println(minus(a, b));
    System.out.println(multiply(a, b));
    System.out.println(divide(a, b));
  }
  
  public static int add(int x,int y) {
    return x+y;
  }
  
  public static int minus(int x,int y) {
    return x-y;
  }
  
  public static int multiply(int x,int y) {
    return x*y;
  }
  
  public static double divide(int x,int y) {
    return x/y;
  }

}
