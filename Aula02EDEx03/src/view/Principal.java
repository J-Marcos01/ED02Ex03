package view;
import controller.Recursiva03;


public class Principal 
{

	public static void main(String[] args) 
	{
		
		Recursiva03 funcao = new Recursiva03();	
		int []vet= {5,8,4,12,8,77,2};
		int tamanho=vet.length;
		int res=funcao.pares(vet,tamanho, 0);
		System.out.println(res);
							
				
	}

}
