//TANMAY DAS;
//methodOverloading;
package com.mycompany.calculator;

public class Calculator {
void eque(int a, int b){
    System.out.println("The sum is=" +(a+b));
}

void eque(int a, float b){
    System.out.println("Total value is=" +(a-b));
}

void eque(int a, double b){
    System.out.println("The multiflications is=" +(a*b));
}

void eque(double a, float b){
    System.out.println("The division is=" +(a/b));
}

public static void main(String[] args) {
        
      Calculator disp = new Calculator();
           
      disp.eque(90, 40);
      disp.eque( 25, 40.3f);
      disp.eque( 35, 45.8);
      disp.eque( 300.5, 50.5f);
      
    } 
}
