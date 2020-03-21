package calculator.operator;

public class DivisionOperator extends Operator {

    // 소수점 둘째 자리까지
    @Override
    public double calculate(double beforeNum, double afterNum) {
        double result = beforeNum / afterNum;
        return Math.round(result * 100) / 100.0;
    }
}
