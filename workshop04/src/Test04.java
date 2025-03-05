public class Test04 {

    public static void main(String[] a) {
        Calc calc = new Calc();

        int sum = calc.calculate(Integer.parseInt(a[0]));

        if(sum != 0) {
            System.out.println();
            System.out.println("결과 : "+sum);
        } else {
            System.out.println("5 ~ 10 사이의 정수를 입력하세요.");
        }

        
    }
}
