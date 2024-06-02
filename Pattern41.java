class Pattern41{
	public static void main(String[] args){
		
		int line=4;
		int star=5;
		int space=0;
		for(int i=0;i<line;i++){
			
			for(int j=0;j<star;j++){
				System.out.print("*");
				
			}
			for(int k=0;k<space;k++){
				System.out.print(" ");	
			}

			for(int l=0;l<star;l++){
				System.out.print("*");
			}
			space+=2;
			star--;
			System.out.println();
		
			
		}
		star=2;
		 space=6;
		for(int i=0;i<line;i++){
			
			for(int j=0;j<star;j++){
				System.out.print("*");
				
			}
			for(int k=0;k<space;k++){
				System.out.print(" ");	
			}

			for(int l=0;l<star;l++){
				System.out.print("*");
			}
			space-=2;
			star++;
			System.out.println();
		
			
		}
		


		
		
	

		
	

