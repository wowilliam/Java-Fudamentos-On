package com.fiap.view;

import com.fiap.exception.DivisaoPorZeroException;

public class TestException {
	
	public static void main(String[] args) throws DivisaoPorZeroException {
		
		try {
		    int val = 10/0;
		    System.out.println(val);
		} catch (ArithmeticException e) {
		    throw new DivisaoPorZeroException("Divisão por zero encontrada!");
		}
	}

}
