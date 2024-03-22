package com.inheritanceDemo;



//db people parent class or super class //base clas
class DBConnection{

void Connection() {

System.out.println("default implel");
}

void SqlStatment() {

System.out.println("default implel SqlStatment");
}

void close() {
System.out.println("default close");

}


}


class BharatOracleDBConnection extends DBConnection{ //child class or derived class


void Connection () { //override the fucntionlity of parent class

System.out.println("BharatOracleDBConnection");
}

}


class MelissaMysqlDBConnection extends DBConnection{


void Connection () {

System.out.println("Melissa Mysql DBConnection");
}

}




public class InheritanceDemo {

public static void main(String[] args) {
DBConnection oracle = new BharatOracleDBConnection();
oracle.Connection();

BharatOracleDBConnection orac = new BharatOracleDBConnection();
orac.Connection();


DBConnection oracle1 = new MelissaMysqlDBConnection();
oracle1.Connection();

}

}