import DataeHOra.Data;
import DataeHOra.DataeHora;
import DataeHOra.Hora;

public class Main {
    public static void main(String[] args) {

        Data datinha = new Data(2,1,2022);
        Hora horario = new Hora(2,59,59);

        DataeHora Dataehorario = new DataeHora(datinha, horario);

        Dataehorario.imprimirDataehora();




    }
}