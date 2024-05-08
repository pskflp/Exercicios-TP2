package DataeHOra;

public class Data {

    private int dia, mes, ano;
    private String data;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }


    public void incrementaDia(){

        this.dia++;
        if(this.dia > getDiasNoMes()){
            dia = 1;
            mes++;
            if (mes >12){
                mes = 1;
                ano++;
            }
        }

    }

    public void decrementarDia(){
        this.dia--;
        if(this.dia < 1){
            mes --;
            if (mes < 1){
                mes = 12;
                ano--;
            }
        }
    }



    private int getDiasNoMes(){

        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
            diasPorMes[2] = 29;}

            return diasPorMes[mes];

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
