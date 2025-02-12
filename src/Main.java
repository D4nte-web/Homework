public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        var boxer1 = 78.2;
        System.out.println(boxer1);
        var boxer2 = 82.7;
        System.out.println(boxer2);
        System.out.println(boxer1 + boxer2);
        System.out.println(boxer1 - boxer2);
        System.out.println(boxer2 % boxer1);

        var workingHours = 640;
        var employeeHours = 8;
        var staff = (workingHours / employeeHours);
        System.out.println("Всего работников в компании — " + staff + " человек");
        staff = staff + 94;
        employeeHours = (workingHours / staff);
        System.out.println("Если в компании работает " + staff + " человек, то всего по " + employeeHours + " часа работы может быть поделено между сотрудниками");


    }
}