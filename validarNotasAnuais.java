package validarnotas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import MediaEscolar.MediaEscolar;

public class validarNotasAnuais {
	
	@Test	
	public void mediaAnual_MenorQue5() {
		assertEquals("Maria, você está reprovado!", MediaEscolar.mediaEscolar("Maria", 4.0, 4.5, 5.0, 1.0));		
	}
	
	@Test	
	public void mediaAnual_MaiorQue5MenorQue7() {
		assertEquals("Joana, você está de recuperação!", MediaEscolar.mediaEscolar("Joana", 10, 10, 2, 2));		
	}
	
	@Test	
	public void mediaAnual_MaiorQue7() {
		assertEquals("Joana, você está aprovado!", MediaEscolar.mediaEscolar("Joana", 10, 10, 10, 0));
		
	}
}
