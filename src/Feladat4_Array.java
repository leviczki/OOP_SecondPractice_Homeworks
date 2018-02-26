public class Feladat4_Array {
	
	private static java.util.Scanner input;
	
	public static void main(String[] args) {
		int[] myArray = {10, 15, 9, 7, 22, 98, 3, 35, 56, 46};
		input = new java.util.Scanner(System.in);
		
		//Line�ris keres�s
		System.out.print("Adj meg egy sz�mot amit megkeresek a halmazban: ");
		int position = LinSearch(myArray, input.nextInt());
		if(position == -1)
			System.out.println("Nincs ilyen sz�m a halmazban.");
		else
			System.out.println("Poz�ci�: "+(position+1)+".");
		
		//K�zvetlen kiv�laszt�sos rendez�s
		for(int i = 0; i < myArray.length; i++) {			
			for(int j = (i+1); j < myArray.length; j++) {
				if(myArray[i] > myArray[j]) {
					int swap = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = swap;
				}
			}
		}
		//T�mb ki�r�sa 
		PrintArray(myArray);
		System.out.println();
		
		//Bin�ris keres�s (rek�rz�v)
		System.out.print("Adj meg egy sz�mot amit megkeresek a n�vekv�en rendezett halmazban: ");
		position = BinSearch(myArray, input.nextInt());
		if(position != -1)
			System.out.println("Poz�ci�: "+(1+position));
		else
			System.out.println("Nincs ilyen sz�m a halmazban.");
	}
	
	public static byte LinSearch(int[] tmpArr, int number) {
		byte i = 0;
		
		for(int x:tmpArr) {
			if(x == number)
				return i;
			i++;
		}
		
		return -1;
	}
	public static void DirectSelectionSort(int[] tmpArr){
		
	}
	public static void PrintArray(int[] tmpArr) {
		for(int i:tmpArr) {
			System.out.print(i+" ");
		}
	}
	public static byte BinSearch(int[] tmpArr, int number){
		//if(tmpArr[middle] > number)
		byte min = 0;
		byte max = (byte)(tmpArr.length-1);
		byte middle = (byte) (max/2);
		boolean found = false;
		
		while(found == false && min <= max){			
			if(tmpArr[middle] == number)
				found = true;
			else if(tmpArr[middle] > number) {
				max = (byte) (middle-1);
				middle = (byte) (middle / 2) ;
			} else if(tmpArr[middle] < number) {
				min = (byte) (middle+1);
				middle = (byte) (min+((max-min)/2));
			}
		}
		
		if(found == true)
			return middle;
		else
			return -1;
		
	}	

}
