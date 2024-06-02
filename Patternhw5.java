class Pattern5{
 public static void main(String[] args){
  int line=5;
  int star=1;
  int ch=0;
  for(int i=0;i<line;i++){
   
   for(int j=0;j<star;j++){
    if((i+j)%2==0){
    System.out.print(ch);
   
   }
   else{
    System.out.print(1)
    }
 }
    
   System.out.println();
    star++;
  } 
 }
}