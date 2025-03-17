public class Calc {

    public int calculate(int data) {

        int sum = 0;

        if(5<=data && 10>=data) {
            System.out.printf("짝수 : ");
            for(int i = 1; i<=data; i++) {
                if(i%2 == 0) {
                    System.out.printf(i+" ");
                    sum += i;
                }
            }
        }
        return sum;
    }
}
