package com.tt.training.sgu;

import java.util.ArrayList;

public class Add implements BinaryOperator {

	public static final String NAME = "+";
	private ArrayList<Operand> operands;

	@Override
	public String symbol() {
		return NAME;
	}

	@Override
	public Operand apply(ArrayList<Operand> operands) {
		this.operands = operands;
		return this;
	}
	
	@Override
	public Double value() {
		double ret = 0.0;
		for(Operand operand: operands) {
			ret += operand.value();
		}
		return ret;
	}

}
