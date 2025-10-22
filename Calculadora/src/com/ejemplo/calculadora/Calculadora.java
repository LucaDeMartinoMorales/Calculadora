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
			System.out.println(resultado);
			break;
		case "-":
			resultado = restar(a, b);
			System.out.println(resultado);
		case "*":
			resultado = multiplicar(a, b);
			System.out.println(resultado);
		}
	}
	
	 public static double sumar(double a, double b) {
	 return a + b;
	 }
	 
	 public static double restar(double a, double b) {
		 return a - b;
		}
		
	 public static double multiplicar(double a, double b) {
		 return a * b;
		}
	}