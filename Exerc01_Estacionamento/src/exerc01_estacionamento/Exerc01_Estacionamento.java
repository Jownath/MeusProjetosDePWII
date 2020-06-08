package exerc01_estacionamento;
import javax.swing.JOptionPane;
public class Exerc01_Estacionamento {
    public static void main(String[] args) {
        //CLASSE PRINCIPAL
        ClasseCobranca dados = new ClasseCobranca();
        
        dados.setPlacaCarro(JOptionPane.showInputDialog("Digite a placa do carro: "));
        dados.setHoraEntrada(Double.parseDouble(JOptionPane.showInputDialog("Digite a Hora de Entrada")));
        dados.setMinutoEntrada(Double.parseDouble(JOptionPane.showInputDialog("Digite o Minuto de Entrada")));
        
        dados.converterEntrada(dados.getPlacaCarro(), dados.getHoraEntrada(), dados.getMinutoEntrada());
        
           
        dados.setHoraSaida(Double.parseDouble(JOptionPane.showInputDialog("Digite a Hora de Saída")));
        dados.setMinutoSaida(Double.parseDouble(JOptionPane.showInputDialog("Digite o Minuto de Saída")));
        
        dados.converterSaida(dados.getHoraSaida(), dados.getMinutoSaida());
        
        dados.calcularConta();
         
    }
    
}
