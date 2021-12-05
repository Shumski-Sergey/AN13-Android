package mshpudeyko.Practice4.Tsk4;

public abstract class BankCard {
   String bank;
   String number;
   String date;

   public BankCard(String bank, String number, String date) {
      this.bank = bank;
      this.number = number;
      this.date = date;
   }

   public String getBank() {
      return bank;
   }

   public String getNumber() {
      return number;
   }

   public String getDate() {
      return date;
   }

   public void print(){
      System.out.println("Name of bank: "+getBank()+"\t\tNumber of card: "+getNumber()+
              "\tCard expiration date: "+getDate());
   }

}
