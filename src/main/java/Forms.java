public class Forms {
    public static void main(String[] args) {
        int b = 2022;
        All a1 = new All();
        a1.name = "Maks";
        a1.lastname = "Maskimov";
        a1.birth = 1999;
        a1.old = b - a1.birth;

        System.out.println(a1.old);
        All a2 = new All();

        a2.birth = 2002;
        a2.old = b - a2.birth;
    }
}
