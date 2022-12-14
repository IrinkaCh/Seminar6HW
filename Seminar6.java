// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
//Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Seminar6 {
    public static void main(String[] args) {
        Set<Laptop> List_of_laptops = new HashSet<>();
        List<LaptopModel> hp = new ArrayList<LaptopModel>();
        hp.add(new LaptopModel("HP", "2364G324"));
        hp.add(new LaptopModel("HP", "TYR462G7"));
        hp.add(new LaptopModel("HP", "1434POI"));
        hp.add(new LaptopModel("HP", "657UY5"));

        List<LaptopModel> lenovo = new ArrayList<LaptopModel>();
        lenovo.add(new LaptopModel("lenovo", "79874O98"));
        lenovo.add(new LaptopModel("lenovo", "0999O8756"));
        lenovo.add(new LaptopModel("lenovo", "cbt7hgy3"));
        lenovo.add(new LaptopModel("lenovo", "lll96j7"));

        List<LaptopModel> Apple = new ArrayList<LaptopModel>();
        Apple.add(new LaptopModel("Apple", "IU7YT"));
        Apple.add(new LaptopModel("Apple", "POY98U"));
        Apple.add(new LaptopModel("Apple", "MN76GF"));
        Apple.add(new LaptopModel("Apple", "ERF3456"));

        List_of_laptops.add(new Laptop(4000, 500, "Windows 10", "green", lenovo));
        List_of_laptops.add(new Laptop(4000, 1000, "Windows 10", "blaсk", lenovo));
        List_of_laptops.add(new Laptop(2000, 1500, "Windows 10", "white", lenovo));
        List_of_laptops.add(new Laptop(8000, 2000, "Windows 10", "blaсk", lenovo));
        List_of_laptops.add(new Laptop(2000, 1000, "Windows 10", "blaсk", lenovo));
        List_of_laptops.add(new Laptop(8000, 500, "Windows 10", "red", lenovo));
        List_of_laptops.add(new Laptop(2000, 1000, "Windows10", "blaсk", lenovo));
        List_of_laptops.add(new Laptop(4000, 500, "Windows 10", "green", hp));
        List_of_laptops.add(new Laptop(2000, 1000, "Windows 10", "red", hp));
        List_of_laptops.add(new Laptop(8000, 2000, "Windows 10", "blaсk", hp));
        List_of_laptops.add(new Laptop(2000, 1000, "Windows 10", "blaсk", hp));
        List_of_laptops.add(new Laptop(8000, 500, "Windows 10", "red", hp));
        List_of_laptops.add(new Laptop(4000, 500, "Windows 10", "red", hp));
        List_of_laptops.add(new Laptop(2000, 1000, "Windows10", "blaсk", hp));
        List_of_laptops.add(new Laptop(4000, 500, "Windows 10", "green", Apple));
        List_of_laptops.add(new Laptop(2000, 1000, "Windows 10", "red", Apple));
        List_of_laptops.add(new Laptop(4000, 1000, "Windows 10", "blaсk", Apple));
        List_of_laptops.add(new Laptop(2000, 1500, "Windows 10", "white", Apple));
        List_of_laptops.add(new Laptop(8000, 500, "Windows 10", "red", Apple));
        List_of_laptops.add(new Laptop(4000, 500, "Windows 10", "red", Apple));
        List_of_laptops.add(new Laptop(2000, 1000, "Windows 11", "blaсk", Apple));

        System.out.println(List_of_laptops);
        FilterOfLaptop filterOfLaptop = new FilterOfLaptop(List_of_laptops);
        System.out.println();
        filterOfLaptop.filter();
        System.out.println(filterOfLaptop);
    }
}
