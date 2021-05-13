package exercicio08;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//Data Driven para execu��o dos testes e massa de dados!

import votacao.Votacao;

@RunWith(Parameterized.class)

public class validarIdadeVotacao_DDT {
	
	String nome;
	int anoDeNascimento;
	String resultado;
	
	public validarIdadeVotacao_DDT(String nome, int anoDeNascimento, String resultado) {
		this.nome = nome;
		this.anoDeNascimento = anoDeNascimento;
		this.resultado = resultado;
	}
	
	@Test
	public void validarObrigatoriedadeDeVoto() {
		assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));
	}
	
	@Parameters	(name = "{0} | {1} | {2}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
			
			{"Julho", 2007, "Julho, voc� n�o pode votar!" },
			{"Maria", 2006, "Maria, voc� n�o pode votar!" },
			{"Rodrigo" ,2005, "Rodrigo, seu voto � facultativo!" },
			{"Josu�", 2004, "Josu�, seu voto � facultativo!" },
			{"Cleber", 2003, "Cleber, seu voto � obrigat�rio!" },
			{"Jos�",1996 , "Jos�, seu voto � obrigat�rio!" },
			{"Romeu", 1951, "Romeu, seu voto � obrigat�rio!" },
			{"Miriam", 1950, "Miriam, seu voto � facultativo!" }
				
		});
		
	}
	
}
