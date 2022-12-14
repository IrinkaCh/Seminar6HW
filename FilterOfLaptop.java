import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class FilterOfLaptop {
    Set<Laptop> laptop;

    public FilterOfLaptop(Set<Laptop> laptop) {
        this.laptop = laptop;
    }

    public void filter() {
        Integer numberKey = 1;
        Integer minValue = 1;
        Set<Laptop> filteredLaptop = new HashSet<>();
        Map<Integer, Integer> filterlist = new HashMap<>();
        boolean end = false;
        Scanner line = new Scanner(System.in, "cp866");
        while (!end) {
            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Цвет");
            System.out.print("Ваш выбор: ");
            boolean next = false;
            while (!next) {
                String stecline = line.nextLine();
                try {
                    numberKey = Integer.parseInt(stecline);
                    next = true;
                    if (1 > numberKey || 4 < numberKey) {
                        System.out.println("Введите число от 1 до 4: ");
                        next = false;
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("Введенные данные не являются натуральным числом");
                    next = false;
                }
            }
            if (numberKey == 1)
                System.out.print("Выберите минимальный размер ОЗУ (введите 1 - 2000 МБ, 2 - 4000 МБ, 3 - 8000 МБ):");
            else if (numberKey == 2)
                System.out.print("Выберите минимальный oбъем ЖД (введите 1 - 500 ГБ, 2 - 1000 ГБ, 3 - 1500 ГБ) :");
            else if (numberKey == 3)
                System.out.print("Выберите операционную систему (введите 1 - Windows 10, 2 - Windows 11) :");
            else if (numberKey == 4)
                System.out.print("Выберите цвет корпуса (введите 1 - зеленый, 2 - красный, 3 - черный, 4 - белый) :");
            next = false;
            while (!next) {
                String stecline = line.nextLine();
                try {
                    minValue = Integer.parseInt(stecline);
                    next = true;
                    if (numberKey == 1 || numberKey == 2) {
                        if (1 > minValue || 3 < minValue)
                            next = false;
                    }
                    if (numberKey == 3) {
                        if (1 > minValue || 2 < minValue)
                            next = false;
                    }
                    if (numberKey == 4) {
                        if (1 > minValue || 4 < minValue)
                            next = false;
                    }
                } catch (NumberFormatException nfe) {
                    System.out.print("Введенные данные не являются натуральным числом Введите новое значение:");
                    next = false;
                }
            }

            filterlist.put(numberKey, minValue); 
            System.out.print("Желаете ввести еще критерий для отбора? - 1, нет - 0 :");
            next = false;
            while (!next) {
                String stecline = line.nextLine();
                try {
                    numberKey = Integer.parseInt(stecline);
                    next = true;
                    if (numberKey == 0) {
                        end = true;
                    }
                } catch (NumberFormatException nfe) {
                    System.out.print("Введенные данные не являются натуральным числом. Введите новое значение:");
                    next = false;
                }
            }
        }
        line.close();
        Set<Integer> setKeys = filterlist.keySet();
        System.out.println(setKeys);
        System.out.println();
        System.out.println(filterlist);
        System.out.println();
        for (Laptop fillLaptop : laptop)
            for (Integer key : setKeys) {
                if (key == 1) {
                    if (filterlist.get(key) == 1)
                        if (fillLaptop.getOzu() < 2000)
                            continue; 
                    if (filterlist.get(key) == 2)
                        if (fillLaptop.getOzu() < 4000)
                            continue;
                    if (filterlist.get(key) == 3)
                        if (fillLaptop.getOzu() < 8000)
                            continue;
                }
                if (key == 2) { 
                    if (filterlist.get(key) == 1)
                        if (fillLaptop.getSize_of_hard_drive() < 500)
                            continue; 
                    if (filterlist.get(key) == 2)
                        if (fillLaptop.getSize_of_hard_drive() < 1000)
                            continue;
                    if (filterlist.get(key) == 3)
                        if (fillLaptop.getSize_of_hard_drive() < 1500)
                            continue;
                }
                if (key == 3) {
                    if (filterlist.get(key) == 1)
                        if (!fillLaptop.getOs().equals("Windows 10"))
                            continue; 
                    if (filterlist.get(key) == 2)
                        if (!fillLaptop.getOs().equals("Windows 11"))
                            continue;
                }

                if (key == 4) { 
                    if (filterlist.get(key) == 1)
                        if (!fillLaptop.getColor().equals("green"))
                            continue; 
                    if (filterlist.get(key) == 2)
                        if (!fillLaptop.getColor().equals("red"))
                            continue;
                    if (filterlist.get(key) == 3)
                        if (!fillLaptop.getColor().equals("blaсk"))
                            continue;
                    if (filterlist.get(key) == 4)
                        if (!fillLaptop.getColor().equals("white"))
                            continue;
                }
                filteredLaptop.add(fillLaptop); 
            }
        laptop = filteredLaptop;
    }

    @Override
    public String toString() {
        return "Отфильтрованный список ноутбуков = [" + laptop + "]";
    }
}