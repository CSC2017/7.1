
    public class SortDriver {
        public static void main(String [] args) {

            int numbers[] = {9,4,676,547,974,3457,56754,0,56,};
            System.out.println();
            System.out.println("The smallest is " + Sort.findSmallest(numbers));
            System.out.println();
            System.out.println("The list is ");

            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + ",");
            }
            System.out.println();
            System.out.println();
            System.out.println("The sorted list is ");
            Sort.sort(numbers);

            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + ",");
            }
        }
    }
