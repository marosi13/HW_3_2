public class Main {
    public static void main(String[] args) {
        long amount = 200000;
        long deposit = 10000;
        long bonus = 0;
        if (amount >= 100000)
        {bonus = amount / 100 / 100;}
        long all = bonus + deposit/100 + amount/100;
        System.out.println(all);
    }
}