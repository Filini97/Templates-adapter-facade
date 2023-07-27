public class Main {
    public static void main(String[] args) {
        Calculator calc0 = new Calculator();
        System.out.println(calc0.newFormula().addOperand(5).addOperand(15).calculate(Calculator.Operation.MULT).result());

        System.out.println();

        Ints calc1 = new IntsCalculator();
        System.out.println(calc1.sum(15, 31));
        System.out.println(calc1.mult(821, 5));
        System.out.println(calc1.pow(4, 9));

        System.out.println();

        BinOps bins = new BinOps();
        System.out.println(bins.sum("1110010", "10000101"));
        System.out.println(bins.mult("100001", "10110101"));
    }
}

