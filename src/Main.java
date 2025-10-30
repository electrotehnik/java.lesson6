import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Задача1. Демонстрация метода, которые меняет местами два элемента массива.
        //Исходные данные
        String[]    strings = {"Каждый", "Охотник", "Желает", "Знать"};
        Integer[]   numbers = {0, 1, 2, 3};

        /*  Выполняем задачу 2.
            Преобразуем массив в ArrayList, с любыми ссылочными типами данных на входе
         */
        Mapper mapper = new Mapper();
        ArrayList<String> arrListStrings = mapper.toMap(strings);
        ArrayList<Integer> arrListNumbers = mapper.toMap(numbers);

        /*  Благодаря универсальному параметру,
            используем один и тот же метод для разных типов данных
         */
        Swapper swapper = new Swapper();
        swapper.swap(strings, 0, 3);
        swapper.swap(numbers, 0, 3);

        //Выводим результаты по задаче 1
        for(String item : strings) {
            System.out.print(item + ", ");
        }
        System.out.println(" ");
        for(Integer item : numbers) {
            System.out.print(item + ", ");
        }

        //Выводим результаты по задаче 2
        System.out.println(" ");
        for(String item : arrListStrings) {
            System.out.print(item + ", ");
        }
        System.out.println(" ");
        for(Integer item : arrListNumbers) {
            System.out.print(item + ", ");
        }
    }
}
