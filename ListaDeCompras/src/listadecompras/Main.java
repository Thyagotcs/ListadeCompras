package listadecompras;

import javax.swing.JOptionPane;

public class Main {

    

    public static void main(String[] args) {
        
        String vegetais = JOptionPane.showInputDialog("Quais vegetais serão necessários? ");
        String frutas = JOptionPane.showInputDialog("Quais frutas serão necessárias? ");
        String embutidos = JOptionPane.showInputDialog("Quais embutidos serão necessários? ");
        String industrializados = JOptionPane.showInputDialog("Quais industrializados serão necessários? ");

        Produtos AdicionarLista = new Produtos();
        AdicionarLista.vegetais = (vegetais);
        AdicionarLista.frutas = (frutas);
        AdicionarLista.embutidos = (embutidos);
        AdicionarLista.industrializados = (industrializados);

        String ListaPronta = AdicionarLista.produtos();
        String MostraLista = JOptionPane.showInputDialog("Deseja olhar a lista 1-Sim 2-Não");
        int MostraListaInt = Integer.parseInt(MostraLista);
        
        if (MostraListaInt == 1) {
           System.out.println(ListaPronta);
        
        }

    }

}
