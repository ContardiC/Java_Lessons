package spacecoding.collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
public class ComparatorExample2{
    public static void main(String[] args) {
        ArrayList<Car> carsList = new ArrayList<Car>();
        carsList.add(new Car("Ferrari 488", 2020, 250000.0));
        carsList.add(new Car("Porsche 911", 2021, 180000.0));
        carsList.add(new Car("Lamborghini Huracan", 2022, 220000.0));
        carsList.add(new Car("BMW M3", 2023, 80000.0));
        carsList.add(new Car("Audi R8", 2022, 170000.0));

        System.out.println(carsList.toString());
        //confronta con il metodo .comparing() in base al criterio che specifichiamo come argomento
        Comparator<Car> comparator = Comparator.comparing(Car::getYear);
        Collections.sort(carsList,comparator);

        for(Car car : carsList){
            System.out.println(car.toString());
        }

    }
}