package exercicio06;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import exercicio01.MeuPrimeiroTeste;
import exercicio02.ValidacaoVerdadeiroFalso;
import exercicio03.ValidacaoIgualdade;
import exercicio04.PreEposCondicaoDeTeste;
import exercicio05.PreEPosCondcaoDaClasse;

// Nesta Suite de teste os comandos que seguem solicita,
// a execução de todos as classes de testes feitas na pasta src/test/java.

@RunWith(Suite.class)
@SuiteClasses({
	MeuPrimeiroTeste.class, 
	ValidacaoVerdadeiroFalso.class, 
	ValidacaoIgualdade.class, 
	PreEposCondicaoDeTeste.class,
	PreEPosCondcaoDaClasse.class 
	
	})

public class SuiteDeTestes {
	
}
