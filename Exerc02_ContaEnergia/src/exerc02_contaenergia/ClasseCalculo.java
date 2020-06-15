package exerc02_contaenergia;

import javax.swing.JOptionPane;

public class ClasseCalculo {
    public int leituraAnterior;
    public int leituraAtual;
    public int gastoKW;
    public double totalSemBandeira;
    public double totalComBandeira;
    public String CorBan;

    public int getLeituraAnterior() {
        return leituraAnterior;
    }

    public void setLeituraAnterior(int leituraAnterior) {
        this.leituraAnterior = leituraAnterior;
    }

    public int getLeituraAtual() {
        return leituraAtual;
    }

    public void setLeituraAtual(int leituraAtual) {
        this.leituraAtual = leituraAtual;
    }

    public int getGastoKW() {
        return gastoKW;
    }

    public void setGastoKW(int gastoKW) {
        this.gastoKW = gastoKW;
    }

    public double getTotalSemBandeira() {
        return totalSemBandeira;
    }

    public void setTotalSemBandeira(double totalSemBandeira) {
        this.totalSemBandeira = totalSemBandeira;
    }

    public double getTotalComBandeira() {
        return totalComBandeira;
    }

    public void setTotalComBandeira(double totalComBandeira) {
        this.totalComBandeira = totalComBandeira;
    }
    
    public void calcularSemBandeira(int leituraAnterior, int leituraAtual){
        this.gastoKW = this.leituraAtual - this.leituraAnterior;
        //System.out.println("Leitura Anterior: " + this.leituraAnterior + "\n Leitura Atual: "
        //+ this.leituraAtual + "\n GastoKW: " + this.gastoKW);
        this.totalSemBandeira = (this.gastoKW * 0.30) + (this.gastoKW * 0.29);
        this.totalSemBandeira = this.totalSemBandeira + ((this.totalSemBandeira/100) * 25);
        //System.out.println("Total Sem Bandeira : " + this.totalSemBandeira);
    }
    
    public void calcularComBandeira () {
        if (this.gastoKW < 100){
            this.totalComBandeira = this.totalSemBandeira;
            CorBan = "VERDE";
        }
        else if (this.gastoKW >= 100 && this.gastoKW < 150){
            this.totalComBandeira = this.totalSemBandeira + (((this.gastoKW * 0.01343) / 100)*25) 
            + (this.gastoKW * 0.01343);
            CorBan = "AMARELO";
        }
        else if (this.gastoKW >= 150 && this.gastoKW <= 200){
            this.totalComBandeira = this.totalSemBandeira + (((this.gastoKW * 0.04169) / 100)*25) 
            + (this.gastoKW * 0.04169);
            CorBan = "VERMELHO I";
        }      
        else {
            this.totalComBandeira = this.totalSemBandeira + (((this.gastoKW * 0.06243) / 100)*25) 
            + (this.gastoKW * 0.06243);
            CorBan = "VERMELHO II";
        } 
    }
    
    public void notaFiscal () {
        JOptionPane.showMessageDialog(null, "-_-_-_-_-_ NOTA _-_-_-_-_-" +
                "\n Leitura Anterior: " + this.leituraAnterior + 
                "\n Leitura Atual: " + this.leituraAtual + 
                "\n Gasto em KW: " + this.gastoKW + 
                "\n Total sem Bandeira: " + this.totalSemBandeira + 
                "\n\n COM BANDEIRA:" +
                "\n Patamar " + this.CorBan + 
                "\n TOTAL COM BANDEIRA: " + this.totalComBandeira);

    }

    
}
