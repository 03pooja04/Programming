class Pattern1{
 public static void main(String[] args){
  int line=7;
  int star=1;
  char ch='D';
  for(int i=0;i<line;i++){
   
   for(int j=0;j<star;j++){
    System.out.print(ch);
   
   }
    System.out.println();
    if(i<3){
    ch--;
    star++;
    }
    
   else{
    star--;
     ch++;
      }
  } 
 }
}