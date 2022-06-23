public class Zoo {
    public static void main(String[] args) {
        All b1 = new All();
        //Beasts b1 = new Beasts();
        b1.name = "Єнот";
        b1.age = 15 ;
        b1.growth = 30;
        b1.weight = 8.5;
        b1.located = "майже по всьому світу";
        System.out.println("Короткі данні про данну тварину :" + b1.name +
                ", живе " + b1.located + " може прожити до " + b1.age +
                " років, та матє розміри до " + b1.growth +
                " см, та вагу до " + b1.weight + "кг.");

        All b2 = new All();
        //Beasts b2 = new Beasts();
        b2.name = "Кіт";
        b2.age = 120 ;
        b2.growth = 50;
        b2.weight = 15.5;
        b2.located = "майже по всьому світу"; //
        System.out.println("Короткі данні про данну тварину :" + b2.name +
                ", живе " + b2.located + " може прожити до " + b2.age +
                " років, та матє розміри до " + b2.growth +
                " см, та вагу до " + b2.weight + "кг.");

        All b3 = new All();
        //Beasts b3 = new Beasts();
        b3.name = "Королевський пенгвін";
        b3.age = 18 ;
        b3.growth = 45;
        b3.weight = 10.1;
        b3.located = "Північний полюс";
        System.out.println("Короткі данні про данну тварину :" + b3.name +
                ", живе " + b3.located + " може прожити до " + b3.age +
                " років, та матє розміри до " + b3.growth +
                " см, та вагу до " + b3.weight + "кг.");

        All b4 = new All();
        //Beasts b4 = new Beasts();
        b4.name = "Страус";
        b4.age = 30 ;
        b4.growth = 215;
        b4.weight = 125.4;
        b4.located = "Ямайка";
        System.out.println("Короткі данні про данну тварину :" + b4.name +
                ", живе " + b4.located + " може прожити до " + b4.age +
                " років, та матє розміри до " + b4.growth +
                " см, та вагу до " + b4.weight + "кг.");

        All b5 = new All();
        //Beasts b5 = new Beasts();
        b5.name = "Айтішнік";
        b5.age = 90;
        b5.growth = 200;
        b5.weight = 150.0;
        b5.located = "по всьому світу";
        System.out.println("Короткі данні про данну тварину :" + b5.name +
                ", живе " + b5.located + " може прожити до " + b5.age +
                " років, та матє розміри до " + b5.growth +
                " см, та вагу до " + b5.weight + "кг.");
    }
}
