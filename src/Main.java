public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        double weight = 79.9;                                          // масса тела в кг
        double height = 1.85;                                         // рост в метрах
        double index = bmiService.calculate(weight, height);
        String result = String.format("%.2f", index);               // сокращаем результат
        System.out.println("Индекс вашего тела ≈ " + result + " кг/м²");
    }
}
