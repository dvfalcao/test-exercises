package boleto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * Esta classe serve para fornecer funcionalidades de uso generico para os programas
 */
public class Funcoes {

    public static double periodoEmMeses(Date ini, Date fim){
        double meses;
        long i = ini.getTime();
        long f = fim.getTime();
        int dias = (int) ((f - i)/1000/60/60/24);
        meses = (double)dias / 30;
        return meses;
    }
    
    /**
     * Faz entrada de dados para um objeto Date.
     * @param msg Mensagem que informa ao usuario o que ele deve digitar.
     * @return Retorna a data que o usuario digitou convertida para Date.
     */
    public static Date leiaDate(String msg) {
        Date d = null;
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        boolean errou;
        do {
            errou = false;
            try {
                String dataStr = JOptionPane.showInputDialog(msg);
                d = formatador.parse(dataStr);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null,
                        "Informe a data no formato 99/99/9999");
                errou = true;
            }
        } while (errou);
        return d;
    }
    
}