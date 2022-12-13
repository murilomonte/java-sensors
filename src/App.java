public class App {
    public static void main(String[] args) throws Exception {
        TempSensor.sensor();
        HumiditySensor.sensor();
        CarbonicSensor.sensor();
    }
}