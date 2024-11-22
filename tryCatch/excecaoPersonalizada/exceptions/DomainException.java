package estudo.tryCatch.excecaoPersonalizada.exceptions;

public class DomainException extends RuntimeException{
	/* extends Exception == vai ser obrigado a tratar ou
	 * propagar a excecao no programa
	 * RuntimeException == não é obrigado a tratar a 
	 * excecao no programa
	 * OBS: mas mesmo com uma RuntimeExcepcion é importante
	 * tratar as excessoes para o programa não quebrar
	 */
	private static final long serialVersionUID = 1L;
	
	public DomainException(String message) {
		super(message);
		
	}
	 
}
