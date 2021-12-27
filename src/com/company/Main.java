package com.company;

public class Main {

    public static void main(String[] args) {
	/**Try with resources-те колдоно ала турган Car деген класс тузунуз
     close() деген метод "Машина жабылып жатат" деп консольго чыгаруусу керек
     try unchecked exceptionдарды кармап аларды игнор кылыш керек
     main методдо try блоктун ичинде drive() деген методду чакырыныз, ал консольго "Машина журуп жатат" деп чыгаруусу керек

     Эскертуу: маселени чыгарууда try with resources колдонуу керек*/
        try(Car car = new Car("Porsche")){
            car.drive();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
