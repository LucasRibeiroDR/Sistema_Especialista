package gui;

import base.*;
import estruturas.*;
import java.util.ArrayList;
import motor.*;

public class Main {
    
    public static void main(String[] args) throws Exception {

        Base base = new Base();
        
        
        ArrayList<String> valores_anoLancamento = new ArrayList();
        valores_anoLancamento.add("2017");
        valores_anoLancamento.add("2016");
        valores_anoLancamento.add("2015");
        valores_anoLancamento.add("2014");
        valores_anoLancamento.add("2012");
        valores_anoLancamento.add("2011");
        Variavel anoLancamento = new Variavel(true, "anoLancamento", "u", valores_anoLancamento);
        
        base.addVariavel(anoLancamento);
        
        ArrayList<String> valores_cameraFrontal = new ArrayList();
        valores_cameraFrontal.add("5");
        valores_cameraFrontal.add("13");
        valores_cameraFrontal.add("8");
        valores_cameraFrontal.add("2");
        valores_cameraFrontal.add("0");
        valores_cameraFrontal.add("5");
        valores_cameraFrontal.add("2.1");
        valores_cameraFrontal.add("1");
        valores_cameraFrontal.add("0.3");
        Variavel cameraFrontal = new Variavel(false, "cameraFrontal", "u", valores_cameraFrontal);
        
        base.addVariavel(cameraFrontal);
        
        ArrayList<String> valores_cameraTraseira = new ArrayList();
        valores_cameraTraseira.add("12");
        valores_cameraTraseira.add("8");
        valores_cameraTraseira.add("13");
        valores_cameraTraseira.add("5");
        valores_cameraTraseira.add("16");
        valores_cameraTraseira.add("23");
        valores_cameraTraseira.add("13");
        valores_cameraTraseira.add("21");
        Variavel cameraTraseira = new Variavel(false, "cameraTraseira", "u", valores_cameraTraseira);
        
        base.addVariavel(cameraTraseira);
        
        ArrayList<String> valores_capacidadeBateria = new ArrayList();
        valores_capacidadeBateria.add("2915");
        valores_capacidadeBateria.add("3450");
        valores_capacidadeBateria.add("2000");
        valores_capacidadeBateria.add("2800");
        valores_capacidadeBateria.add("2900");
        valores_capacidadeBateria.add("3060");
        valores_capacidadeBateria.add("4000");
        valores_capacidadeBateria.add("3000");
        valores_capacidadeBateria.add("2750");
        valores_capacidadeBateria.add("1715");
        valores_capacidadeBateria.add("1642");
        valores_capacidadeBateria.add("5000");
        valores_capacidadeBateria.add("1230");
        valores_capacidadeBateria.add("3300");
        valores_capacidadeBateria.add("3000");
        valores_capacidadeBateria.add("3050");
        valores_capacidadeBateria.add("4100");
        valores_capacidadeBateria.add("3020");
        valores_capacidadeBateria.add("3100");
        valores_capacidadeBateria.add("1905");
        valores_capacidadeBateria.add("3430");
        valores_capacidadeBateria.add("2900");
        valores_capacidadeBateria.add("3600");
        valores_capacidadeBateria.add("3500");
        valores_capacidadeBateria.add("2300");
        valores_capacidadeBateria.add("3760");
        Variavel capacidadeBateria = new Variavel(false, "valores_capacidadeBateria", "u", valores_capacidadeBateria);
        
        base.addVariavel(capacidadeBateria);
        
        ArrayList<String> valores_capacidadeArmazenamentoInterno = new ArrayList();
        valores_capacidadeArmazenamentoInterno.add("12");
        valores_capacidadeArmazenamentoInterno.add("8");
        valores_capacidadeArmazenamentoInterno.add("13");
        valores_capacidadeArmazenamentoInterno.add("5");
        valores_capacidadeArmazenamentoInterno.add("16");
        valores_capacidadeArmazenamentoInterno.add("23");
        valores_capacidadeArmazenamentoInterno.add("13");
        valores_capacidadeArmazenamentoInterno.add("21");
        Variavel capacidadeArmazenamentoInterno = new Variavel(false, "valores_capacidadeArmazenamentoInterno", "u", valores_capacidadeArmazenamentoInterno);
        
        base.addVariavel(capacidadeArmazenamentoInterno);
        
         ArrayList<String> valores_capacidadeMicroSD = new ArrayList();
        valores_capacidadeMicroSD.add("0");
        valores_capacidadeMicroSD.add("128");
        valores_capacidadeMicroSD.add("2048");
        valores_capacidadeMicroSD.add("32");
        valores_capacidadeMicroSD.add("200");
        Variavel capacidadeMicroSD = new Variavel(false, "valores_capacidadeMicroSD", "u", valores_capacidadeMicroSD);
        
        base.addVariavel(capacidadeMicroSD);
        
        ArrayList<String> valores_Conexao4g = new ArrayList();
        valores_Conexao4g.add("Sim");
        valores_Conexao4g.add("Não");
        Variavel Conexao4g = new Variavel(false, "Conexao4g", "u", valores_Conexao4g);
        
        base.addVariavel(Conexao4g);
        
        ArrayList<String> valores_DensidadePixels = new ArrayList();
        valores_DensidadePixels.add("387");
        valores_DensidadePixels.add("245");
        valores_DensidadePixels.add("401");
        valores_DensidadePixels.add("326");
        valores_DensidadePixels.add("453");
        valores_DensidadePixels.add("441");
        valores_DensidadePixels.add("294");
        valores_DensidadePixels.add("218");
        valores_DensidadePixels.add("564");
        valores_DensidadePixels.add("554");
        valores_DensidadePixels.add("534");
        valores_DensidadePixels.add("403");
        valores_DensidadePixels.add("258");
        valores_DensidadePixels.add("294");
        valores_DensidadePixels.add("386");
        valores_DensidadePixels.add("220");
        valores_DensidadePixels.add("259");
        valores_DensidadePixels.add("315");
        valores_DensidadePixels.add("294");
        valores_DensidadePixels.add("233");
        valores_DensidadePixels.add("403");
        valores_DensidadePixels.add("535");
        valores_DensidadePixels.add("541");
        valores_DensidadePixels.add("520");
        valores_DensidadePixels.add("424");
        valores_DensidadePixels.add("570");
        valores_DensidadePixels.add("529");
        valores_DensidadePixels.add("515");
        valores_DensidadePixels.add("577");
        valores_DensidadePixels.add("424");
        valores_DensidadePixels.add("534");
        valores_DensidadePixels.add("806");
        Variavel DensidadePixels = new Variavel(false, "valores_DensidadePixels", "u", valores_DensidadePixels);
        
        base.addVariavel(DensidadePixels);
        
        ArrayList<String> valores_Dimensoes = new ArrayList();
        valores_Dimensoes.add("158.2 x 77.9 x 7.3 mm");
        valores_Dimensoes.add("138.3 x 67.1 x 7.1 mm");
        valores_Dimensoes.add("158.1 x 77.8 x 7.1 mm");
        valores_Dimensoes.add("123.8 x 58.6 x 7.6 mm");
        valores_Dimensoes.add("152.5 x 77.2 x 10.9 mm");
        valores_Dimensoes.add("154.3 x 77 x 7.99 mm");
        valores_Dimensoes.add("152.59 x 77.2 x 7.69 mm");
        valores_Dimensoes.add("156.4 x 77.4 x 7.5 mm");
        valores_Dimensoes.add("128 x 90.3 x 9.3 mm");
        valores_Dimensoes.add("110 x 60 x 11.4 mm");
        valores_Dimensoes.add("156.4 x 77.4 x 7.5 mm");
        valores_Dimensoes.add("151 x 76 x 8.4 mm");
        valores_Dimensoes.add("141.9 x 70.5 x 8.2 mm");
        valores_Dimensoes.add("142 x 71 x 8.2 mm");
        valores_Dimensoes.add("143 x 71.4 x 8.6 mm");
        valores_Dimensoes.add("132.5 x 66 x 9.9 mm");
        valores_Dimensoes.add("148.9 x 71.9 x 7.9 mm");
        valores_Dimensoes.add("149.4 x 73.9 x 7.3 mm");
        valores_Dimensoes.add("148.7 x 76.7 x 9.8 mm");
        valores_Dimensoes.add("149.1 x 75.3 x 9.4 mm");
        valores_Dimensoes.add("154.3 x 79.2 x 9.6 mm");
        valores_Dimensoes.add("156.7 x 78 x 7.5 mm");
        valores_Dimensoes.add("153.6. x 75.2 x 7.25 mm");
        valores_Dimensoes.add("153.6 x 75.8 x 8.1 mm");
        valores_Dimensoes.add("153.6 x 75.5 x 8.2 mm");
        valores_Dimensoes.add("141.9 x 69.9 x 8.3 mm");
        valores_Dimensoes.add("150.6 x 75.2 x 8.7 mm");
        valores_Dimensoes.add("140.2 x 72.4 x 8.8 mm");
        valores_Dimensoes.add("141.3 x 72.2 x 8.8 mm");
        valores_Dimensoes.add("157.9 x 81.5 x 9 mm");
        valores_Dimensoes.add("141.3 x 72.2 x 8.8 mm");
        valores_Dimensoes.add("136.1 x 67.8 x 9.9 mm");
        valores_Dimensoes.add("118.9 x 65.5 x 11.6 mm");
        valores_Dimensoes.add("150 x 76 x 8.65 mm");
        valores_Dimensoes.add("139.3 x 69.5 x 8.5 mm");
        valores_Dimensoes.add("139.5 x 70.4 x 8.5 mm");
        valores_Dimensoes.add("127 x 65 x 9.9 mm");
        valores_Dimensoes.add("153.3 x 75.3 x 5.19 mm");
        valores_Dimensoes.add("156.4 x 76.4 x 6.99 mm");
        valores_Dimensoes.add("149.8 x 78 x 7.6 mm");
        valores_Dimensoes.add("153.9 x 76.2 x 11.06 mm");
        valores_Dimensoes.add("140.8 x 72.4 x 10 mm");
        valores_Dimensoes.add("150.2 x 74 x 7.7 mm");
        valores_Dimensoes.add("148.9 x 68.1 x 8 mm");
        valores_Dimensoes.add("154.4 x 75.8 x 6.9 mm");
        valores_Dimensoes.add("153.2 x 76.1 x 7.6 mm");
        valores_Dimensoes.add("142.1 x 70.1 x 7 mm");
        valores_Dimensoes.add("150.9 x 72.6 x 7.7 mm");
        valores_Dimensoes.add("146 x 72 x 8.1 mm");
        valores_Dimensoes.add("154.4 x 75.8 x 7.8 mm");
        Variavel Dimensoes  = new Variavel(false, "Dimensoes ", "u", valores_Dimensoes);
        
        base.addVariavel(Dimensoes );
        
      
        
        MotorDeInferencia m = new MotorDeInferencia(base);
        m.start();
        
    }
    
}
