import java.util.Arrays;
import java.util.Scanner;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;

public class HumiditySensor {
    public static void sensor() {
        Calendar now = Calendar.getInstance();
        Scanner entry = new Scanner(System.in);
        Integer data[] = new Integer[10];
 
        System.out.println("\n[--- iniciando coleta de umidade ---]\n");
        for (int i = 0; i < data.length; i++) { 
            Format format = new SimpleDateFormat("HH:mm");
            now.add(Calendar.MINUTE, 30);
            format = new SimpleDateFormat("HH:mm");

            System.out.print(format.format(now.getTime()) + " - umidade: ");
            int temp = entry.nextInt();
            data[i] = temp;
        }

        Arrays.sort(data, Collections.reverseOrder());
        

        System.out.println("\n[--- Relatório final (decresente) ---]\n");
        for (int valor: data) { 
            System.out.println("Umidade: " + valor +"%");
        }   
        System.out.println("\n[ -- Fim da coleta de umidade -- ]");
    }
}
