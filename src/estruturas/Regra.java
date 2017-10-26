package estruturas;

import java.util.ArrayList;

public class Regra {
    
    private String nome;
    private ArrayList<Antecedente> antecedentes;
    private ArrayList<Consequente> consequentes;

    public Regra(String nome, ArrayList<Antecedente> antecedentes, ArrayList<Consequente> consequentes) {
        this.nome = nome;
        this.antecedentes = antecedentes;
        this.consequentes = consequentes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Antecedente> getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(ArrayList<Antecedente> antecedentes) {
        this.antecedentes = antecedentes;
    }

    public ArrayList<Consequente> getConsequentes() {
        return consequentes;
    }

    public void setConsequentes(ArrayList<Consequente> consequentes) {
        this.consequentes = consequentes;
    }
    
    @Override
    public String toString() {
        String r;
        r = "Regra " + this.nome + " | SE ";
        for(int i = 0; i < this.getAntecedentes().size(); i++) {
            r += this.getAntecedentes().get(i);
            if(i != this.getAntecedentes().size()-1) {
            }
        }
        r += " | ENTÃO ";
        for(int i = 0; i < this.getConsequentes().size(); i++) {
            r += this.getConsequentes().get(i);
            if(i != this.getConsequentes().size()-1) {
                r += " E ";
            }
        }
        return r;
    }
    
}
