package tp8;

public class ExcecaoDivisaoResultadoZero extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public String getMessage(){
        return "O resultado da divisão é 0";
    }
    
}