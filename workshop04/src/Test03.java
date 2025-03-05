public class Test03 {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60,70,80,90,100};

        for(int i=0;i<arr.length; i++) {
            for(int j =i+1; j<arr.length; j++) {
                int index = 0;
                if(arr[i] < arr[j]) {
                    index = arr[j];
                    arr[j] = arr[i];
                    arr[i] = index;
                }
            }
        }

        for (int i : arr) {
            System.out.printf(i+" ");
        }
    }

}
