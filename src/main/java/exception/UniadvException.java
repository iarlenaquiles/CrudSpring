package exception;

public class UniadvException extends Exception {

	private static final long serialVersionUID = 1L;
	private String mensagem;

	public UniadvException(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String getMessage() {
		return this.mensagem;
	}
}
