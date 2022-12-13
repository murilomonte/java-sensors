import java.util.Arrays;
import java.util.Scanner;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CarbonicSensor {
    public static void sensor() {
        Calendar now = Calendar.getInstance();
        Scanner entry = new Scanner(System.in);
        int data[] = new int[10];

        System.out.println("\n[--- Iniciando coleta de gás carbônico ---]\n");
        for (int i = 0; i < data.length; i++) { 
            Format format = new SimpleDateFormat("HH:mm");
            now.add(Calendar.MINUTE, 30);
            format = new SimpleDateFormat("HH:mm");

            System.out.print(format.format(now.getTime()) + " - CO2: ");
            int temp = entry.nextInt();
            data[i] = temp;  
        }

        Arrays.sort(data);

        System.out.println("\n[--- Relatório final (crescente) ---]\n");
        for (int valor: data) { 
            System.out.println("CO2: " + valor +"ppm");
        }
        System.out.println("\n[ -- Fim da coleta de gás carbônico -- ]");   
    }
}
