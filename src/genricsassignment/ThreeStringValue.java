package genricsassignment;

        import java.util.Scanner;

        class testMaximum <T> {
            public testMaximum()
            //Default Constructor

            {
                System.out.println("Welcome to Generic Assignment Problem.");
            }

            public static void main(String[] args) {
                //Initialization of object.
                testmaximum testMaximum = new testmaximum();

                //Define the array where size is 3(given).
                String[] array = addToArray();
                printArray(array);
                getMaximum(array);
            }

            //Get maximum from the array and its position.
            public static void getMaximum(String[] array) {
                String max = array[0];
                int position = 0;
                for (int i = 0; i < array.length; i++)
                {
                    int a = array[i].compareTo(max);
                    if(a > 0)
                    {
                        max = array[i];
                        position = i;
                    }
                }
                System.out.println("\nMaximum integer is : "+max);
                System.out.println("Maximum integer position is : "+position+" in array.");
            }

            //Printing to array.
            public static void printArray(String[] array) {
                System.out.println("Array is : ");
                for (int i = 0; i < array.length; i++)
                {
                    System.out.print(array[i]+"  ");
                }
            }

            //Adding values to array.
            public static String[] addToArray() {
                System.out.println("Enter 3 values");
                Scanner scan = new Scanner(System.in);
                String a = scan.nextLine();
                String b = scan.nextLine();
                String c = scan.nextLine();
                scan.close();
                return new String[]{a,b,c};
            }

}
