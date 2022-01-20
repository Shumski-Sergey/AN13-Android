package sshumski.Lab5;

public class Employee implements Some{
    private String company;

    public Employee(String google) {
        this.company = google;
    }

    public String getCompany() {
        return company;
    }

    public void displayInfo(){
        System.out.println("Компания: " + this.getCompany());
    }
    
    public void print() {
        System.out.println("Print");
    }
}
