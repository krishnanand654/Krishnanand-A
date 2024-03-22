package com.interfaceDemo;

interface DBConnection{

void Connection();
void Statment();

}


class OracleDB implements DBConnection{

@Override
public void Connection() {
	System.out.println("oracle db connection successfull");

}

@Override
public void Statment() {
// TODO Auto-generated method stub

}


}


class MysqlDB implements DBConnection{

@Override
public void Connection() {
// TODO Auto-generated method stub
	System.out.println("MySQL db connection successfull");

}

@Override
public void Statment() {
// TODO Auto-generated method stub

}


}



public class InterfaceDemo{
	public static void main(String[] args) {
		OracleDB oracle = new OracleDB();
		oracle.Connection();
		
		MysqlDB sql = new MysqlDB();
		sql.Connection();
	}
}