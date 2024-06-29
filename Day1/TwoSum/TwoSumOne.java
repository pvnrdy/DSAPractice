class TwoSumOne {
    public static void main(String [] args) {
        int [] numsArray = new int[] {1, 2, 3, 4, 5, 6, 7, 7};
        int target = 6;
        int [] result = findTwoSumIndices(numsArray, target);
        System.out.println(result[0] + " - " + result[1]);
    }

    public static int[] findTwoSumIndices(int [] numsArray, int target) {
        for(int i = 0 ; i < numsArray.length ; i++) {
            for(int j = i + 1 ; j < numsArray.length ; j++) {
                if(numsArray[i] + numsArray[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}