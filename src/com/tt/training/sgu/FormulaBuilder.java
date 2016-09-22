package com.tt.training.sgu;

public interface FormulaBuilder {

	Formula build(String readLine);

	void registerOperator(Operator operator);

}
