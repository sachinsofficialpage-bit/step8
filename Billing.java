abstract class Customer{
    protected double amount;
    Customer(double amount){
        this.amount = amount;
    }
    abstract double getBillAmount();
    abstract String getType();
}
class Student extends Customer{
    Student(double amount){
        super(amount);
    }
    double getBillAmount(){
        return amount*0.90;
    }
    String getType(){
        return "Student";
    }
}
class Staff extends Customer{
    Staff(double amount){
        super(amount);
    }
    double getBillAmount(){
        return amount*0.95;
    }
    String getType(){
        return "Staff";
    }
}
class Guest extends Customer{
    Guest(double amount){
        super(amount);
    }
    double getBillAmount(){
        return amount+10;
    }
    String getType(){
        return "Guest";
    }
}
public class Billing{
    public static void main(String args[]){
        Customer c1 = new Student(1000);
        Customer c2 = new Staff(1000);
        Customer c3 = new Guest(1000);
        System.out.println(c1.getType()+" Bill Amount: "+c1.getBillAmount());
        System.out.println(c2.getType()+" Bill Amount: "+c2.getBillAmount());
        System.out.println(c3.getType()+" Bill Amount: "+c3.getBillAmount());
    }
}