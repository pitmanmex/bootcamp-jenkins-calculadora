package calculadora;

public class CaluladoraImpl implements Calculadora {
	
    // Constructor
    public CaluladoraImpl(int i1, char op, int i2) {
        this.i1 = i1;
        this.op = op;
        this.i2 = i2;
    }
	
	@Override	
	int calcular(int i1, char op, int i2) {
		switch (op) {
			case '+':
				return i1+i2;
			case '-':
				return i1-i2;
			default:
				returt -999;
		}
	}
		


}
