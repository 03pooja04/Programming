class pattern7
{
	public static void main(String[] args){
		for(int i=0; i<5; i++){

			for(int j=0; j<5; j++){

				if(i==0 || j==0 || i==4|| j==4 ){
					System.out.print("*");
					}
                                        else if(i==2 &&j==2){
                                        System.out.print(" ");}
					else{
					System.out.print("0");
					}	
		
				}
                                System.out.println();
			}
		}
}

