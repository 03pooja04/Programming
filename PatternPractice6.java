class PatternPractice6{
	public static void main(String[] args) {
	  int line=5;
	  int star=5;

	  for(int i=0;i<line;i++){
	  char ch='A';
	      for(int i=0;j<star;j++){ 
                    if(j==0||j==2||j==4) {
                          System.out.print(ch); 
                          ch+=2;
                        }
                    else{
                      System.out.print("*");
                       }
                  }
                 System.out.println();
               }
          }
}