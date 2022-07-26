package Array;

public class Matrix {

	public static void main(String args[]){  
		//creating two matrices    
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
		    
		//creating another matrix to store the multiplication of two matrices    
		int c[][]=new int[3][3];  //3 rows and 3 columns  
		    
		//multiplying and printing multiplication of 2 matrices    
		for(int i=0;i<3;i++) // i = true 
		{    
		for(int j=0;j<3;j++) // j= true
		{    
		c[i][j]=0;       // 0 0
		for(int k=0;k<3;k++)  // 00,      
		{      
		c[i][j]+=a[i][k]*b[k][j];      
		}//end of k loop  
		System.out.print(c[i][j]+" ");  //printing matrix element  
		}//end of j loop  
		System.out.println();//new line    
		}    
		}
}
