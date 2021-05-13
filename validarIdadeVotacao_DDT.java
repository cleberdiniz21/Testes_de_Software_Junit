package exercicio08;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//Data Driven para execução dos testes e massa de dados!

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
			
			{"Julho", 2007, "Julho, você não pode votar!" },
			{"Maria", 2006, "Maria, você não pode votar!" },
			{"Rodrigo" ,2005, "Rodrigo, seu voto é facultativo!" },
			{"Josué", 2004, "Josué, seu voto é facultativo!" },
			{"Cleber", 2003, "Cleber, seu voto é obrigatório!" },
			{"José",1996 , "José, seu voto é obrigatório!" },
			{"Romeu", 1951, "Romeu, seu voto é obrigatório!" },
			{"Miriam", 1950, "Miriam, seu voto é facultativo!" }
				
		});
		
	}
	
}
