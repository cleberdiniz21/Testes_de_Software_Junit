package MediaEscolar;

public class MediaEscolar {
	
	public static String mediaEscolar(String nome, double notaPrimeiroBimestre, double notasegundoBimestre, double notaTerceiroBimestre, double notaQuartoBimestre ) {
		String retorno = null;
		double notaAnual =  (notaPrimeiroBimestre + notasegundoBimestre + notaTerceiroBimestre + notaQuartoBimestre) / 4;
		
				
		if (notaAnual <= 5) {
			retorno = nome + ", voc� est� reprovado!";
			
		} else if (notaAnual > 5 && notaAnual <= 7) {
			retorno = nome +  ", voc� est� de recupera��o!";
						
		} else if (notaAnual >= 7 ) {
			retorno = nome + ", voc� est� aprovado!";
		}
		
		return retorno;
	}
}


