package estruturas;

public class Antecedente {
    
    private Variavel variavel;
    private String operacao;
    private String valor;
    private String conectivo;
    
    public Antecedente(Variavel variavel, String operacao, String valor, String conectivo) throws Exception {
        this.variavel = variavel;
        if(variavel.getTipo().equals("n")) {
            if(operacao == "=" || operacao == "<>" || operacao == ">" || operacao == "<" || operacao == "<=" || operacao == ">=") {
                this.operacao = operacao;
            }
            else {
                throw new Exception("Operação inválida!");
            }
        }
        else {
            if(operacao == "=" || operacao == "<>") {
                this.operacao = operacao;
            }
            else {
                throw new Exception("Operação inválida!");
            }
        }
        
        if(variavel.getTipo().equals("n")) {
            String[] valores = variavel.getValores().get(0).toString().split(";");
            int min = Integer.parseInt(valores[0]);
            int max = Integer.parseInt(valores[1]);
            if(Integer.parseInt(valor) >= min && Integer.parseInt(valor) <= max) {
                this.valor = valor;
            }
        }
        else {
            for(int i = 0; i < variavel.getValores().size(); i++) {
                if(variavel.getValores().get(i) == valor) {
                    this.valor = valor;
                    break;
                }
            }
        }
        
        if(this.valor == null) {
            throw new Exception("Valor inválido!");
        }
        if(conectivo == "E" || conectivo == "OU") {
            this.conectivo = conectivo;
        }
        else {
            throw new Exception("Conectivo inválido!");
        }
    }

    public Antecedente(Variavel variavel, String operacao, String valor) throws Exception {
        this.variavel = variavel;
        if(operacao == "=" || operacao == "<>" || operacao == ">" || operacao == "<" || operacao == "<=" || operacao == ">=") {
            this.operacao = operacao;
        }
        else {
            throw new Exception("Operação inválida!");
        }
        if(variavel.getTipo().equals("n")) {
            String[] valores = variavel.getValores().get(0).toString().split(";");
            int min = Integer.parseInt(valores[0]);
            int max = Integer.parseInt(valores[1]);
            if(Integer.parseInt(valor) >= min && Integer.parseInt(valor) <= max) {
                this.valor = valor;
            }
        }
        else {
            for(int i = 0; i < variavel.getValores().size(); i++) {
                if(variavel.getValores().get(i) == valor) {
                    this.valor = valor;
                    break;
                }
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

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getConectivo() {
        return conectivo;
    }

    public void setConectivo(String conectivo) {
        this.conectivo = conectivo;
    }
    
    @Override
    public String toString() {
        if(this.conectivo == null) {
            return this.getVariavel().getNome() + " " + this.getOperacao() + " " + this.getValor();
        }
        return " " + this.getConectivo() + " " + this.getVariavel().getNome() + " " + this.getOperacao() + " " + this.getValor();
    }
    
}
