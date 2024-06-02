class Pattern4{
 public static void main(String[] args){
  int line=4;
  int star=4;
  int ch=2;
  for(int i=0;i<line;i++){
   int ch1=ch;
   for(int j=0;j<star;j++){
   
    System.out.print(ch1);
    if(i==0){
     ch1+=2;
   }
   elseif(i==1){
    ch1+=3;
    }
  elseif(i==2){
  ch1+=4;
  }
 }
    
   System.out.println();
    ch++;
    star--;
  }
}
}