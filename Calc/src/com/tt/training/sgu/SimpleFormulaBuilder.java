package com.tt.training.sgu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SimpleFormulaBuilder implements FormulaBuilder {

	private Map<String, Operator> registry = new HashMap<String, Operator>();

	@Override
	public Formula build(String formula) {
		for(String symbol : registry.keySet())  {
			if( 0 <= formula.indexOf(symbol) ) {
				Operator operator = registry.get(symbol);
				return operator.apply(extractOperands(symbol, formula));
			}
		}
		return newOperand("0.0");
	}

	private Operand newOperand(String string) {
		return new DoubleOperand(Double.parseDouble(string));
	}

	private ArrayList<Operand> extractOperands(String symbol, String formula) {
		ArrayList<Operand> operands = new ArrayList<Operand>();
		int index = formula.indexOf(symbol) ;
		operands.add(newOperand(formula.substring(0, index)));
		operands.add(newOperand(formula.substring(index+symbol.length())));
		return operands;
	}

	@Override
	public void registerOperator(Operator operator) {
		registry.put(operator.symbol(), operator);
	}

}
