class DoWhilePattern6{
 public static void main(String[] args){
  int line=5;
  int star=5;
  int i=0;
  do{
   char ch='A';
   int j=0;
   do{
    if(j%2==0){
     System.out.print(ch);
     ch+=2;
     
    }
    else{
     System.out.print("*");
    }

                                  j++;
   }while(j<star);
   System.out.println();
  
   i++;
    
  }while(i<line);
   
 }
}