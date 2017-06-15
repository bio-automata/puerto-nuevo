package br.edu.ifmg.samuelterra.model.random.time;

import br.edu.ifmg.samuelterra.model.random.time.TimeDistribution;

import java.util.HashMap;
import java.util.Map;

/**
 esta classe armazena distribuições de tempo
 através de chaves

 o nome de cada distribuição corresponde
 a sigla utilizada para tal atividade
 no arquivo de descrição do cenário

 cada distribuição será salva atraveś de um
 objeto já configurado com os parametros de
 uma dada distribuição

 através do método getTime() ela
 retorna um tempo aleatório para uma
 dada distribuição

 */
public class RandomTimeGenerator {
    private Map<String,TimeDistribution> distributions;

    public void TimeGenerator(){
        distributions = new HashMap<>();
    }

    public void addTimeDistribution(String key, TimeDistribution distribution){
        distributions.put(key, distribution);
    }

    public TimeDistribution getTimeDistribution(String key){
        return distributions.get(key);
    }

    public double getTime(String key){
        return this.getTimeDistribution(key).generate();

    }
}
