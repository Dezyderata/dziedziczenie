public class Student extends Osoba{
	
	protected String nrIndeksu;

	public Student(String Imie, String Nazwisko, String rokUrodzenia, String plec, String nrIndeksu){
		super(Imie, Nazwisko, rokUrodzenia, plec);
		this.nrIndeksu = nrIndeksu;
	}
	public String getNrIndeksu(){
		return nrIndeksu;
	}
	@Override
	public String toString(){
		return super.toString()+", nr Indeksu: "+nrIndeksu;
	}
}
