package br.leonardo.cursomc.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import br.leonardo.cursomc.domain.PagamentoComBoleto;

@Service
public class BoletoService {

	// em uma transação verdadeira, aqui ficaria o webservice de geração do boleto bancario
	public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instanteDoPedido) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(instanteDoPedido);
		cal.add(Calendar.DAY_OF_MONTH, 7);
		pagto.setDataVencimento(cal.getTime());
		
	}
	
	
	
	
	
}
