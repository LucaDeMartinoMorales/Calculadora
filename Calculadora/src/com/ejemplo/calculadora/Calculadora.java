package com.ejemplo.calculadora;
import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, resultado;
		String operacion;
		
		System.out.println("Introduce el primer número: ");
		a = sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		b = sc.nextInt();
		
		System.out.println("Introduce la operacion que deseas hacer: ");
		operacion = sc.next();
		
		switch (operacion) {
		case "+":
			resultado = sumar(a, b);
			break;
		}
	}
	
	 public static double sumar(double a, double b) {
	 return a + b;
	 }
	}