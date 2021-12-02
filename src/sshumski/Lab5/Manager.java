package sshumski.Lab5;

class Manager extends Employee{

    public Manager(String google) {
        super(google);
    }

    public void displayInfo(){
        System.out.println("Менеджер банка: " + this.getCompany());
    }
}
