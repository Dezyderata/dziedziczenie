public class Stypendysta extends Student{
	private double kwotaStypendium;
	public Stypendysta(String Imie, String Nazwisko, String rokUrodzenia, String plec, String nrIndeksu, double kwotaStypendium){
		super(Imie, Nazwisko, rokUrodzenia, plec, nrIndeksu);
		this.kwotaStypendium = kwotaStypendium;
	}
	@Override
	public String toString(){
		return super.toString()+", kwota stypendium: "+kwotaStypendium;
	}
}

