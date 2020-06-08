package exerc01_estacionamento;

import javax.swing.JOptionPane;

public class ClasseCobranca {
    String placaCarro;
    double horaEntrada;
    double minutoEntrada;
    double horaSaida;
    double minutoSaida;
    double entradaConvertida;
    double saidaConvertida;
    private double conta;
    double dif;
    double time;

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public double getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(double horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public double getMinutoEntrada() {
        return minutoEntrada;
    }

    public void setMinutoEntrada(double minutoEntrada) {
        this.minutoEntrada = minutoEntrada;
    }

    public double getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(double horaSaida) {
        this.horaSaida = horaSaida;
    }

    public double getMinutoSaida() {
        return minutoSaida;
    }

    public void setMinutoSaida(double minutoSaida) {
        this.minutoSaida = minutoSaida;
    }

    public double getEntradaConvertida() {
        return entradaConvertida;
    }

    public void setEntradaConvertida(double entradaConvertida) {
        this.entradaConvertida = entradaConvertida;
    }

    public double getSaidaConvertida() {
        return saidaConvertida;
    }

    public void setSaidaConvertida(double saidaConvertida) {
        this.saidaConvertida = saidaConvertida;
    }

    private double getConta() {
        return conta;
    }

    private void setConta(double conta) {
        this.conta = conta;
    }

    public void converterEntrada(String PlacaCarro, double horaEntrada, double minutoEntrada){
        this.entradaConvertida = (this.minutoEntrada/60) + this.horaEntrada;
        //System.out.println("Entrada Hora:" + this.horaEntrada + "\n Entrada Minuto:"
                //+ this.minutoEntrada + "\n Entrada Convertida:" + this.entradaConvertida);
    }

    public void converterSaida(double horaSaida, double minutoSaida){
        this.saidaConvertida = (this.minutoSaida/60) + this.horaSaida;
        ///System.out.println("Saida Hora:" + this.horaSaida + "\n Saida Minuto:"
                //+ this.minutoSaida + "\n Saida Convertida:" + this.saidaConvertida);
    }
    
    public void calcularConta(){
        if (this.entradaConvertida > this.saidaConvertida){
            this.saidaConvertida = this.saidaConvertida + 24;
            dif = this.saidaConvertida - this.entradaConvertida;
            this.time = this.dif;
            while(dif > 0){
            this.conta = this.conta + 4;
            dif = dif -1;
            }
        }
        else{
            dif = this.saidaConvertida - this.entradaConvertida;
            this.time = this.dif;
            while(dif > 0){
            this.conta = this.conta + 4;
            dif = dif -1;
            }
        }
        JOptionPane.showMessageDialog(null, "CONTA DE PAGAMENTO \n" + "\n Placa do Carro: " + this.placaCarro 
        +"\n Hora de entrada: " + this.horaEntrada + "\n Minuto de entrada: " +  this.minutoEntrada + "\n Hora da Saída: " + this.horaSaida + "\n Minuto da Saída: "
        + this.minutoSaida + "\n Tempo de permanência (h): " + this.time + "\n COBRANÇA DE R$4,00 POR HORA CHEIA" +"\n Valor da Conta: R$ " + this.conta);
        
        
    }
        


}
