import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Estrutura{

    public static void main(String [] args){

        ArrayList<String> ListaNomes =  new ArrayList<String>();
        String nome;
        for(int i = 0; i<5; i++){
            nome = JOptionPane.showInputDialog(null, "Digite um nome: ");
            if(!ListaNomes.contains(nome)){
                ListaNomes.add(nome);
                ListaNomes.sort(null);
            
            }else{
                JOptionPane.showMessageDialog(null, ListaNomes, nome, i);

            }
        }
        StringBuilder resultado =  new StringBuilder();
        for(String item : ListaNomes){
            resultado.append(item).append("\n");

        }
        JOptionPane.showMessageDialog(null, resultado);

    }
}
