package com.tt.training.sgu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Calc {

	private BufferedReader reader;
	private FormulaBuilder formulaBuilder;

	public Calc(InputStream input) {
		reader = new BufferedReader(new InputStreamReader(input));
		formulaBuilder = new SimpleFormulaBuilder();
		formulaBuilder.registerOperator(new Add());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Double result() throws IOException {
		Formula formula = formulaBuilder.build(reader.readLine());
		return formula.value();
	}

}
