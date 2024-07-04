package encapsulation;

// Encapsulation in Java is a process of wrapping code and data together into
//  a single unit, for example, a capsule which is mixed of several medicines.
// encapsulation in java
// We can create a fully encapsulated class in Java by making all the data members of 
// the class private. Now we can use setter and getter methods to set and get the data in it.

class Account{
    private long account_no;
    private String name;
    private float amount;
 
    public long getAccount_no() {
        return account_no;
    }

    public void setAccount_no(long account_no) {
        this.account_no = account_no;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }

}
public class Main {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setName("Kaushik Auto Parts");
        acc.setAccount_no(45667788);
        acc.setAmount(500000);
        System.out.println(acc.getAccount_no()+" "+acc.getName()+" "+acc.getAmount());
    }
}
