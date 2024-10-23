package calculadora;

public interface Calculadora {


public static void main(String[] args) {
    System.out.println(calcular(5, '+', 3)); // Imprime: 8
    System.out.println(calcular(5, '-', 3)); // Imprime: 2
    System.out.println(calcular(5, '*', 3)); // Imprime: -999 (operador no soportado)
}
	
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
