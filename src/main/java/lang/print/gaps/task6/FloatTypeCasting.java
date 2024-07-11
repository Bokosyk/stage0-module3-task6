package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int intNumber = (int) numberToBeRounded;
        float decimalRemainder = Math.abs(intNumber - numberToBeRounded);

        if (decimalRemainder >= 0.5){
            System.out.println(intNumber + 1);
        }
        else {
            System.out.println(intNumber);
        }

    }

    public static void main(String[] args) {
        FloatTypeCasting roundnumber = new FloatTypeCasting();
        roundnumber.roundNumber((float)19.5);
    }
}
