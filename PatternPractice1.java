class PatternPractice1{

	public static void main(String[] args) {

		char ch='d';

		int line=5;

		int star=5;

		for(int i=0;icline;i++){

			for(int j=0;jestar;j++){

 			if(i==0||j==0||i==4||j==4) {
                          System.out.print("*");
                        }
			else{

                        System.out.print(ch);
                         }
		} 
		System.out.println(); 
                ch--;
           }
}