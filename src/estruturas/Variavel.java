package estruturas;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;
import motor.Explicacao;

public class Variavel<T> {
    
    private boolean objetivo;
    private String nome;
    private String tipo;
    private ArrayList<T> valores;
    private ArrayList<T> valores_setados;

    public Variavel(boolean objetivo, String nome, String tipo, ArrayList<T> valores) throws Exception {
        this.objetivo = objetivo;
        this.nome = nome;
        if(tipo.equals("n") || tipo.equals("m") || tipo.equals("u")) {
            this.tipo = tipo;
        }
        else {
            throw new Exception("Tipo da variável inválido!");
        }
        if(tipo.equals("n")) {
            if(this.checarNumerico(valores)) {
                this.valores = valores;
            }
            else {
                throw new Exception("Tipo não condiz com a lista de valores!");
            }
        }
        else {
            this.valores = valores;
        }
        this.valores_setados = new ArrayList();
    }

    public Variavel(boolean b, String valores_capacidadeBateria, String u, Variavel valores_capacidadeBateria0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isObjetivo() {
        return objetivo;
    }

    public void setObjetivo(boolean objetivo) {
        this.objetivo = objetivo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<T> getValores() {
        return valores;
    }

    public void setValores(ArrayList<T> valores) {
        this.valores = valores;
    }

    public ArrayList<T> getValores_setados() {
        return valores_setados;
    }

    public void setValores_setados(ArrayList<T> valores_setados) {
        this.valores_setados = valores_setados;
    }
    
    public void addValores_setados(T valor) throws Exception {
        if(this.tipo.equals("n")) {
            if(valor.toString().matches("[0-9]*")) {
                String[] margens = this.valores.get(0).toString().split(";");
                if(Integer.parseInt(valor.toString()) >= Integer.parseInt(margens[0]) && Integer.parseInt(valor.toString()) <= Integer.parseInt(margens[1])) {
                    if(this.valores_setados.isEmpty()) {
                        this.valores_setados.add(valor);
                    }
                    else {
                        this.valores_setados.set(0, valor);
                    } 
                }
                else {
                    throw new Exception("Tipo não condiz com a lista de valores!");
                }
            }
        }
        else if(this.tipo.equals("u")) {
            if(this.valores_setados.isEmpty()) {
                this.valores_setados.add(valor);
            }
            else {
                this.valores_setados.set(0, valor);
            }           
        }
        else if(this.tipo.equals("m")) {
            this.valores_setados.add(valor);
        }
    }
    
    public void deleteVariavel(T valor) {
        this.valores_setados.remove(valor);
    }
    
    @Override
    public String toString() {
        return this.isObjetivo() + " | " + this.getNome() +  " | " + this.getTipo() +  " | " + this.getValores() + " | " + this.getValores_setados();
    }
    
    public void pergunta() throws Exception {
        System.out.println("Valores possíveis para " + this.nome + " = " + this.valores);
        Scanner s = new Scanner(System.in, "ISO-8859-1");
        boolean existe = false;
        String resposta = null;
        String[] respostas = null;
        while(!existe) {
            System.out.print("Digite o valor para " + this.getNome() + ": ");
            resposta = s.nextLine();
            respostas = resposta.split(",");
            for(int i = 0; i < respostas.length; i++) {
                if(!valido(respostas[i])) {
                    break;
                }
                if(i == respostas.length-1) {
                    existe = true;
                }
            }
        }
        if((this.tipo.equals("u") || this.tipo.equals("n")) && respostas.length > 1) {
            pergunta();
        }
        else {
            for(int i = 0; i < respostas.length; i++) {
                this.addValores_setados((T) respostas[i]);
            }
        }   
    }
    
    public boolean valido(String valor) {
        if(this.tipo.equals("n")) {
            if(valor.toString().matches("[0-9]*")) {
                String[] margens = this.valores.get(0).toString().split(";");
                if(Integer.parseInt(valor.toString()) >= Integer.parseInt(margens[0]) && Integer.parseInt(valor.toString()) <= Integer.parseInt(margens[1])) {
                   return true;
                }
            }
        }
        else {
            for(int i = 0; i < this.valores.size(); i++) {
                if(valor.equals(this.valores.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean checarNumerico(ArrayList<T> valores) {
        if(valores.size() == 1) {
            if(valores.get(0).toString().matches("[0-9]*;[0-9]*")) {
                String[] valores2 = valores.get(0).toString().split(";");
                if(Integer.parseInt(valores2[0]) < Integer.parseInt(valores2[1])) {
                    return true;
                }
            }
        }
        return false;
    }
    
}
