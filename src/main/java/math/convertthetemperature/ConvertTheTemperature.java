package math.convertthetemperature;

/*
#2469
You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature
in Celsius.
You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].
Return the array ans. Answers within 10-5 of the actual answer will be accepted.

Note that:
Kelvin = Celsius + 273.15
Fahrenheit = Celsius * 1.80 + 32.00

Input: celsius = 36.50
Output: [309.65000,97.70000]
Explanation: Temperature at 36.50 Celsius converted in Kelvin is 309.65 and converted in Fahrenheit is 97.70.
 */


public class ConvertTheTemperature {

    public static double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        ans[0] = celsius + 273.15;
        ans[1] = celsius * 1.80 + 32.00;
        return ans;
    }

    public static double[] convertTemperature2(double celsius) {
        return new double[] {celsius + 273.15, celsius * 1.80 + 32.00};
    }


}
