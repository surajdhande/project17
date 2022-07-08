public class BankAccount
{
  public static void main(String []a)
 {
   Account b1=new Account();
   b1.displayAccount();
  
   Account b2=new Account();
   b2.setAccount(100,20000);
   b2.displayAccount();
  
   Account b3=new Account();
   b3.setAccount(101,30000);
   b3.displayAccount();
  }
}

//added my comment
class Account
{
  private int acno;
  private double bal;
public Account()
{
acno=10;
bal=1000;
}
 
public void setAccount(int no,double ba)
  {
   acno=no;
   bal=ba;
   }
public void displayAccount()
  {
   System.out.println("Accno :"+acno);
   System.out.println("Balance :"+bal);
  }
}

