package exercicio02;

	import static org.junit.Assert.assertFalse;
	import static org.junit.Assert.assertTrue;
	import org.junit.Test;

		public class ValidacaoVerdadeiroFalso {
			
			//Neste teste há uma validação verdadeira do método campoEstaPresente.
			@Test
			public void validacaoVerdadeiro_Sucesso() {
				boolean campoEstaPresente = true;
				assertTrue(campoEstaPresente);	
				System.out.println("Teste executado com sucesso");
		}
			
			//Neste teste há uma validação falsa do método campoEstaPresente.
			@Test
			public void validacaoVerdadeiro_Falha() {
				boolean campoEstaPresente = true;
				assertFalse("Campo não está presente!", campoEstaPresente);
				System.out.println("Teste falhou");	
		}
			
	}


