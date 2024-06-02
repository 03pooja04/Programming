class PatternPractice7{
	public static void main(String[] args) {
	  int line=5;
	  int star=5;
	  char ch='A';

	   for(int i=0;i<line;i++){
		for(int j=0;j<star;j++){
		  if(i==0||i==2||i==4) {
                   System.out.print(ch);
                   }

                  else{
                     System.out.print("*");
                   }
               }

             System.out.println(); 
                if(i==0||i==2||i==4){
                 ch+=1;
                 }
             }
         }
}

