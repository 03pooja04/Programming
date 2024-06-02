class DoWhilePattern7{
 public static void main(String[] args){
  int line=5;
  int star=5;
  int i=0;
  char ch='A';
  do{
   
   int j=0;
   do{
    if(i%2==0){
     System.out.print(ch);
     
    }
    else{
     System.out.print("*");
    }

                                  j++;
   }while(j<star);
   System.out.println();
   if(i%2==0){
    ch++;
   }
   i++;
    
  }while(i<line);
   
 }
}