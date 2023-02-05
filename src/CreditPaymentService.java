public class CreditPaymentService {
        public int calculate(int creditSum, int years, double percentCredit){
            double monthlyPercent = percentCredit / 1200; // Процентная ставка на месяц
            double monthSum = years * 12;

            double monthlyPayment = creditSum * monthlyPercent / (1 - Math.pow(1 + monthlyPercent, - monthSum));

            int monthlyPaymentInt = (int)monthlyPayment;
            return monthlyPaymentInt;

        }
    }
