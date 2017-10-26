package motor;

import estruturas.*;
import java.util.ArrayList;

public class Explicacao {
    
    ArrayList<Passo> passos;
    
    public Explicacao() {
        this.passos = new ArrayList();
    }
    
    public void addPasso(Passo p) {
        this.passos.add(p);
    }
    
    public String toString() {
        String r = "";
        for(int i = 0; i < this.passos.size(); i++) {
            if(i != 0) {
                r += "\n";
            }
            for(int j = 0; j < this.passos.get(i).getIndice(); j++) {
                r+= "\t";
            }
            r += this.passos.get(i);
        }
        return r;
    }
    
}
