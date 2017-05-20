public class Wykladowca extends Osoba{
	private String tytulNaukowy;
	 public Wykladowca(String Imie, String Nazwisko, String rokUrodzenia, String plec, String tytulNaukowy){
	 super(Imie, Nazwisko, rokUrodzenia, plec);
	 this.tytulNaukowy = tytulNaukowy;
	 }

	 @Override
	 public String toString(){
	 	return super.toString()+", tytul naukowy: "+tytulNaukowy;
	 }
}
