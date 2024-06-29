package AulaGrafoED;


import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {


        // Lê o arquivo e monta o grafo
        ArrayList<String> vertices = new ArrayList<>();
        ArrayList<String> linhasArquivo = new ArrayList<>();
        String nomeArquivo = "D:\\TreinoJAVA\\AulaGrafoED\\src\\AulaGrafoED\\mapaCentral.txt";

        Grafo.lerArquivo_montarGrafo(nomeArquivo, vertices, linhasArquivo);
        Grafo g = new Grafo(vertices);


        // LÊ O ARQUIVO E MONTA AS CONEXÕES SIMETRICAS
        g.montarConexoesSimetricas(linhasArquivo);

        //Mostrando matriz e grafo
        g.mostrarMatriz();
        g.mostrarGrafo();

        System.out.println("Tem caminho entre agudo e Julio de Castilhos? " + g.temCaminhoProfundidade("AGUDO", "JULIO DE CASTILHOS"));

    }
}
