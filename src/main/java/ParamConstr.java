import java.time.LocalDateTime;
import java.time.Month;

public class ParamConstr {
}

class Par{
    LocalDateTime opened;
    String name;
    String lastname;
    int age;
    double weight;
    int height;

    public Par (LocalDateTime opened, String name,  String lostname,  int age, double weight, int height) {
        this.opened = opened;
        this.lastname = lostname;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    @Override /*Нафіга він тут, якщо все працює*/
    public String toString() {
        return String.format("Дата створення: %s \n Ім’я: %s \n Фамілія: %s \n Вік: %d \n Вага: %f \n Зріст: %s \n",
                opened.toString(), name, lastname, age, weight, height);

    }
}




