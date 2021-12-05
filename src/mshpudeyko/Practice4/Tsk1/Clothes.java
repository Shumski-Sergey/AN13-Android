package mshpudeyko.Practice4.Tsk1;

/*
* Одежду можно (и нужно, пожалуй) носить, продавать и покупать, желательно — со скидкой.
*  Давайте расскажем это миру, и добавим все возможные
*  интерфейсы из Movable, Sellable, Discountable в класс Clothes. Ну а затем — реализуем их методы.
* */
class Clothes implements Discountable,Movable,Sellable {
    String put;
    String sell;
    String sale;

    public Clothes(String put, String sell, String sale) {
        this.put = put;
        this.sell = sell;
        this.sale = sale;
    }


    @Override
    public void discount() {
        System.out.println("Скидка: "+sale);
    }

    @Override
    public void putOn(){
        System.out.println("Надето: "+put);
    }

    @Override
    public void toSell(){
        System.out.println("Продано: "+sell);
    }

}
