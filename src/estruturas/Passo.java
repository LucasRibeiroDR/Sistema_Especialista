package estruturas;

public class Passo {
    
    private int indice;
    private int tipo;
    private Regra regra;
    private Variavel variavel;
    private String comparacao;
    private String valor;
    private boolean aceita;
    private boolean pergunta;
    
    // Procurando variável... X
    // Perguntando ao usuário sobre... X
    public Passo(int indice, Variavel variavel, boolean pergunta) {
        this.indice = indice;
        this.variavel = variavel;
        if(pergunta) {
            this.pergunta = true;
            this.tipo = 1;
        }
        else {
            this.tipo = 2;
        }
    }
    
    // Entrando na regra... X
    public Passo(int indice, Regra regra) {
        this.indice = indice;
        this.regra = regra;
        this.tipo = 3;
    }
    
    // Regra x aceita/rejeitada... X
    public Passo(int indice, Regra regra, boolean aceita) {
        this.indice = indice;
        this.regra = regra;
        this.aceita = aceita;
        this.tipo = 4;
    }
    
    // Comparando x = y... X
    public Passo(int indice, Variavel variavel, String comparacao, String valor) {
        this.indice = indice;
        this.variavel = variavel;
        this.comparacao = comparacao;
        this.valor = valor;
        this.tipo = 5;
    }
    
    // Resposta do usuário: x...
    public Passo(int indice, String valor) {
        this.indice = indice;
        this.valor = valor;
        this.tipo = 6;
    }
    
    // Variavel = valor
    public Passo(int indice, Variavel variavel, String valor) {
        this.indice = indice;
        this.variavel = variavel;
        this.valor = valor;
        this.tipo = 7;
    }
    
    public int getIndice() {
        return this.indice;
    }
    
    public String toString() {
        if(this.tipo == 1) {
            return "Perguntando ao usuário sobre " + this.variavel.getNome();
        }
        else if(this.tipo == 2) {
            return "Procurando " + this.variavel.getNome();
        }
        else if(this.tipo == 3) {
            return "Entrando na regra " + this.regra.getNome();
        }
        else if(this.tipo == 4) {
            if(this.aceita) {
                return "A regra " + this.regra.getNome() + " foi aceita";
            }
            else {
                return "A regra " + this.regra.getNome() + " foi rejeitada";
            }
        }
        else if(this.tipo == 5) {
            return "Comparando " + this.variavel.getNome() + " " + this.comparacao + " " + this.valor;
        }
        else if(this.tipo == 6) {
            return "Resposta do usuário: " + this.valor;
        }
        else if(this.tipo == 7) {
            return this.variavel.getNome() + " = " + this.valor;
        }
        return null;
    }
    
}
