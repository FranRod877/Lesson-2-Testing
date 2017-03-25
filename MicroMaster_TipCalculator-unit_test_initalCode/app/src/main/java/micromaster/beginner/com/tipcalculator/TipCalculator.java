package micromaster.beginner.com.tipcalculator;



public class TipCalculator {

    public String calculateTip(double billAmount, double tipToCalculate) {
        billAmount += billAmount * tipToCalculate;
        return Double.toString(billAmount);
    }

    public static Double parseBillValue(String tipValue) {
        try {
            return Double.parseDouble(tipValue);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
