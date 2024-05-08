package DataeHOra;

public class Hora {

    private int hora, minuto, segundo;

    public Hora(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }


    public void aumentarHora(){
        this.segundo++;
        if(segundo > 60){
            segundo = 0;
            minuto++;
        }
    }

    public void diminuirHora(){
        this.segundo--;
        if(segundo <0){
            segundo = 59;
            minuto --;
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
}
