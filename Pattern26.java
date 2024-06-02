class Pattern26{
 public static void main(String[] args){
  int line=4;
  int star=4;
  for(int i=0;i<line;i++){
    int ch=2;
   for(int j=0;j<star;j++){
     
     System.out.print(ch);
     ch--;
     if(j==2){
      ch=1;
      System.out.print(ch);
      ch++;
     }
   }
   System.out.println(); 
   
  }
   
 }
}