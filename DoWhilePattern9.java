class DoWhilePattern9{
 public static void main(String[] args){
  int line=5;
  int star=5;
  int i=0;
  
  do{
   char ch='A';
   int j=0;
   do{
    if(i==0j==0i==4j==4i==2){
     System.out.print("*");
    
    }
    else{
     System.out.print(ch);
     ch++;
    }

                                  j++;
   }while(j<star);
   System.out.println();
   
   i++;
    
  }while(i<line);
   
 }
}