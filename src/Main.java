
public class Main {
	public static void main(String[] args) {
		//damage (max. 30) ve dodge (savurma) kısımlarını Math.random kullanarak yazdım
		//damage değerleri ise double olacağından bunları integer değere çevirdim
		
		Fighter mike = new Fighter("Mike", (int) (Math.random()*30), 100, 100, Math.random()*100); 
		Fighter ali = new Fighter("Ali", (int) (Math.random()*30), 100, 100, Math.random()*100);
		Ring r = new Ring(mike, ali, 90, 100);
		r.run();
	}
}