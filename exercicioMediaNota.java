package exercicioMediaNota;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import MediaEscolar.MediaEscolar;


public class exercicioMediaNota {

	String nome;
	int mediaAnual;
	String resultado;
	
	public exercicioMediaNota(String nome, int mediaAnual, String resultado) {
		this.nome = nome;
		this.mediaAnual = mediaAnual;
		this.resultado = resultado;
	}
	
	@Test
	public void validarMediaAprovacao() {
		assertEquals(resultado, MediaEscolar.mediaEscolar(nome, mediaAnual));
	}
	
	@Parameters	(name = "{0} | {1} | {2}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
			
			{"Julho", 10, "Julho, você está aprovado!" },
							
		});
		
	}
	
}
	
	

