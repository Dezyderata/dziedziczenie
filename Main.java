
public class Main{
	public static void main(String[] args){
		Osoba Jan = new Osoba("Jan", "Kowalski", "1978", "Mezczyzna");
		System.out.println(Jan);
		Student Ala = new Student("Ala", "Nowak", "1995", "Kobieta", "123456");
		System.out.println(Ala);
		Wykladowca Janina = new Wykladowca("Janina","Skrzypek", "1947", "Kobieta", "Profesor zwyczajny");
		System.out.println(Janina);
		Stypendysta Jarek = new Stypendysta("Jarek", "Mak", "1996", "Mezczyzna", "124678", 556.93);
		System.out.println(Jarek);
	}
}
