package motor;

import base.Base;
import estruturas.*;
import java.util.ArrayList;

public class MotorDeInferencia {
    
    private Base base;
    private Explicacao ex;
    private int indice;
    
    public MotorDeInferencia(Base base) {
        this.base = base;
        this.ex = new Explicacao();
        this.indice = 0;
    }
    
    public void start() throws Exception {
        if(!base.isEmpty()) {
            if(base.getObjetivos().size() > 0) {
                for(int i = 0; i < base.getObjetivos().size(); i++) {
                    Variavel v = base.getObjetivos().get(i);
                    this.processar(v);
                    System.out.println(base.getObjetivos().get(i).getNome() + " = " + v.getValores_setados());
                    this.ex.addPasso(new Passo(this.indice, base.getObjetivos().get(i), v.getValores_setados().toString()));
                    System.out.println("=========================");
                    System.out.println(this.ex.toString());
                }
            }
            else {
                throw new Exception("Base sem variáveis objetivo!");
            }
        }
        else {
            throw new Exception("Base vazia!");
        } 
    }
    
    public void processar(Variavel v) throws Exception {
        this.ex.addPasso(new Passo(this.indice, v, false));
        ArrayList<Regra> regras = base.todasAsRegras(v);
        if(regras.size() < 1) {
            if(v.getValores_setados().isEmpty()) {
                this.ex.addPasso(new Passo(this.indice, v, true));
                v.pergunta();
                for(int i = 0; i < v.getValores_setados().size(); i++) {
                    this.ex.addPasso(new Passo(this.indice, v.getValores_setados().get(i).toString()));
                }
                return;
            }                
        }
        for(int a = 0; a < regras.size(); a++) {                 
            Regra primeira = regras.get(a);
            this.ex.addPasso(new Passo(this.indice, primeira));
            this.indice++;
            boolean ok = false;
            boolean condicoes = false;                        
                ArrayList<Antecedente> antecedentes = primeira.getAntecedentes();
                for(int i = 0; i < antecedentes.size(); i++) {  
                    condicoes = false;
                    processar(antecedentes.get(i).getVariavel());
                    if(antecedentes.get(i).getOperacao().equals("=")) {
                        for(int j = 0; j < antecedentes.get(i).getVariavel().getValores_setados().size(); j++) {
                            this.ex.addPasso(new Passo(this.indice, antecedentes.get(i).getVariavel(), "=", antecedentes.get(i).getValor()));
                            if(antecedentes.get(i).getVariavel().getValores_setados().get(j).equals(antecedentes.get(i).getValor()))   {
                                condicoes = true;
                            }
                        }                    
                    }
                    else if(antecedentes.get(i).getOperacao().equals("<>")) {
                        for(int j = 0; j < antecedentes.get(i).getVariavel().getValores_setados().size(); j++) {
                            this.ex.addPasso(new Passo(this.indice, antecedentes.get(i).getVariavel(), "<>", antecedentes.get(i).getValor()));
                            if(!antecedentes.get(i).getVariavel().getValores_setados().get(j).equals(antecedentes.get(j).getValor())) {
                                condicoes = true;
                            }
                        }
                    }
                    else if(antecedentes.get(i).getOperacao().equals(">")) {
                        for(int j = 0; j < antecedentes.get(i).getVariavel().getValores_setados().size(); j++) {
                            this.ex.addPasso(new Passo(this.indice, antecedentes.get(i).getVariavel(), ">", antecedentes.get(i).getValor()));
                            if(Float.parseFloat(antecedentes.get(i).getVariavel().getValores_setados().get(j).toString()) > Float.parseFloat(antecedentes.get(j).getValor().toString())) {
                                condicoes = true;
                            }
                        }
                    }              
                    else if(antecedentes.get(i).getOperacao().equals("<")) {
                        for(int j = 0; j < antecedentes.get(i).getVariavel().getValores_setados().size(); j++) {
                            this.ex.addPasso(new Passo(this.indice, antecedentes.get(i).getVariavel(), "<", antecedentes.get(i).getValor()));
                            if(Float.parseFloat(antecedentes.get(i).getVariavel().getValores_setados().get(j).toString()) < Float.parseFloat(antecedentes.get(j).getValor().toString())) {
                                condicoes = true;
                            }
                        }
                    }
                    else if(antecedentes.get(i).getOperacao().equals(">=")) {
                        for(int j = 0; j < antecedentes.get(i).getVariavel().getValores_setados().size(); j++) {
                            this.ex.addPasso(new Passo(this.indice, antecedentes.get(i).getVariavel(), ">=", antecedentes.get(i).getValor()));
                            if(Float.parseFloat(antecedentes.get(i).getVariavel().getValores_setados().get(j).toString()) >= Float.parseFloat(antecedentes.get(j).getValor().toString())) {
                                condicoes = true;
                            }
                        }
                    }
                    else if(antecedentes.get(i).getOperacao().equals("<=")) {
                        for(int j = 0; j < antecedentes.get(i).getVariavel().getValores_setados().size(); j++) {
                            this.ex.addPasso(new Passo(this.indice, antecedentes.get(i).getVariavel(), "<=", antecedentes.get(i).getValor()));
                            if(Float.parseFloat(antecedentes.get(i).getVariavel().getValores_setados().get(j).toString()) <= Float.parseFloat(antecedentes.get(j).getValor().toString())) {
                                condicoes = true;
                            }
                        }
                    }
                    if(condicoes) {
                        ok = true;
                    }
                    else {
                        ok = false;
                    }
                    if(!ok) {  
                        this.ex.addPasso(new Passo(this.indice, primeira, false));
                        this.indice--;
                        break;
                    }
                }
                if(ok) {
                    this.ex.addPasso(new Passo(this.indice, primeira, true));
                    this.indice--;
                    primeira.getConsequentes().get(0).getVariavel().addValores_setados(primeira.getConsequentes().get(0).getValor());
                    if(primeira.getConsequentes().get(0).getVariavel().getTipo().equals("u")) {
                        return;
                    }
                }                          
        }
    }
    
}
