package boleto;

import java.util.Date;
import javax.swing.JOptionPane;

public class Boleto {

    public double calculaValorAPagar(double valor, Date vcto, Date pgto){
        double valorFinal;
        if(pgto.before(vcto)){
            double periodoAtraso = Funcoes.periodoEmMeses(vcto, pgto);
            valorFinal = valor + (valor * 1/100 * periodoAtraso);
        }else{
            valorFinal = valor;
        }
        return valorFinal;
    }
    
    
    public static void main(String[] args) {
        Boleto boleto = new Boleto();
        double valor = Double.parseDouble(JOptionPane.showInputDialog(
                "Informe o valor devido"));
        Date dataVcto = Funcoes.leiaDate("Informe a data do vencimento");
        Date dataPgto = Funcoes.leiaDate("Informe a data do pagamento");
        double valorFinal = boleto.calculaValorAPagar(valor, dataVcto, dataPgto);
        JOptionPane.showMessageDialog(null, "Valor Final: "+valorFinal);
    }
}
