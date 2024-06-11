package TratamentoDeErros;

@SuppressWarnings("serial")
public class NumeroNegativoException extends RuntimeException{
	private String numeroNegativo;
	
	
	public NumeroNegativoException(String numeroNegativo) {
		this.numeroNegativo = numeroNegativo;
		
	}
	
	public String getMessage() {
		return String.format("O atributo %s esta negativo", numeroNegativo);
	}

}
