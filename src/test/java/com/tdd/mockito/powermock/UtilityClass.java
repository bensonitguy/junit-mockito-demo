package com.tdd.mockito.powermock;

public class UtilityClass {
	 static int staticMethod(long value) {
		// Some complex logic is done here...
		throw new RuntimeException(
				"I dont want to be executed. I will anyway be mocked out.");
	}
	 
	 private int testing(){
		 return 1;
	 }
}