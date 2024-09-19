//TANMAY DAS;
package com.mycompany.variable;

public class Variable {
  int iVariable=15;
  static int sVariable=30;
  
  public static void main(String[] args) {
     Variable object = new Variable();
        System.out.println("value of instance:" +object.iVariable);
        System.out.println("value of static:" +Variable.sVariable);
    }
}
