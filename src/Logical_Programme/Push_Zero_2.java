package Logical_Programme;

public class Push_Zero_2 {

	public static void main(String[] args) 
	{
		int[] a= {1,0,0,3,12,65,80};
		System.out.print(a[0]+" ");
		
		for(int i=3;i<=a.length-1;i++)
		{
			if((a[0]==1)||(a[3]==3)||(a[4]==12)||(a[5]==65)||(a[6]==80))
			{
				System.out.print(a[i]+" ");
				
			}
		}
			
			System.out.print(a[1]+" ");
			
			System.out.print(a[2]);
		
		}
		

	}

