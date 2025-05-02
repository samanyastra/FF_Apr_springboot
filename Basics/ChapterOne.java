public class ChapterOne {

    public static void main(String[] args) {
        
        //  1. Data types
    
        // 1.1 creation and initialization
        byte byteVal = 120;
        System.out.println("ouput is " + byteVal); // String concatenation with various datatypes


        short shortVal = 32000;
        System.out.println("ouput is " + shortVal);

        int intVal = 2344;
        System.out.println("ouput is " + intVal);

        long longVal = 922337203;
        System.out.println("ouput is " + longVal);
    
        float floatVal = 2.3f;
        System.out.println("ouput is " + floatVal);

        double doubleVal = 1223.23344d;
        System.out.println("ouput is " + doubleVal);
    
    
        boolean booleanVal = true; // or false
        System.out.println("ouput is " + booleanVal);

        char charVal = 'a';
        System.out.println("ouput is " + charVal);

        String stringVal = "hello World";
        System.out.println("ouput is " + stringVal);

        int[] arr = new int[5];
        for(int i=0; i<5;i++){
            arr[i] = i;
        }

        for(int i=0; i<5;i++){
            System.out.println("ouput is " + arr[i]);
        }



    }
    


}
