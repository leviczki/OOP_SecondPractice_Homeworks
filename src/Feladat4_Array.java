public class Feladat4_Array {
	
	private static java.util.Scanner input;
	
	public static void main(String[] args) {
		int[] myArray = {10, 15, 9, 7, 22, 98, 3, 35, 56, 46};
		input = new java.util.Scanner(System.in);
		
		//Lineáris keresés
		System.out.print("Adj meg egy számot amit megkeresek a halmazban: ");
		int position = LinSearch(myArray, input.nextInt());
		if(position == -1)
			System.out.println("Nincs ilyen szám a halmazban.");
		else
			System.out.println("Pozíció: "+(position+1)+".");
		
		//Közvetlen kiválasztásos rendezés
		for(int i = 0; i < myArray.length; i++) {			
			for(int j = (i+1); j < myArray.length; j++) {
				if(myArray[i] > myArray[j]) {
					int swap = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = swap;
				}
			}
		}
		//Tömb kiírása 
		PrintArray(myArray);
		System.out.println();
		
		//Bináris keresés (rekúrzív)
		System.out.print("Adj meg egy számot amit megkeresek a növekvõen rendezett halmazban: ");
		position = BinSearch(myArray, input.nextInt());
		if(position != -1)
			System.out.println("Pozíció: "+(1+position));
		else
			System.out.println("Nincs ilyen szám a halmazban.");
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
