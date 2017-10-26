package estruturas;

public class Consequente {
    
    private Variavel variavel;
    private String valor;

    public Consequente(Variavel variavel, String valor) throws Exception {
        this.variavel = variavel;
        for(int i = 0; i < variavel.getValores().size(); i++) {
            if(variavel.getValores().get(i) == valor) {
                this.valor = valor;
                break;
            }
        }
        if(this.valor == null) {
            throw new Exception("Valor inválido!");
        }
    }

    public Variavel getVariavel() {
        return variavel;
    }

    public void setVariavel(Variavel variavel) {
        this.variavel = variavel;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString() {
        return this.getVariavel().getNome() + " = " + this.getValor();
    }
    
}
