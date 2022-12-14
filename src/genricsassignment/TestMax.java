package genricsassignment;

    import java.util.Scanner;

    public class TestMax {

        //Default Constructor
        public TestMax()
        {
            System.out.println("Welcome to Generic Assignment Problem.");
        }

        public static void main(String[] args) {
            //Initialization of object.
            TestMax testMaximum = new TestMax();

            //Define the array where size is 3(given).
            Float[] array = addToArray();
            printArray(array);
            getMaximum(array);
        }

        //Get maximum from the array and its position.
        public static void getMaximum(Float[] array) {
            float max = array[0];
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

        //Printing the array.
        public static void printArray(Float[] array) {
            System.out.println("Array is : ");
            for (int i = 0; i < array.length; i++)
            {
                System.out.print(array[i]+"  ");
            }
        }

        //Adding values to array.
        public static Float[] addToArray() {
            System.out.println("Enter 3 values");
            Scanner scan = new Scanner(System.in);
            float a = scan.nextFloat();
            float b = scan.nextFloat();
            float c = scan.nextFloat();
            scan.close();
            return new Float[]{a,b,c};
        }
    }

