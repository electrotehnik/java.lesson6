public class Main {
    public static void main(String[] args) {
        //Задача1. Демонстрация метода, которые меняет местами два элемента массива.
        //Исходные данные
        String[]    strings = {"Каждый", "Охотник", "Желает", "Знать"};
        Integer[]   numbers = {0, 1, 2, 3};

        //Благодаря универсальному параметру, используем один и тот же метод для разных типов данных
        Swapper swapper = new Swapper();
        swapper.swap(strings, 0, 3);
        swapper.swap(numbers, 0, 3);

        //Выводим результаты
        for(String item : strings) {
            System.out.print(item + ", ");
        }
        System.out.println(" ");
        for(Integer item : numbers) {
            System.out.print(item + ", ");
        }
    }
}
