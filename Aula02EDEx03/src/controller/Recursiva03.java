package controller;
//3. Construir uma função recursiva que receba um vetor e seu tamanho e apresente a quan�dade de 
//números pares existentes no vetor. Considere que a entrada deve ser, apenas de números naturais 
//diferentes de zero
public class Recursiva03 
{
	public Recursiva03() 
	{
	
		super();
		
	}
			
	public int pares(int[] vet,int n,int par)
	{
		
		if(n<1)
		{
			return par;
		}
		else 
		{
			if(vet[n-1]%2==0)
			{
				par++;
			}
			return pares(vet,n-1,par);
		}
		
	}
	
	
	
}
