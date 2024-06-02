class Pattern8{
 public static void main(String[] args){
  int line=5;
  int star=5;
  char ch='A';
  for(int i=0;i<line;i++){
   
   for(int j=0;j<star;j++){
    if(i%2==0){
    System.out.print(ch);
   
   }
   else{
    System.out.print("*")
    }
 }
    
   System.out.println();
    star--;
    if(i%2==0){
     ch++;
      }
  } 
 }
}