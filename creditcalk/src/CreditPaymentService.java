public class CreditPaymentService {
    public int calculate(double summa, double month, double percent) {
        double a, b, c, d;
        a = percent / 100 / 12;
        d = 1 + a;
        b = Math.pow(d, month);
        c = a * b;
        double e, g, f;
        f = Math.pow(d, month);
        e = f - 1;
        double payment = summa * c / e;

        return (int) payment;
    }
}
