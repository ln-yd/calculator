public class CalcTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println("IM A CALCULATOR");
		calculator.setOperandOne(10);
		calculator.setOperation("-");
		calculator.setOperandTwo(5.2);
		calculator.performOperation();
		System.out.println(calculator.getResults());
	}

}
