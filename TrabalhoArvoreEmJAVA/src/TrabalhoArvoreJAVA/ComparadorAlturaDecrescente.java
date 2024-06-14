package TrabalhoArvoreJAVA;

import java.util.Comparator;


public class ComparadorAlturaDecrescente implements Comparator<Atleta> {
    @Override
    public int compare(Atleta atleta1, Atleta atleta2) { //Comparando 2 objetos com o compare
        // Comparação com base na altura em ordem decrescente
        if (atleta1.getAltura() < atleta2.getAltura()) {
            return 1;
        } else if (atleta1.getAltura() > atleta2.getAltura()) {
            return -1;
        }
        return 0;
    }
}

