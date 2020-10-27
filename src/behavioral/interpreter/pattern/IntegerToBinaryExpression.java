package behavioral.interpreter.pattern;

public class IntegerToBinaryExpression implements Expression{

	private int i;
	
	public IntegerToBinaryExpression (int c) {
		this.i = c;
	}
	@Override
	public String interpreter(InterpreterContext ic) {
		
		return ic.getBinaryFormat(i);
		
	}

}
