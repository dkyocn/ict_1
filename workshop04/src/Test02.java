import java.util.Random;

public class Test02 {

    public static void main(String[] args) {

        int[] arr = new int[5];
        int i = 1, j=0, sum=0;
        double avg = 0.0;

        Random random = new Random();
        
        while (i<=5) {
            boolean check = false;
            int num = random.nextInt(10)+1;

            for(j = 0; j<i; j++){
                if(arr[j] == num) {
                    check = true;
                    break;
                }
            }

            if(check) {
                continue;
            }

            arr[i-1] = num;

            sum+=num;
            i++;
        }

        avg = sum/5;

        for(int num : arr) {
            System.out.printf(num+" ");
        }
        System.out.println();
        
        System.out.println("sum = "+sum);
        System.out.println("average = "+ avg);
            
        
    }
}
