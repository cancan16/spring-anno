class Fu {
    static int fuStaticVariable = 3;
    int fuVariable = 4;

    public Fu() {
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

public class Zi extends Fu {

    static int ziStaticVariable = 2;

    public Zi() {
        System.out.println(ziVariable);
        System.out.println(ziStaticVariable);
        System.out.println("Zi-构造");
    }

    {
        System.out.println(ziStaticVariable);
        System.out.println("Zi-非静态代码块");
    }

    int ziVariable = 1;

    static {
        System.out.println(ziStaticVariable);
        System.out.println("Zi-静态代码块");
    }

    public static void main(String[] args) {
        new Zi();
    }

    /**
     * 1. 加载 fuStaticVariable = 3
     * 2. 3
     * 3. Fu-静态代码块
     * 4. 加载 ziStaticVariable = 2
     * 5. 2
     * 6. Zi-静态代码块
     * 7. 加载 fuVariable = 4
     * 8. 4
     * 9. 3
     * 10. Fu-非静态代码块
     * 11. 4
     * 12. 3
     * 13. Fu-构造
     * 14. 2
     * 15. Zi-非静态代码块
     * 16. 加载 ziVariable = 1
     * 17. 1
     * 18. 2
     * 19. Zi-构造
     */
}