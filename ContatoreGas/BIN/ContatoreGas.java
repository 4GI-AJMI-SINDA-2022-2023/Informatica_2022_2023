//Sia data la classe ContatoreGas, sviluppare la classe BollettaCalculator.
Public class ContatoreGas {
	private static final double MAX_CONS=9999.999;
        private double consumoAttuale;
        private double consumoPrecedente;
        public ContatoreGas(){
            this.consumoAttuale=0.0;
            this.consumoPrecedente=0.0;
        }
        public ContatoreGas(double consAtt){
            if(consAtt>=0){
                this.consumoAttuale= consAtt;
            }else{
                this.consumoAttuale= 0.0;
            }
            this.consumoPrecedente=0.0;
        }
        public void setRilevazioneAttuale(double consAtt){
            if(consAtt>=0){
                this.rilevazionePrec= this.rilevazioneAtt;
		if(consAtt > MAX_CONS){
			this.rilevazioneAtt = consAtt - (MAX_CONS);
		}else{
			this.rilevazioneAtt=consAtt;
		}
	     }	

        }
        
	public double getConsumi(){
		int ris= rilevazioneAtt-rilevazionePrec;
		if (ris> 0){
			return ris;
		}else{
			return((MAX_CONS-rilevazionePrec)+rilevazioneAtt);
		}
	}
        public void setRilevazionePrecedente(double consPrec){
            if(consPrec>=0){
                this.consumoPrecedente= consPrec;
            }
        }
        public double getConsumoAtt(){
            return consumoAttuale;
        }
        public double getConsumoPrec(){
            return consumoPrecedente;
        }
        public String toString(){
        String out = 	"____________________________________________________\n";
        out += "Il contatore ha il consumo precedente = " + this.consumoPrecedente + 	"\n";
        out += "Il contatore ha il consumo attuale = " + this.consumoAttuale + "\n";

	return out;
        }
}
