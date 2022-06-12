public class MonthlyCCBalance {
    public static void main(String[] args)
    {
       double INTEREST_RATE = 0.17;
       double balance = 5000;
       double interestMonth1;
       double interestMonth2;

       interestMonth1 = balance * INTEREST_RATE;
       interestMonth2 = (balance + interestMonth1) * INTEREST_RATE;

        System.out.println("The interest after one month is " + interestMonth1);
        System.out.println( " The interest after two months is "  +  interestMonth2);





    }
}
