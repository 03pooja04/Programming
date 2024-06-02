class DoWhilePattern4{
 public static void main(String[] args){
  int line=4;
  int star=4;
  int i=0;
  int ch=4;
  do{
   
   int j=0;
   do{
    System.out.print(ch);
    j++;

   }while(j<star);
   System.out.println();
   ch--;
   i++;
    
  }while(i<line);
   
 }
}