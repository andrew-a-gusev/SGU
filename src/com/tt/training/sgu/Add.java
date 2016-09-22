package com.tt.training.sgu;

import java.util.ArrayList;

public class Add implements BinaryOperator {

	public static final String NAME = "+";

	@Override
	public String symbol() {
		return NAME;
	}

	@Override
	public Operand apply(ArrayList<Operand> operands) {
		double ret = 0.0;
		for(Operand operand: operands) {
			ret += operand.value();
		}
		return new DoubleOperand(ret);
	}

}
