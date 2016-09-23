package com.tt.training.sgu;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;


public class BasicOperations {
	
	private class InputStreamMock extends InputStream {
		
		String buffer;
		
		public void write(String str) {
			buffer = str;
		}

		@Override
		public int read() throws IOException {
			// TODO Auto-generated method stub
			int ret = -1;
			if (buffer.length()>0) {
					ret = buffer.getBytes()[0];
					buffer = buffer.substring(1);
			}
			return ret;
		}
		
	}
	
	private Calc calc;
	private InputStreamMock input;

	@Before
	public void initCalc() {
		input = new InputStreamMock();
		calc = new Calc(input);
	}

	@Test
	public void add() throws IOException {
		input.write("1+1");
	 	assertEquals(new Double(2), calc.result());
	}
	
	@Test
	public void substract() {
		fail("Not yet implemented");
	}
	
	@Test
	public void divide() {
		fail("Not yet implemented");
	}
	
	@Test
	public void multiply() {
		fail("Not yet implemented");
	}

}
