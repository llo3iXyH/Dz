public class SetGet {
    public static void main(String[] args) {
        GetSet Penguin = new GetSet("Rico", 4, 12.2);
        /*System.out.println(Penguin.getName());
        System.out.println(Penguin.getAge());
        System.out.println(Penguin.getWeight());*/
        Penguin.setName("Shkiper");
        Penguin.setAge(3);
        Penguin.setWeight(11.2);
        Penguin.check();
    }
}
