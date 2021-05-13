package exercicio07;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import votacao.Votacao;

public class ValidaIdadeVotacao {
	
	@Test	
	public void idadeIgual15Anos_NaoPodeVotar() {
		assertEquals("Maria, voc� n�o pode votar!", Votacao.podeVotar("Maria", 2006));		
	}
		@Test	
		public void idadeIgual16Anos_SeuVotoEFacultativo() {
			assertEquals("Rodrigo, seu voto � facultativo!", Votacao.podeVotar("Rodrigo", 2005));	
						
	}
		@Test	
		public void idadeIgual17Anos_SeuVotoEFacultativo() {
			assertEquals("Josu�, seu voto � facultativo!", Votacao.podeVotar("Josu�", 2004));		
			
	}	
		@Test	
		public void idadeIgual18Anos_SeuVotoEObrigatorio() {
			assertEquals("Cleber, seu voto � obrigat�rio!", Votacao.podeVotar("Cleber", 2003));		
			
	}	
		@Test	
		public void idadeIgual25Anos_SeuVotoEObrigatorio() {
			assertEquals("Jos�, seu voto � obrigat�rio!", Votacao.podeVotar("Jos�", 1996));		
			
	}	
		@Test	
		public void idadeIgual70Anos_SeuVotoEObrigatorio() {
			assertEquals("Romeu, seu voto � obrigat�rio!", Votacao.podeVotar("Romeu", 1951));	
						
	}	
		@Test	
		public void idadeIgual71Anos_SeuVotoEFacultativo() {
			assertEquals("Miriam, seu voto � facultativo!", Votacao.podeVotar("Miriam", 1950));
	}	
}
