package boleto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestaFuncoes {
    
	// esse m�todo deve ser alterado com a utiliza��o do JUnit
	
  private static void testaPeriodoEmMeses() throws ParseException{
      SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
      System.out.println("periodoEmMeses");
      Date ini, fim;
      ini = dateFormat.parse("15/09/2013");
      fim = dateFormat.parse("15/10/2013");
      System.out.println((Funcoes.periodoEmMeses(ini, fim)==1)?"ok":"falhou");
      ini = dateFormat.parse("15/09/2013");
      fim = dateFormat.parse("30/10/2013");
      System.out.println((Funcoes.periodoEmMeses(ini, fim)==1.5)?"ok":"falhou");
  }
    
   // com a utilizacao do JUnit, nao ser� necess�ria a chamada dentro do m�todo main
    public static void main(String[] args) {
        try {
            testaPeriodoEmMeses();
        } catch (ParseException ex) {
        }
    }
}
