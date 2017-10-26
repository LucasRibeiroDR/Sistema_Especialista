package base;

import estruturas.Regra;
import estruturas.Variavel;
import java.util.ArrayList;

public class Base {
    
    private ArrayList<Regra> regras;
    private ArrayList<Variavel> variaveis;

    public Base() {
        this.regras = new ArrayList();
        this.variaveis = new ArrayList();
    }
    
    public void addVariavel(Variavel v) {
        this.variaveis.add(v);
    }
    
    public void deleteVariavel(Variavel v) {
        this.variaveis.remove(v);
    }
    
    public void alterVariavel(Variavel v, Variavel v2) {
        this.variaveis.set(this.variaveis.indexOf(v), v2);
    }
    
    public void addRegra(Regra r) {
        this.regras.add(r);
    }
    
    public void deleteRegra(Regra r) {
        this.regras.remove(r);
    }
    
    public void alterRegra(Regra r, Regra r2) {
        this.regras.set(this.regras.indexOf(r), r2);
    }

    public ArrayList<Regra> getRegras() {
        return regras;
    }

    public void setRegras(ArrayList<Regra> regras) {
        this.regras = regras;
    }

    public ArrayList<Variavel> getVariaveis() {
        return variaveis;
    }

    public void setVariaveis(ArrayList<Variavel> variaveis) {
        this.variaveis = variaveis;
    }
    
    public boolean isEmpty() {
        return this.getRegras().isEmpty();
    }
    
    public ArrayList<Variavel> getObjetivos() {
        ArrayList<Variavel> objetivos = new ArrayList();
        for(int i = 0; i < this.variaveis.size(); i++) {
            if(this.variaveis.get(i).isObjetivo()) {
                objetivos.add(this.variaveis.get(i));
            }
        }
        return objetivos;
    }
    
    public Regra encontrarPrimeiroConsequente(Variavel v) {
        for(int i = 0; i < this.regras.size(); i++) {
            for(int j = 0; j < this.regras.get(i).getConsequentes().size(); j++) {
                if(v == this.regras.get(i).getConsequentes().get(j).getVariavel()) {
                    return this.regras.get(i);
                }
            }
        }
        return null;
    }
    
    public ArrayList<Regra> todasAsRegras(Variavel v) {
        ArrayList<Regra> regras = new ArrayList();
        for(int i = 0; i < this.regras.size(); i++) {
            for(int j = 0; j < this.regras.get(i).getConsequentes().size(); j++) {
                if(v == this.regras.get(i).getConsequentes().get(j).getVariavel()) {
                    regras.add(this.regras.get(i));
                }
            }
        }
        return regras;
    }
    
    @Override
    public String toString() {
        String r = "= VARIÁVEIS =============\n";
        for(int i = 0; i < this.getVariaveis().size(); i++) {
            r += this.getVariaveis().get(i) + "\n";
        }
        r += "=========================\n";
        r += "= REGRAS ================\n";
        for(int i = 0; i < this.getRegras().size(); i++) {
            r += this.getRegras().get(i) + "\n";
        }
        r += "=========================";
        return r;
    }
    
}
