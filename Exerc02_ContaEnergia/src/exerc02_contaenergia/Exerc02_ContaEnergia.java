package exerc02_contaenergia;
import javax.swing.JOptionPane;
public class Exerc02_ContaEnergia {
    public static void main(String[] args) {
        //CLASSE PRINCIPAL
        ClasseCalculo dados = new ClasseCalculo();

        dados.setLeituraAnterior(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da leitura anterior: ")));
        dados.setLeituraAtual(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da leitura atual: ")));
        
        dados.calcularSemBandeira(dados.getLeituraAnterior(), dados.getLeituraAtual());
        dados.calcularComBandeira();
        dados.notaFiscal();
    }
    
}
