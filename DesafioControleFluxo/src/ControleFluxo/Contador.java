package ControleFluxo;

import java.util.Scanner;

public class Contador {
	Scanner sc = new Scanner(System.in);
	
	private int parametro1;
	private int parametro2;
		
	public int getParametro1() {
		return parametro1;
	}

	public void setParametro1(int parametro1) {
		this.parametro1 = parametro1;
	}

	public int getParametro2() {
		return parametro2;
	}

	public void setParametro2(int parametro2) {
		this.parametro2 = parametro2;
	}


	public void contador(){
		System.out.println("Por favor, digite o primeiro parâmetro: ");
		int num1 = sc.nextInt();
		setParametro1(num1);
		System.out.println("Por favor, digite o segundo parâmetro: ");
		int num2 = sc.nextInt();
		setParametro2(num2);
		
		try {
			contar(num1, num2);
		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage() + "\n");
			contador();
		}
	}
	
	
	private void contar(int parametro1, int parametro2)throws ParametrosInvalidosException {
		if (parametro1 > parametro2){
			throw new ParametrosInvalidosException(" !-O segundo parâmetro deve ser maior que o primeiro.-!");
			
		}else {
			for (int x = getParametro1(); x < getParametro2(); x++) {
				System.out.println("Imprimindo o número " + x);
			}
		}
	}
}
