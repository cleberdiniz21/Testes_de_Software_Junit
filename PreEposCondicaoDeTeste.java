package exercicio04;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PreEposCondicaoDeTeste {
	
	
	@Before
	public void preCondicao () {
		System.out.println("Executou a pré condiçaõ!");
		
	}
	
	@Test
	public void exibicaoPrePosCondicao_Teste1() {
		System.out.println("Executou o Teste 01!");
	}
	
	@Test
	public void exibicaoPrePosCondicao_Teste2() {
		System.out.println("Executou o Teste 02!");
	}
		
	@After
	public void posCondicao() {
		System.out.println("Executou o pós condiçaõ!");
		
	}
}
