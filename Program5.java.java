class pattern4
{
	public static void main(String[] args){
		for(int i=0; i<5; i++){

			for(int j=0; j<5; j++){

				if(i==2 || j==2 ||(i==0&&j==0)||(i==4&&j==4) ||(i==4&&j==0) ){
						System.out.print("*");
					}
					else{
					System.out.print(" ");
					}	
		
				}
                                System.out.println();
			}
		}
}


