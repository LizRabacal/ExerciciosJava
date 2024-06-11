package TratamentoDeErros;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException{
	private String numeroNegativo;
	
	
	public StringVaziaException(String numeroNegativo) {
		this.numeroNegativo = numeroNegativo;
		
	}
	
	public String getMessage() {
		return String.format("O atributo %s esta vazio", numeroNegativo);
	}

}
