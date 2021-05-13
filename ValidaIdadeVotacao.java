package exercicio07;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import votacao.Votacao;

public class ValidaIdadeVotacao {
	
	@Test	
	public void idadeIgual15Anos_NaoPodeVotar() {
		assertEquals("Maria, você não pode votar!", Votacao.podeVotar("Maria", 2006));		
	}
		@Test	
		public void idadeIgual16Anos_SeuVotoEFacultativo() {
			assertEquals("Rodrigo, seu voto é facultativo!", Votacao.podeVotar("Rodrigo", 2005));	
						
	}
		@Test	
		public void idadeIgual17Anos_SeuVotoEFacultativo() {
			assertEquals("Josué, seu voto é facultativo!", Votacao.podeVotar("Josué", 2004));		
			
	}	
		@Test	
		public void idadeIgual18Anos_SeuVotoEObrigatorio() {
			assertEquals("Cleber, seu voto é obrigatório!", Votacao.podeVotar("Cleber", 2003));		
			
	}	
		@Test	
		public void idadeIgual25Anos_SeuVotoEObrigatorio() {
			assertEquals("José, seu voto é obrigatório!", Votacao.podeVotar("José", 1996));		
			
	}	
		@Test	
		public void idadeIgual70Anos_SeuVotoEObrigatorio() {
			assertEquals("Romeu, seu voto é obrigatório!", Votacao.podeVotar("Romeu", 1951));	
						
	}	
		@Test	
		public void idadeIgual71Anos_SeuVotoEFacultativo() {
			assertEquals("Miriam, seu voto é facultativo!", Votacao.podeVotar("Miriam", 1950));
	}	
}
