package projetobanco;

import javax.swing.JOptionPane;

public class Banco {
        public int numConta;
        public int agencia;
        public String nome;
        private String senha;
        private double saldo;
        private boolean logado;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }
    
    public boolean logar(int agencia, int numConta, String senha){
        //DADOS PARA LOGAR: AGENCIA=1234, CONTA=1 e SENHA=password
        if (agencia == 1234 && numConta==1 && "password".equals(senha)){
            this.logado = true;
            //System.out.println("LOGADO");
            //System.out.println("Valor da variavel logado: " + this.isLogado());
            atual(this.logado);
        }
        else{
            JOptionPane.showMessageDialog(null, "Dados Incorretos");
            this.logado = false;
        }
        return this.logado;
    }
    
    public void sacar(double valor, boolean logado){
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
        }
        else {
            JOptionPane.showMessageDialog(null, "Valor excede o saldo atual");
        }
        String opcao;
        opcao = JOptionPane.showInputDialog("Deseja realizar outra opção?\n"
                + "S - SIM\n"
                + "N - NÃO");
        
        switch(opcao){
            case "S":
                atual(this.logado);
                break;
            case "N":
                JOptionPane.showMessageDialog(null, "OBRIGADO \n" 
                            + "Volte Sempre");
                System.exit(0);  //ISSO ENCERRA O SISTEMA 
                break;
            default:
                JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
        }
    }
    
    public void depositar(double valor, boolean logado){
        this.saldo = this.saldo + valor;
        String opcao;
        opcao = JOptionPane.showInputDialog("Deseja realizar outra opção?\n"
                + "S - SIM\n"
                + "N - NÃO");
        
        switch(opcao){
            case "S":
                atual(this.logado);
                break;
            case "N":
                JOptionPane.showMessageDialog(null, "OBRIGADO \n" 
                            + "Volte Sempre");
                System.exit(0);  //ISSO ENCERRA O SISTEMA 
                break;
            default:
                JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
        }
    }
    
    public void consultarSaldo(boolean logado){
        JOptionPane.showMessageDialog(null, "O saldo atual de sua conta é de \n"
                + "R$" + getSaldo());
        
        String opcao;
        opcao = JOptionPane.showInputDialog("Deseja realizar outra opção?\n"
                + "S - SIM\n"
                + "N - NÃO");
        
        switch(opcao){
            case "S":
                atual(this.logado);
                break;
            case "N":
                JOptionPane.showMessageDialog(null, "OBRIGADO \n" 
                            + "Volte Sempre");
                System.exit(0);  //ISSO ENCERRA O SISTEMA 
                break;
            default:
                JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
        }
    }
    
    public void atual(boolean logado) {
        if (logado == true) {
            int opcao;
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n"
                    + "1 - DEPÓSITO\n"
                    + "2 - SAQUE\n" 
                    + "3 - CONSULTA DE SALDO\n"
                    + "4 - SAIR"));
            switch(opcao){
                case 1:
                    depositar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Depósito")),this.logado);
                    break;
                case 2:
                    sacar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para saque")),this.logado);
                    break;
                case 3:
                    consultarSaldo(this.logado);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "OBRIGADO \n" 
                            + "Volte Sempre");
                    System.exit(0);  //ISSO ENCERRA O SISTEMA 
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
            }
        }
    }
    
}
