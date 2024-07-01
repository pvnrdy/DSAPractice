public class BinarySearchOne {
    public static void main(String [] args) {
        int elementToBeSearched = 12;
        int [] arrayElements = new int [] {1, 2, 3, 4, 5, 6, 7, 8};
        int index = findElement(arrayElements, elementToBeSearched);
        if(index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at - " + index);
        }
    }

    public static int findElement(int [] arrayElements, int elementToBeSearched) {
        int lowIndex = 0;
        int highIndex = arrayElements.length - 1;
        while(lowIndex <= highIndex) {
            int midIndex = ((highIndex + lowIndex) / 2);
            if(arrayElements[midIndex] == elementToBeSearched) {
                return midIndex;
            } else if(elementToBeSearched < arrayElements[midIndex]) {
                highIndex = midIndex - 1;
            } else {
                lowIndex = midIndex + 1;
            }
        }
        return -1;
    }
}   