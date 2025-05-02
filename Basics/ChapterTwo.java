public class ChapterTwo {

    public static void main(String[] args) {
        
        // Loops
    
            // 1 For
                // 1.1 plain variant
                for(int i=0; i<5;i++){
                    System.out.println("*");
                }
                
            System.out.println("--------------------------------------------------");
                // 1.2 Nested For loop
                for(int i=0; i<5;i++){
                    for(int j=0; j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println("--------------------------------------------------");


            // 2 While
            int m=0;
            while(m<5){
                System.out.println("*");
                m++;
            }
            System.out.println("--------------------------------------------------");

            // 3 Do While 
            int n=0;
            do{
                System.out.println("*");
                n++;
            }while(n<5);
            System.out.println("--------------------------------------------------");


            // 4 foreach
            int[] arr = new int[5];
            for(int i=0; i<5;i++){
                arr[i] = i;
            }

            for(int element:arr){ // traversal based on element instead of index
                System.out.println(element);
            }


    }
    


}
