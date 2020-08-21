public class BMIService {
    public double calculate (double weight, double height){
        double bmi = Math.round(weight / (height * height) * 100.0) / 100.0;
        return bmi;
    }

}
