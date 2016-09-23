package com.tt.training.sgu;

import java.util.ArrayList;

public interface Operator extends Operand {

	String symbol();

	Operand apply(ArrayList<Operand> extractOperands);

}
