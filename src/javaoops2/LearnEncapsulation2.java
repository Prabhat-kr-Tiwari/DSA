package javaoops2;
public class LearnEncapsulation2 {
    public static void main(String[] args)
    {
        bankAccount b=new bankAccount();
        b.setBankBalance(1234,2282);
        System.out.println(b.getBankBalance());
    }
}
class bankAccount{
    int otp=1234;
    private int amount;
    public void setBankBalance(int otp,int amount)
    {
        if (otp==this.otp)
        {
            this.amount=amount;
        }
    }
    public int getBankBalance() {
        return amount;
    }
}
