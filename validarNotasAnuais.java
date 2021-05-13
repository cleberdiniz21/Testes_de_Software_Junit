package validarnotas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import MediaEscolar.MediaEscolar;

public class validarNotasAnuais {
	
	@Test	
	public void mediaAnual_MenorQue5() {
		assertEquals("Maria, voc� est� reprovado!", MediaEscolar.mediaEscolar("Maria", 4.0, 4.5, 5.0, 1.0));		
	}
	
	@Test	
	public void mediaAnual_MaiorQue5MenorQue7() {
		assertEquals("Joana, voc� est� de recupera��o!", MediaEscolar.mediaEscolar("Joana", 10, 10, 2, 2));		
	}
	
	@Test	
	public void mediaAnual_MaiorQue7() {
		assertEquals("Joana, voc� est� aprovado!", MediaEscolar.mediaEscolar("Joana", 10, 10, 10, 0));
		
	}
}
