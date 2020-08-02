
public class Statistik {

	public int maximums(int[] messreihe) {

		int max = 0;

		java.util.Arrays.sort(messreihe);

		return messreihe[messreihe.length - 1];

	}

	public int Minimums(int[] messreihe) {

		int min = 0;

		java.util.Arrays.sort(messreihe);

		return messreihe[0];

	}

	public int Medians(int[] messreihe) {

		int medians = 0;

		java.util.Arrays.sort(messreihe);

		if (messreihe.length % 2 == 1)
			medians = messreihe[messreihe.length / 2 + 1];
		else if (messreihe.length % 2 == 0)
			medians = (messreihe[messreihe.length / 2] + messreihe[messreihe.length / 2 + 1]) / 2;

		return medians;
	}

	public int Spannweite(int[] messreihe) {
		int spannweit = 0;

		spannweit = maximums(messreihe) - Minimums(messreihe);

		return spannweit;
	}

	public int mittleren(int[] messreihe) {
		int erstmal = 0;
		int sum = 0;
		int sum1 = 0;
		int mittlerenabweichung;

		for (int i = 0; i < messreihe.length; i++) {

			sum += messreihe[i];

		}

		erstmal = sum / messreihe.length;

		for (int i = 0; i < messreihe.length; i++) {

			sum1 += Math.abs(messreihe[i] - erstmal);

		}
		mittlerenabweichung = sum1 / messreihe.length;

		return mittlerenabweichung;
	}

	public void hÃ¤ufigsten(int[] d) {

		int sum = 0;

		java.util.Arrays.sort(d);
		for (int i = 0; i < d.length; i++) {
			{
				for (int j = i; j < d.length; j++)
					if (d[i] == d[j])
						sum++;
					else {
						System.out.println(d[i] + "  häufigkeit von   " + sum);
						sum = 0;
						i = j;
						if (d[i] == d[j])
							sum++;
						if (i == d.length - 1)
							System.out.println(d[i] + "  häufigkeit von   " + sum);

					}
			}
		}

	}

}
