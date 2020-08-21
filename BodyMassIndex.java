public class BodyMassIndex {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        double bmi = service.calculate(60.00, 1.70);
        System.out.println(bmi);
    }
}
