public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        double massa = 79.9;                                          // масса тела в кг
        double rost = 1.85;                                         // рост в метрах
        double index = bmiService.calculate(massa, rost);
        String result = String.format("%.2f", index);               // сокращаем результат
        System.out.println("Индекс вашего тела ≈ " + result + " кг/м²");
    }
}
