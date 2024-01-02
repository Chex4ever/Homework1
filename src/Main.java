//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("---");
        System.out.println("Задача 2:");
        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("---");
        System.out.println("Задача 3:");
        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("---");
        System.out.println("Задача 4:");
        var friend=19;
        System.out.println(friend);
        friend+=2;
        System.out.println(friend);
        friend/=7;
        System.out.println(friend);

        System.out.println("---");
        System.out.println("Задача 5:");
        var frog=3.5;
        System.out.println(frog);
        frog*=10;
        System.out.println(frog);
        frog/=3.5;
        System.out.println(frog);
        frog+=4;
        System.out.println(frog);

        System.out.println("---");
        System.out.println("Задача 6:");
        var fighter1=78.2;
        var fighter2=82.7;
        var fightersWeightSum=fighter1+fighter2;
        var fightersWeightDelta=Math.abs(fighter1-fighter2);
        System.out.println("Общая масса бойцов = "+fightersWeightSum);
        System.out.println("Разница масс бойцов = "+fightersWeightDelta);

        System.out.println("---");
        System.out.println("Задача 7:");
        var fightersWeightDelta1=fighter2-fighter1;
        var fightersWeightDelta2=fighter2%fighter1;
        System.out.println("Способ 1. Разница масс бойцов = "+fightersWeightDelta1);
        System.out.println("Способ 2. Разница масс бойцов = "+fightersWeightDelta2);

        System.out.println("---");
        System.out.println("Задача 8:");
        var totalWorkHours=640;
        var employeeWorkHours=8;
        var totalEmployees=totalWorkHours/employeeWorkHours;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек");
        var newTotalEmployees=totalEmployees+94;
        var newTotalWorkHours=newTotalEmployees*employeeWorkHours;
        System.out.println("Если в компании работает " + newTotalEmployees + " человек, то всего " +
                newTotalWorkHours + " часов работы может быть поделено между сотрудниками.");
    }
}