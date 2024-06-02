class pattern12
{
	public static void main(String [] args)
	{
         int line=3;
         int star=4;
         for(int i=0; i<line; i++)
         {
         	int ch=4;
                for(int j=0; j<star; j++)
                	{
                             System.out.print(ch*ch+" ");
                             ch--;
                        }
                        System.out.println();
         }
         
     }
}