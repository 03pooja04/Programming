class Pattern38{
 public static void main(String[] args){
     int line=5;
     int star=1;
     char ch='A';
     int space=4;

    for(int i=0;i<line;i++){
    
           for(int k=0;k<star;k++){

    	        System.out.print(" ");
                 }
  	           for(int j=0;j<star;j++){
    	                 System.out.print(ch+"");
                            if(j<i){
                                ch--;
                              }
                            else{
                                ch++;
                                }
 	}
    
   	System.out.println();
       	star+=2;
        space--;
	}
    }
}