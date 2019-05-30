public class MaxInitFinder {
    public int findBiggestNumber(int[] givenInputArray) {
        int result = Integer.MIN_VALUE;
        for(int i : givenInputArray){
            if(result < i){
                result = i;
            }
        }
        return result;
    }
}
