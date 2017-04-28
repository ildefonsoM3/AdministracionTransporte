package Sistematransporte;

import java.sql.SQLException;

import BaseDatos.BaseDatos;

public class Principal {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		BaseDatos baseDatos = new BaseDatos();
		baseDatos.conectar();

	}

}
