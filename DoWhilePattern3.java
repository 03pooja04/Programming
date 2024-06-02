class DoWhilePattern3{
 public static void main(String[] args){
  int line=4;
  int star=4;
  int i=0;
  int ch=2;
  do{
   
   int j=0;
   do{
    System.out.print(ch);
    j++;

   }while(j<star);
   System.out.println();
   ch+=2;
   i++;
    
  }while(i<line);
   
 }
}