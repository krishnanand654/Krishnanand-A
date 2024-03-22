package com.constructorDemo;



class House{
int i;
static {
//db connections mq connections

System.out.println(" calling from static block");
}
//constructor
House(){

System.out.println(" calling from constructor");
//dbconnetion();
}


//parameterized constructor
House(String name){

System.out.println(" calling from constructor"+name);
//dbconnetion();
}

void show() {
int i;
System.out.println(" show room");
//dbconnetion();

}
// this is static in nature
static void myshow() {

System.out.println(" show room static ");
}


}



public class ConstructorDemo {
/// static in nature
public static void main(String[] args) {
// TODO Auto-generated method stub

House s= new House();//instance of a class
s.show();

House a=null; //class variable
a.myshow();


House name = new House("My house name is Antilla");

}

}