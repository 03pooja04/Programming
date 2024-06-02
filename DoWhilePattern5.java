class DoWhilePattern5{
 public static void main(String[] args){
  int line=5;
  int star=5;
  int i=0;
  int ch=1;
  do{
   
   int j=0;
   do{
    if(i==0i==2i==4){
     System.out.print(ch);
     
    }
    else{
     System.out.print("*");
    }

                                  j++;
   }while(j<star);
   System.out.println();
   if(i==0i==2i==4){
    ch+=2;
   }
   i++;
    
  }while(i<line);
   
 }
}