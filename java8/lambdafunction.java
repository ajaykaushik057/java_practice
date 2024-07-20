// Lambda function is a anonimus function

interface SumCalculator{
    int sum(int a , int b);
}

public class lambdafunction {

    public static void main(String[] args) {
        SumCalculator sumCalculator = (x,y) ->  x+y;
        int result = sumCalculator.sum(23, 45);
        System.out.println("result:" +result);
    }
}