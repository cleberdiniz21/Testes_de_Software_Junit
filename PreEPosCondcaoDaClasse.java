package exercicio05;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PreEPosCondcaoDaClasse {
	
	//Aqui é executado os comandos sequenciais, beforeclass é executado antes de todos os comandos, depois o before, o teste, o after por afterclass.

	@BeforeClass
	public static void PreEPosConcoesDeTeste() {
		System.out.println("Executou antes de todos os testes");
		
	}
		
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
		@AfterClass
		public static void posCondicao_DepoisClasse() {
			System.out.println("Executou depois de todos os testes!");
			
			
	}
}
	
	
	
	
	

