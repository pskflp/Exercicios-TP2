//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Aluno Victor = new Aluno();
        Victor.matricula = 1001;
        Victor.percentualdedesconto = 20;
        Victor.bolsista = true;
        Victor.valorporcredito = 2;
        Victor.quantidadadecreditos = 1039;

        Victor.valormensalidade();

        Aluno Pedro = new Aluno();
        Pedro.matricula = 1002;
        Pedro.percentualdedesconto = 20;
        Pedro.bolsista = false;
        Pedro.valorporcredito = 2;
        Pedro.quantidadadecreditos = 1039;

        Pedro.valormensalidade();




    }
}