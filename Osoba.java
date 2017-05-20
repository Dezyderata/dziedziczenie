public class Osoba{
	protected String Imie;
	protected String Nazwisko;
	protected String rokUrodzenia;
	protected String plec;
	public Osoba(){
		this.Imie = "";
		this.Nazwisko = "";
		this.rokUrodzenia = "";
		this.plec = "";
	}
	public Osoba(String Imie, String Nazwisko, String rokUrodzenia, String plec){
		this.Imie =Imie;
		this.Nazwisko = Nazwisko;
		this.rokUrodzenia = rokUrodzenia;
		this.plec = plec;
	}
	public String getImie(){
		return Imie;
	}
	public String getNazwisko(){
		return Nazwisko;
	}	
	public String getRokUrodzenia(){
		return rokUrodzenia;
	}	
	public String getPlec(){
		return plec;
	}	
	public String toString(){
		return "Imie: "+Imie+", nazwisko: "+Nazwisko+", rok urodzenia: " +rokUrodzenia+", plec: "+plec;
	}
}
