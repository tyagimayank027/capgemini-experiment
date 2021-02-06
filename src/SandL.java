
public class SandL {
	public static void main(String[] args) {
		int number[]= {21,4,76,3,5,9,10,43,61,2};
		int S=number[0];
		int L=number[0];
		for(int i=1;i<number.length;i++) {
			if(number[i]>L) {
				L=number[i];
			}
			else if(number[i]<S) {
				S=number[i];
			}
			
		}
		System.out.println("Largest number is="+L);
		System.out.println("Smallest number is="+S);
	}

}
