
public class PitagorasziSzamHarmas {

	public static void main(String[] args) {
		
		//Pitagoraszi sz�mh�rmas 1-50 k�z�tt
		PitSzamHarmas(1, 50);
	}
	public static void PitSzamHarmas(int min, int max)
	{
		for(int i = min; i < max-1; i++) {
			for(int j = i+1; j < max;  j++) {
				for(int k = j+1; k <= max; k++) {
					if(Math.pow(i, 2)+Math.pow(j, 2) == Math.pow(k, 2))
						System.out.println((int)Math.pow(i, 2)+"+"+(int)Math.pow(j, 2)+"="+(int)Math.pow(k, 2));
				}
			}
		}
	}
}
