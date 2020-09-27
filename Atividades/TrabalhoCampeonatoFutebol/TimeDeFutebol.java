package trabalhoSemana05;

public class TimeDeFutebol {
	
	private int numeroDeTorcida;
	private static int totalTime;
	

	public int getNumeroDeTorcida() {
		return this.numeroDeTorcida;
	}

	public void setNumeroDeTorcida(int numeroDeTorcida) {
		this.numeroDeTorcida = numeroDeTorcida;
	}

	  public static void settotalTime() {
	        totalTime++;	   
	        
	  }
	  
	  public static int gettotalTime() {
		  return TimeDeFutebol.totalTime;
	  }
	
	
}
