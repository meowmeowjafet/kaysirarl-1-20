class Problem20 {
    public static void main (String[] args){
        int array [] = { 20, 60,70,83,82,63,67,42,90,24, 16, 12, 11, 87,93};
        for (int i = 0; i < array.length; i++){
            if ((array[i] % 2 == 0) && (array[i]>20)){
                System.out.println (array[i]);
            }
        }
    }
}