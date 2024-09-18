import javax.swing.JOptionPane;

public class Attore {

	 String nomeAttore; //nome dell'attore ingaggiato;
	    // giorno e mese dell'spettacolo:
	    private int giorno;
	    private int mese;

	    public void setNome(String nomeAttore) {
		this.nomeAttore = nomeAttore;
	    }
	    
	    public void setMese(int mese) {
			if (mese < 1 || mese > 12) {
			    JOptionPane.showMessageDialog(null, "Mese errato!");
			    return;
			}
			this.mese = mese;
		    }
	    

	    public void setGiorno(int giorno) {
		if (giorno < 1 || giorno > 31) {
			JOptionPane.showMessageDialog(null, "Giorno errato!");
		    return;
		}
		if (mese == 2 || giorno > 29) {
			JOptionPane.showMessageDialog(null, "Giorno errato!");
			return; 
		}
		if (mese == 4 || giorno > 30) {
			JOptionPane.showMessageDialog(null, "Giorno errato!");
			return; 
		}
		if (mese == 6 || giorno > 30) {
			JOptionPane.showMessageDialog(null, "Giorno errato!");
			return; 
		}
		if (mese == 9 || giorno > 30) {
			JOptionPane.showMessageDialog(null, "Giorno errato!");
			return; 
		}
		if (mese == 11 || giorno > 30) {
			JOptionPane.showMessageDialog(null, "Giorno errato!");
			return;   
		}
		if (mese==0) {
			JOptionPane.showMessageDialog(null, "Giorno errato! "+" perchè prima hai inserito un mese errato");
			return; 
		}
		
		this.giorno = giorno;
	    }

	    
	    public String getNome() {
			return nomeAttore;
		    }

	    
	    public String getData() {
		return "Data spettacolo: " + giorno + "/" + mese;
	    }
	}