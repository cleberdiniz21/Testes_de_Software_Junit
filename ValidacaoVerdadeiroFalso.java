package exercicio02;

	import static org.junit.Assert.assertFalse;
	import static org.junit.Assert.assertTrue;
	import org.junit.Test;

		public class ValidacaoVerdadeiroFalso {
			
			//Neste teste h� uma valida��o verdadeira do m�todo campoEstaPresente.
			@Test
			public void validacaoVerdadeiro_Sucesso() {
				boolean campoEstaPresente = true;
				assertTrue(campoEstaPresente);	
				System.out.println("Teste executado com sucesso");
		}
			
			//Neste teste h� uma valida��o falsa do m�todo campoEstaPresente.
			@Test
			public void validacaoVerdadeiro_Falha() {
				boolean campoEstaPresente = true;
				assertFalse("Campo n�o est� presente!", campoEstaPresente);
				System.out.println("Teste falhou");	
		}
			
	}


