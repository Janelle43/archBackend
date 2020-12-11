public class ProxyPaymentProcess implements PaymentProcess{
    private RealPaymentProcess realPaymentProcess = new RealPaymentProcess();
    @Override
    public void checkAccount() {
realPaymentProcess.checkAccount();
    }

    @Override
    public void balance() {
realPaymentProcess.balance();
    }
}
