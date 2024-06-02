class Pattern30{
 public static void main(String[] args){
  char ch='c';
  int line=5;
  int star=4;
  for(int i=0;i<line;i++){
   for(int j=0;j<star;j++){
    System.out.print(ch);
   }
   System.out.println();
   if(i<2){
    ch--;
   }
   else{
    ch++;
   }
  
   
  } 
 }
}