class Pattern2{
 public static void main(String[] args){
  char ch='A';
  int line=4;
  int star=1;
  for(int i=0;i<line;i++){
   char ch1=ch;
   for(int j=0;j<star;j++){
    System.out.print(ch1);
   ch1++;
   }
   System.out.println();
    star++;
    ch++;
   
  } 
 }
}