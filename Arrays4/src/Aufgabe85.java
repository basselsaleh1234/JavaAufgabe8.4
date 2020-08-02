
public class Aufgabe85 {

	public static void main(String[] args) {

		int[] messreihe = new int[100];

		for (int i = 0; i < messreihe.length; i++) {
			messreihe[i] = (int) (Math.random() * 100);
		}
		for(int i:messreihe)System.out.print(i+" ");
		System.out.println();
		Statistik s=new Statistik();
		
		int max=s.maximums(messreihe);
		
		System.out.println("Berechnung des Maximums der Messwerte "+max);
		
		int min =s.Minimums(messreihe);
		System.out.println("Berechnung des Maximums der Messwerte "+min);
		int medians=s.Medians(messreihe);
		System.out.println("Berechnung des Medins der Messwerte "+medians);
		int spannweit=s.Spannweite(messreihe);
		System.out.println("Berechnung der Spannweite der Messwerte "+spannweit);
		
		int mittlerenabeichung=s.mittleren(messreihe);
		System.out.println("Berechnung der mittleren Abweichung der Messwerte "+mittlerenabeichung);
		
		s.häufigsten(messreihe);
	}
	

}
