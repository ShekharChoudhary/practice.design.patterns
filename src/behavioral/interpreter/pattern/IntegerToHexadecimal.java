package behavioral.interpreter.pattern;

public class IntegerToHexadecimal implements Expression {

	private int i ;
	
	public IntegerToHexadecimal(int c) {
		this.i = c;
	}

	@Override
	public String interpreter(InterpreterContext ic) {
		
		return ic.getHexadecimalFormat(i);
		
	}
	
	
}
