import java.util.Arrays;
import java.util.Scanner;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TempSensor {
    public static void sensor() {
        Calendar now = Calendar.getInstance();
        Scanner entry = new Scanner(System.in);
        int data[] = new int[10];

        System.out.println("\n[--- Iniciando coleta de temperatura ---]\n");
        for (int i = 0; i < data.length; i++) { 
            Format format = new SimpleDateFormat("HH:mm");
            now.add(Calendar.MINUTE, 30);
            format = new SimpleDateFormat("HH:mm");

            System.out.print(format.format(now.getTime()) + " - temperatura: ");
            int temp = entry.nextInt();
            data[i] = temp;
        }

        Arrays.sort(data);
        
        System.out.println("\n[--- Relatório final (crescente) ---]\n");
        for (int valor: data) {

            System.out.println("Temperatura: " + valor +"°C");
        } 
        System.out.println("\n[ -- Fim da coleta de temperatura -- ]");
    }
}
