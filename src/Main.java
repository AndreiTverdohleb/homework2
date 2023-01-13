public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println(" ");
    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println(" ");
    }

    // задача 6
    public static void task6() {
        System.out.println("Задача 6");
        var koliaWeight = 78.2;
        var vaniaWeight = 82.7;
        var totalWeight = koliaWeight + vaniaWeight;
        System.out.println("Общий вес 2-х бойцов равен " + totalWeight + " кг");
        var differenceWeight = vaniaWeight - koliaWeight;
        System.out.println("Разница в весе составляет " + differenceWeight + " кг");
        System.out.println(" ");
    }
    public static void task7() {
        System.out.println("Задача 7");
        var koliaWeight = 78.2;
        var vaniaWeight = 82.7;
        var differenceWeight = vaniaWeight - koliaWeight;
        System.out.println("Разница в весе составляет " + differenceWeight + " кг"); // способ 1
        var differenceWeight2 = vaniaWeight % koliaWeight;
        System.out.println("Разница в весе составляет " + differenceWeight2 + " кг"); // способ 2
        System.out.println(" ");
    }

    public static void task8() {
        System.out.println("Задача 8");
        var totalTime = 640;
        var workingTime = 8;
        var totalPeople = totalTime / workingTime;
        System.out.println("Всего работников в компании - " + totalPeople + " человек");
        // задача 2 ()
        var totalPeople1 = totalPeople + 94;
        var workingTime1 = totalPeople1 * workingTime;
        System.out.println("Если в компании работает " + totalPeople1 + " человек, то всего " + workingTime1 + " часов работы может быть поделено между сотрудниками.");
    }



}