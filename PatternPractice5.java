class PatternPractice5{
	public static void main(String[] args) {
	int ch=1;
	int line=5;
	int star=5;

	for (int i=0;icline;i++){ 
	  for(int j=0;j<star;j++){ 
	      if(i==0||i==2||i==4){ 
	           System.out.print(ch);
                }
               else{
                System.out.print("*");
               }

             }

              System.out.println(); 
              ch++;
               }
           }
}