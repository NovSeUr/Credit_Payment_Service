public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int oneYearPayment = service.calculate(1_000_000, 1,9.99);
        System.out.println("Ежемесячный платёж " + oneYearPayment + " рублей");

        int twoYearPayment = service.calculate(1_000_000, 2,9.99);
        System.out.println("Ежемесячный платёж " + twoYearPayment + " рублей");

        int threeYearPayment = service.calculate(1_000_000, 3,9.99);
        System.out.println("Ежемесячный платёж " + threeYearPayment + " рублей");
    }
}