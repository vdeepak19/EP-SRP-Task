
public class PrimeOrNot {
	public boolean isPrime(int number) {
		int temp;
		boolean isPrime = true;
			for(int i=2;i<=number/2;i++)
			{
				temp=number%i;
				if(temp==0){
			      isPrime=false;
			      break;
			   }
			}
		return isPrime;
	}

}
