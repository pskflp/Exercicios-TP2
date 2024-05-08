package DataeHOra;

public class DataeHora {

    private Data data;
    private Hora hora;

    public DataeHora(Data data, Hora hora) {
        this.data = data;
        this.hora = hora;


    }

    public void imprimirDataehora(){
        System.out.printf("A data é %d/%d/%d e a hora é " +
                "%d:%d:%d", data.getDia(),data.getMes(),data.getAno(), hora.getHora(), hora.getMinuto(), hora.getSegundo());

    }
}
