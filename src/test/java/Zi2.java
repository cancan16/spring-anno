class Fu2 {
    static int fuStaticVariable = 3;
    int fuVariable = 4;

    public Fu2() {
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

public class Zi2 extends Fu2 {

    static {
        new Fu2();
        System.out.println("Zi-静态代码块");
    }

    static Fu2 fu2 = new Fu2();

    public Zi2() {
        System.out.println(ziVariable);
        System.out.println(fu2);
        System.out.println("Zi-构造");
    }

    {
        System.out.println(fu2);
        System.out.println("Zi-非静态代码块");
    }

    int ziVariable = 1;

    public static void main(String[] args) {
        new Zi2();
    }

    /**
     * 1. 加载 fuStaticVariable = 3
     * 2. 3
     * 3. Fu-静态代码块
     * 4. 加载 fuVariable = 4
     * 5. 4
     * 6. 3
     * 7. Fu-非静态代码块
     * 8. 4
     * 9. 3
     * 10. Fu-构造
     * 11. Zi-静态代码块
     * 12. 4
     * 13. 3
     * 14. Fu-非静态代码块
     * 15. 4
     * 16. 3
     * 17. Fu-构造
     * 18. 4
     * 19. 3
     * 20. Fu-非静态代码块
     * 21. 4
     * 22. 3
     * 23. Fu-构造
     * 24. fu2对象
     * 25. Zi-非静态代码块
     * 26. 加载 ziVariable = 1
     * 27. 1
     * 28. fu2对象
     * 29. Zi-构造
     */
}