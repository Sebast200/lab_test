import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        int condicion = 0;
        while (condicion == 0 ){
            String lec = lectura.nextLine();
            String[] lecseparado = lec.split(":");
            int hora = Integer.parseInt(lecseparado[0]);
            int minutos = Integer.parseInt(lecseparado[1]);
            int minutostotales = 0;
            if (hora == 00 && minutos == 00){
                condicion = 1;
            }else{
               while (hora < 23){
                hora = hora+1;
                minutostotales = minutostotales+60;
               }
               while(minutos < 60){
                minutos = minutos +1;
                minutostotales = minutostotales+1;
               }
               System.out.println(minutostotales);
            }
        }
    }
}
