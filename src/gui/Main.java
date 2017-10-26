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
        
      
      
        
        /// ################################################################
        /// # REGRAS                                                       #
        /// ################################################################
        
        ArrayList<Antecedente> antecedentes_premios = new ArrayList();
        Antecedente antecedentes_premios_1 = new Antecedente(premiacao, "<", "50000");
        antecedentes_premios.add(antecedentes_premios_1);
        ArrayList<Consequente> consequentes_premios = new ArrayList();
        Consequente consequente_premios = new Consequente(premios, "Baixo");
        consequentes_premios.add(consequente_premios);
        Regra regra_premios = new Regra("Premios Baixo", antecedentes_premios, consequentes_premios);
        
        base.addRegra(regra_premios);
        
        ArrayList<Antecedente> antecedentes_premios_medio = new ArrayList();
        Antecedente antecedentes_premios_medio_1 = new Antecedente(premiacao, ">=", "50000");
        antecedentes_premios_medio.add(antecedentes_premios_medio_1);
      Antecedente antecedentes_premios_medio_2 = new Antecedente(premiacao, "<", "500000" , "E");
      antecedentes_premios_medio.add(antecedentes_premios_medio_2);
        ArrayList<Consequente> consequentes_premios_medio = new ArrayList();
        Consequente consequente_premios_medio = new Consequente(premios, "Médio");
        consequentes_premios_medio.add(consequente_premios_medio);
        Regra regra_premios_medio = new Regra("Premios Medio", antecedentes_premios_medio, consequentes_premios_medio);
        
        base.addRegra(regra_premios_medio);
        
        ArrayList<Antecedente> antecedentes_premios_alto = new ArrayList();
        Antecedente antecedentes_premios_alto_1 = new Antecedente(premiacao, ">", "50000");
        antecedentes_premios_alto.add(antecedentes_premios_alto_1);
        ArrayList<Consequente> consequentes_premios_alto = new ArrayList();
        Consequente consequente_premios_alto = new Consequente(premios, "Alto");
        consequentes_premios_alto.add(consequente_premios_alto);
        Regra regra_premios_alto = new Regra("Premios Alto", antecedentes_premios_alto, consequentes_premios_alto);
        
        base.addRegra(regra_premios_alto);
        
        ArrayList<Antecedente> antecedentes_tempo_meses = new ArrayList();
        Antecedente antecedentes_tempo_meses_1 = new Antecedente(tempo_meses, "<", "12");
        antecedentes_tempo_meses.add(antecedentes_tempo_meses_1);
        ArrayList<Consequente> consequentes_tempo_meses = new ArrayList();
        Consequente consequente_tempo_meses = new Consequente(instabilidade, "Instavel");
        consequentes_tempo_meses.add(consequente_tempo_meses);
        Regra regra_tempo_meses = new Regra("Jogador Instavel", antecedentes_tempo_meses, consequentes_tempo_meses);
        
        base.addRegra(regra_tempo_meses);
        
        ArrayList<Antecedente> antecedentes_tempo_medio_estavel = new ArrayList();
        Antecedente antecedentes_tempo_medio_estavel_1 = new Antecedente(tempo_meses, ">=", "12");
        antecedentes_tempo_medio_estavel.add(antecedentes_tempo_medio_estavel_1);
        ArrayList<Consequente> consequentes_tempo_medio_estavel = new ArrayList();
        Consequente consequente_tempo_medio_estavel = new Consequente(instabilidade, "Estavel");
        consequentes_tempo_medio_estavel.add(consequente_tempo_medio_estavel);
        Regra regra_tempo_medio_estavel = new Regra("Jogador Estavel", antecedentes_tempo_medio_estavel, consequentes_tempo_medio_estavel);
        
        base.addRegra(regra_tempo_medio_estavel);
        
        ArrayList<Antecedente> antecedentes_jogador_experiente = new ArrayList();
        Antecedente antecedentes_jogador_experiente_1 = new Antecedente(tempo_profissional, ">", "6");
        antecedentes_jogador_experiente.add(antecedentes_jogador_experiente_1);
        ArrayList<Consequente> consequentes_jogador_experiente = new ArrayList();
        Consequente consequente_jogador_experiente = new Consequente(jogador_experiente, "Muito");
        consequentes_jogador_experiente.add(consequente_jogador_experiente);
        Regra regra_jogador_experiente = new Regra("Jogador Muito Experiente", antecedentes_jogador_experiente, consequentes_jogador_experiente);
        
        base.addRegra(regra_jogador_experiente);
                
        ArrayList<Antecedente> antecedentes_jogador_medio_experiente = new ArrayList();
//        Antecedente antecedentes_jogador_medio_experiente_1 = new Antecedente(tempo_profissional, "<=", "6");
//        antecedentes_jogador_medio_experiente.add(antecedentes_jogador_medio_experiente_1);
        Antecedente antecedentes_jogador_medio_experiente_2 = new Antecedente(tempo_profissional, ">", "3" ,"E");
        antecedentes_jogador_medio_experiente.add(antecedentes_jogador_medio_experiente_2);
        ArrayList<Consequente> consequentes_jogador_medio_experiente = new ArrayList();
        Consequente consequente_jogador_medio_experiente = new Consequente(jogador_experiente, "Médio");
        consequentes_jogador_medio_experiente.add(consequente_jogador_medio_experiente);
        Regra regra_jogador_medio_experiente = new Regra("Jogador Medio Experiente", antecedentes_jogador_medio_experiente, consequentes_jogador_medio_experiente);

        base.addRegra(regra_jogador_medio_experiente);
        
        ArrayList<Antecedente> antecedentes_jogador_pouco_experiente = new ArrayList();
        Antecedente antecedentes_jogador_pouco_experiente_1 = new Antecedente(tempo_profissional, "<=", "3");
        antecedentes_jogador_pouco_experiente.add(antecedentes_jogador_pouco_experiente_1);
        ArrayList<Consequente> consequentes_jogador_pouco_experiente = new ArrayList();
        Consequente consequente_jogador_pouco_experiente = new Consequente(jogador_experiente, "Pouco");
        consequentes_jogador_pouco_experiente.add(consequente_jogador_pouco_experiente);
        Regra regra_jogador_pouco_experiente = new Regra("Jogador pouco Experiente", antecedentes_jogador_pouco_experiente, consequentes_jogador_pouco_experiente);

        base.addRegra(regra_jogador_pouco_experiente);
        
        ArrayList<Antecedente> antecedentes_jogador_jovem = new ArrayList();
        Antecedente antecedentes_jogador_jovem_1 = new Antecedente(idade, "<", "25");
        antecedentes_jogador_jovem.add(antecedentes_jogador_jovem_1);
        ArrayList<Consequente> consequentes_jogador_jovem = new ArrayList();
        Consequente consequente_jogador_jovem = new Consequente(jogador_jovem, "Sim");
        consequentes_jogador_jovem.add(consequente_jogador_jovem);
        Regra regra_jogador_jovem = new Regra("Jogador Jovem", antecedentes_jogador_jovem, consequentes_jogador_jovem);

        base.addRegra(regra_jogador_jovem);
        
        ArrayList<Antecedente> antecedentes_jogador_nao_jovem = new ArrayList();
        Antecedente antecedentes_jogador_nao_jovem_1 = new Antecedente(idade, ">=", "25");
        antecedentes_jogador_nao_jovem.add(antecedentes_jogador_nao_jovem_1);
        ArrayList<Consequente> consequentes_jogador_nao_jovem = new ArrayList();
        Consequente consequente_jogador_nao_jovem = new Consequente(jogador_jovem, "Não");
        consequentes_jogador_nao_jovem.add(consequente_jogador_nao_jovem);
        Regra regra_jogador_nao_jovem = new Regra("Jogador nao Jovem", antecedentes_jogador_nao_jovem, consequentes_jogador_nao_jovem);

        base.addRegra(regra_jogador_nao_jovem);
        
        ArrayList<Antecedente> antecedentes_var1 = new ArrayList();
        Antecedente antecedente_var1_1 = new Antecedente(nacionalidade, "=", "Brasil");
        antecedentes_var1.add(antecedente_var1_1);
        Antecedente antecedente_var1_2 = new Antecedente(time_atual, "=", "Sk Gaming", "E");
        antecedentes_var1.add(antecedente_var1_2);
        Antecedente antecedente_var1_3 = new Antecedente(genero, "=", "Masculino", "E");
        antecedentes_var1.add(antecedente_var1_3);
        Antecedente antecedente_var1_4 = new Antecedente(jogos, "=", "Global Offensive", "E");
        antecedentes_var1.add(antecedente_var1_4);
        Antecedente antecedente_var1_5 = new Antecedente(apelido, "=", "Fallen", "E");
        antecedentes_var1.add(antecedente_var1_5);
        Antecedente antecedente_var1_6 = new Antecedente(jogador_jogando, "=", "Sim", "E");
        antecedentes_var1.add(antecedente_var1_6);
        Antecedente antecedente_var1_7 = new Antecedente(jogador_experiente, "=", "Muito", "E");
        antecedentes_var1.add(antecedente_var1_7);
        Antecedente antecedente_var1_8 = new Antecedente(jogador_jovem, "=", "Não", "E");
        antecedentes_var1.add(antecedente_var1_8);
        Antecedente antecedente_var1_9 = new Antecedente(premios, "=", "Alto", "E");
        antecedentes_var1.add(antecedente_var1_9);
        ArrayList<Consequente> consequentes_var1 = new ArrayList();
        Consequente consequente_var1 = new Consequente(jogador, "Gabriel Toledo");
        consequentes_var1.add(consequente_var1);
        Regra var1 = new Regra("Gabriel Toledo", antecedentes_var1, consequentes_var1);

        base.addRegra(var1);

        
        ArrayList<Antecedente> antecedentes_var2 = new ArrayList();
        Antecedente antecedente_var2_1 = new Antecedente(nacionalidade, "=", "Ucrania");
        antecedentes_var2.add(antecedente_var2_1);
        Antecedente antecedente_var2_2 = new Antecedente(time_atual, "=", "Natus Vinceres", "E");
        antecedentes_var2.add(antecedente_var2_2);
        Antecedente antecedente_var2_3 = new Antecedente(genero, "=", "Masculino", "E");
        antecedentes_var2.add(antecedente_var2_3);
        Antecedente antecedente_var2_4 = new Antecedente(jogos, "=", "Global Offensive", "E");
        antecedentes_var2.add(antecedente_var2_4);
        Antecedente antecedente_var2_5 = new Antecedente(apelido, "=", "s1mple", "E");
        antecedentes_var2.add(antecedente_var2_5);
        Antecedente antecedente_var2_6 = new Antecedente(jogador_jogando, "=", "Sim", "E");
        antecedentes_var2.add(antecedente_var2_6);
        Antecedente antecedente_var2_7 = new Antecedente(jogador_experiente, "=", "Médio", "E");
        antecedentes_var2.add(antecedente_var2_7);
        Antecedente antecedente_var2_8 = new Antecedente(jogador_jovem, "=", "Sim", "E");
        antecedentes_var2.add(antecedente_var2_8);
        Antecedente antecedente_var2_9 = new Antecedente(premios, "=", "Médio", "E");
        antecedentes_var2.add(antecedente_var2_9);
        ArrayList<Consequente> consequentes_var2 = new ArrayList();
        Consequente consequente_var2 = new Consequente(jogador, "Oleksandr Kostylev");
        consequentes_var2.add(consequente_var2);
        Regra var2 = new Regra("Oleksandr Kostylev", antecedentes_var2, consequentes_var2);

        base.addRegra(var2);
       
        ArrayList<Antecedente> antecedentes_var3 = new ArrayList();
        Antecedente antecedente_var3_1 = new Antecedente(nacionalidade, "=", "Brasil");
        antecedentes_var3.add(antecedente_var3_1);
        Antecedente antecedente_var3_2 = new Antecedente(time_atual, "=", "Sk Gaming", "E");
        antecedentes_var3.add(antecedente_var3_2);
        Antecedente antecedente_var3_3 = new Antecedente(genero, "=", "Masculino", "E");
        antecedentes_var3.add(antecedente_var3_3);
        Antecedente antecedente_var3_4 = new Antecedente(jogos, "=", "Global Offensive", "E");
        antecedentes_var3.add(antecedente_var3_4);
        Antecedente antecedente_var3_5 = new Antecedente(apelido, "=", "fer", "E");
        antecedentes_var3.add(antecedente_var3_5);
        Antecedente antecedente_var3_6 = new Antecedente(jogador_jogando, "=", "Sim", "E");
        antecedentes_var3.add(antecedente_var3_6);
        Antecedente antecedente_var3_7 = new Antecedente(jogador_experiente, "=", "Médio", "E");
        antecedentes_var3.add(antecedente_var3_7);
        Antecedente antecedente_var3_8 = new Antecedente(jogador_jovem, "=", "Não", "E");
        antecedentes_var3.add(antecedente_var3_8);
        Antecedente antecedente_var3_9 = new Antecedente(premios, "=", "Alto", "E");
        antecedentes_var3.add(antecedente_var3_9);
        ArrayList<Consequente> consequentes_var3 = new ArrayList();
        Consequente consequente_var3 = new Consequente(jogador, "Fernando de Alvarenga");
        consequentes_var3.add(consequente_var3);
        Regra var3 = new Regra("Fernado de Alvarenga", antecedentes_var3, consequentes_var3);

        base.addRegra(var3);

        ArrayList<Antecedente> antecedentes_var4 = new ArrayList();
        Antecedente antecedente_var4_1 = new Antecedente(nacionalidade, "=", "Brasil");
        antecedentes_var4.add(antecedente_var4_1);
        Antecedente antecedente_var4_2 = new Antecedente(time_atual, "=", "Sk Gaming", "E");
        antecedentes_var4.add(antecedente_var4_2);
        Antecedente antecedente_var4_3 = new Antecedente(genero, "=", "Masculino", "E");
        antecedentes_var4.add(antecedente_var4_3);
        Antecedente antecedente_var4_4 = new Antecedente(jogos, "=", "Global Offensive", "E");
        antecedentes_var4.add(antecedente_var4_4);
        Antecedente antecedente_var4_5 = new Antecedente(apelido, "=", "coldzera", "E");
        antecedentes_var4.add(antecedente_var4_5);
        Antecedente antecedente_var4_6 = new Antecedente(jogador_jogando, "=", "Sim", "E");
        antecedentes_var4.add(antecedente_var4_6);
        Antecedente antecedente_var4_7 = new Antecedente(jogador_experiente, "=", "Médio", "E");
        antecedentes_var4.add(antecedente_var4_7);
        Antecedente antecedente_var4_8 = new Antecedente(jogador_jovem, "=", "Sim", "E");
        antecedentes_var4.add(antecedente_var4_8);
        Antecedente antecedente_var4_9 = new Antecedente(premios, "=", "Alto", "E");
        antecedentes_var4.add(antecedente_var4_9);
        ArrayList<Consequente> consequentes_var4 = new ArrayList();
        Consequente consequente_var4 = new Consequente(jogador, "Marcelo David");
        consequentes_var4.add(consequente_var4);
        Regra var4 = new Regra("Marcelo David", antecedentes_var4, consequentes_var4);

        base.addRegra(var4);
        
        ArrayList<Antecedente> antecedentes_var5 = new ArrayList();
        Antecedente antecedente_var5_1 = new Antecedente(nacionalidade, "=", "Brasil");
        antecedentes_var5.add(antecedente_var5_1);
        Antecedente antecedente_var5_2 = new Antecedente(time_atual, "=", "Sk Gaming", "E");
        antecedentes_var5.add(antecedente_var5_2);
        Antecedente antecedente_var5_3 = new Antecedente(genero, "=", "Masculino", "E");
        antecedentes_var5.add(antecedente_var5_3);
        Antecedente antecedente_var5_4 = new Antecedente(jogos, "=", "Global Offensive", "E");
        antecedentes_var5.add(antecedente_var5_4);
        Antecedente antecedente_var5_5 = new Antecedente(apelido, "=", "felps", "E");
        antecedentes_var5.add(antecedente_var5_5);
        Antecedente antecedente_var5_6 = new Antecedente(jogador_jogando, "=", "Sim", "E");
        antecedentes_var5.add(antecedente_var5_6);
        Antecedente antecedente_var5_7 = new Antecedente(jogador_experiente, "=", "Médio", "E");
        antecedentes_var5.add(antecedente_var5_7);
        Antecedente antecedente_var5_8 = new Antecedente(jogador_jovem, "=", "Sim", "E");
        antecedentes_var5.add(antecedente_var5_8);
        Antecedente antecedente_var5_9 = new Antecedente(premios, "=", "Alto", "E");
        antecedentes_var5.add(antecedente_var5_9);
        ArrayList<Consequente> consequentes_var5 = new ArrayList();
        Consequente consequente_var5 = new Consequente(jogador, "João Vasconcellos");
        consequentes_var5.add(consequente_var5);
        Regra var5 = new Regra("João Vascocellos", antecedentes_var5, consequentes_var5);
        
  
        base.addRegra(var5);
        
        
        ArrayList<Antecedente> antecedentes_var6 = new ArrayList();
        Antecedente antecedente_var6_1 = new Antecedente(nacionalidade, "=", "Brasil");
        antecedentes_var6.add(antecedente_var6_1);
        Antecedente antecedente_var6_2 = new Antecedente(time_atual, "=", "Sk Gaming", "E");
        antecedentes_var6.add(antecedente_var6_2);
        Antecedente antecedente_var6_3 = new Antecedente(genero, "=", "Masculino", "E");
        antecedentes_var6.add(antecedente_var6_3);
        Antecedente antecedente_var6_4 = new Antecedente(jogos, "=", "Global Offensive", "E");
        antecedentes_var6.add(antecedente_var6_4);
        Antecedente antecedente_var6_5 = new Antecedente(apelido, "=", "Taco", "E");
        antecedentes_var6.add(antecedente_var6_5);
        Antecedente antecedente_var6_6 = new Antecedente(jogador_jogando, "=", "Sim", "E");
        antecedentes_var6.add(antecedente_var6_6);
        Antecedente antecedente_var6_7 = new Antecedente(jogador_experiente, "=", "Médio", "E");
        antecedentes_var6.add(antecedente_var6_7);
        Antecedente antecedente_var6_8 = new Antecedente(jogador_jovem, "=", "Sim", "E");
        antecedentes_var6.add(antecedente_var6_8);
        Antecedente antecedente_var6_9 = new Antecedente(premios, "=", "Alto", "E");
        antecedentes_var6.add(antecedente_var6_9);
        ArrayList<Consequente> consequentes_var6 = new ArrayList();
        Consequente consequente_var6 = new Consequente(jogador, "Epitácio de Melo");
        consequentes_var6.add(consequente_var6);
        Regra var6 = new Regra("Epitácio de Melo", antecedentes_var6, consequentes_var6);
        
        base.addRegra(var6);
        
        
        ArrayList<Antecedente> antecedentes_var7 = new ArrayList();
        Antecedente antecedente_var7_1 = new Antecedente(nacionalidade, "=", "Russia");
        antecedentes_var7.add(antecedente_var7_1);
        Antecedente antecedente_var7_2 = new Antecedente(time_atual, "=", "Natus Vinceres", "E");
        antecedentes_var7.add(antecedente_var7_2);
        Antecedente antecedente_var7_3 = new Antecedente(genero, "=", "Masculino", "E");
        antecedentes_var7.add(antecedente_var7_3);
        Antecedente antecedente_var7_4 = new Antecedente(jogos, "=", "Global Offensive", "E");
        antecedentes_var7.add(antecedente_var7_4);
        Antecedente antecedente_var7_5 = new Antecedente(apelido, "=", "seized", "E");
        antecedentes_var7.add(antecedente_var7_5);
        Antecedente antecedente_var7_6 = new Antecedente(jogador_jogando, "=", "Sim", "E");
        antecedentes_var7.add(antecedente_var7_6);
        Antecedente antecedente_var7_7 = new Antecedente(jogador_experiente, "=", "Médio", "E");
        antecedentes_var7.add(antecedente_var7_7);
        Antecedente antecedente_var7_8 = new Antecedente(jogador_jovem, "=", "Sim", "E");
        antecedentes_var7.add(antecedente_var7_8);
        Antecedente antecedente_var7_9 = new Antecedente(premios, "=", "Médio", "E");
        antecedentes_var7.add(antecedente_var7_9);
        ArrayList<Consequente> consequentes_var7 = new ArrayList();
        Consequente consequente_var7 = new Consequente(jogador, "Denis Kostin");
        consequentes_var7.add(consequente_var7);
        Regra var7 = new Regra("Denis Kostin", antecedentes_var7, consequentes_var7);
        
        base.addRegra(var7);
        
         ArrayList<Antecedente> antecedentes_var8 = new ArrayList();
        Antecedente antecedente_var8_1 = new Antecedente(nacionalidade, "=", "Suécia");
        antecedentes_var8.add(antecedente_var8_1);
        Antecedente antecedente_var8_2 = new Antecedente(time_atual, "=", "Team Secret", "E");
        antecedentes_var8.add(antecedente_var8_2);
        Antecedente antecedente_var8_3 = new Antecedente(genero, "=", "Feminino", "E");
        antecedentes_var8.add(antecedente_var8_3);
        Antecedente antecedente_var8_4 = new Antecedente(jogos, "=", "Global Offensive", "E");
        antecedentes_var8.add(antecedente_var8_4);
        Antecedente antecedente_var8_5 = new Antecedente(apelido, "=", "mimimicheater", "E");
        antecedentes_var8.add(antecedente_var8_5);
        Antecedente antecedente_var8_6 = new Antecedente(jogador_jogando, "=", "Sim", "E");
        antecedentes_var8.add(antecedente_var8_6);
        Antecedente antecedente_var8_7 = new Antecedente(jogador_experiente, "=", "Pouco", "E");
        antecedentes_var8.add(antecedente_var8_7);
        Antecedente antecedente_var8_8 = new Antecedente(jogador_jovem, "=", "Sim", "E");
        antecedentes_var8.add(antecedente_var8_8);
        Antecedente antecedente_var8_9 = new Antecedente(premios, "=", "Baixo", "E");
        antecedentes_var8.add(antecedente_var8_9);
        ArrayList<Consequente> consequentes_var8 = new ArrayList();
        Consequente consequente_var8 = new Consequente(jogador, "Michaela Lintrup");
        consequentes_var8.add(consequente_var8);
        Regra var8 = new Regra("Michaela Lintrup", antecedentes_var8, consequentes_var8);
        
        base.addRegra(var8);
         
         
        System.out.println(base);
        
        MotorDeInferencia m = new MotorDeInferencia(base);
        m.start();
        
    }
    
}
