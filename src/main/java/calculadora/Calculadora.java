package calculadora;

public interface Calculadora {
	
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
