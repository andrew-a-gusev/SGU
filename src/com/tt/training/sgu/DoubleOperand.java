package com.tt.training.sgu;

public class DoubleOperand implements Operand {

	private Double value;
	
	public DoubleOperand(Double value) {
		this.value = value;
	}

	@Override
	public Double value() {
		// TODO Auto-generated method stub
		return value;
	}

}
