class Fu3 {
    static int fuStaticVariable = 3;
    int fuVariable = 4;

    public Fu3() {
        System.out.println(fuVariable);
        System.out.println(fuStaticVariable);
        System.out.println("Fu-构造");
    }

    {
        System.out.println(fuVariable);
        System.out.println(fuStaticVariable);
        System.out.println("Fu-非静态代码块");
    }

    static {
        System.out.println(fuStaticVariable);
        System.out.println("Fu-静态代码块");
    }
}

public class Zi3 extends Fu3 {

    static {
        System.out.println("Zi-静态代码块");
    }


    public Zi3() {
        System.out.println(ziVariable);
        System.out.println("Zi-构造");
    }

    {
        System.out.println("Zi-非静态代码块");
    }

    int ziVariable = 1;

    public static void main(String[] args) {
    }
    /**
     * 3
     * Fu-静态代码块
     * Zi-静态代码块
     */
}