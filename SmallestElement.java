class SmallestElement{
    public static void main(String[] args) {
        int[] array = {21, 10, 15, 6, 4, 12};
        System.out.println(smallestElement(array));
    }
    private static int smallestElement(int[] array){
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}