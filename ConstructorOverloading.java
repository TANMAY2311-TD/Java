//TANMAY DAS;
//CONSTRUCTOR 2 types; (1. default, 2.parameterised)

package com.mycompany.constructoroverloading;
public class ConstructorOverloading {
void eque1(){
      //default constructor;
      int a = 90;
      int b = 40;
  System.out.println("The sum is =" +(a+b));
}

void eque2(int a, float b){
      //parametrised constructor;
  System .out.println("Total value is=" +(a-b));
}

void eque3(int a, double b){
  System.out.println("The multiflications is=" +(a*b));
}

void eque4(double a, float b){
  System.out.println("The division is=" +(a/b));
}    
    
public static void main(String[] args) {
      
     ConstructorOverloading disp1 = new ConstructorOverloading();
                disp1.eque1();
     ConstructorOverloading disp2 =new ConstructorOverloading();
                disp2.eque2( 25, 40.3f);
     ConstructorOverloading disp3 = new ConstructorOverloading();
                disp3.eque3( 35, 45.8);
     ConstructorOverloading disp4 = new ConstructorOverloading();
                disp4.eque4( 300.5, 50.5f);
                
     }
}
