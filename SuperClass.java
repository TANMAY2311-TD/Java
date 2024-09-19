//TANMAY DAS;
//Inheritance;
package com.mycompany.inheritance.superclass;

class Animal{
void animalsound(){
    System.out.println("The animal makes sound");
  }    
}

class Lion extends Animal{
void animalsound(){
    super.animalsound();
    System.out.println("The Lion says: Roar Roar");
  }
}   
  
class Cow extends Animal{
void animalsound(){
    super.animalsound();
    System.out.println("The Cow says: Hamba Hamba");
  }
}
public class SuperClass{    
public static void main(String[] args) {
       
    Lion myLion = new Lion();
    myLion.animalsound();
    Cow myCow = new Cow();
    myCow.animalsound();
    
    }
}
