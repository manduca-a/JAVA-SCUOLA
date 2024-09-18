package TGF;

public class Fattura {

    private String nome; //nome cliente
    private String cognome; //cognome cliente
    int No;//numero oggetti
    double a;
    double p;

    public void setNome(String nm) {
        nome = nm;
    }

    public void setCognome(String cnm) {
        cognome = cnm;
    }

    public String getNome() {
        return "Nome: " + nome;
    }

    public String getCognome() {
        return "Cognome :" + cognome;
    }

    public int setNo(int n) {
        No = n;
        return n;
    }

    public String getNo() {
        return "Numero di oggetti acquistati: " + this.No;
    }

    public void setall(double b) {

        a = 40;
        p = a * No;

    }

    public String getp() {

        return "Totale articoli acquistati: " + p;
    }

    public String getop() {

        return "  -  " + p;
    }

}
