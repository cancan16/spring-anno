class Fu2 {
    static int fuStaticVariable = 3;
    int fuVariable = 4;

    public Fu2() {
        System.out.println(fuVariable);
        System.out.println(fuStaticVariable);
        System.out.println("Fu-����");
    }

    {
        System.out.println(fuVariable);
        System.out.println(fuStaticVariable);
        System.out.println("Fu-�Ǿ�̬�����");
    }

    static {
        System.out.println(fuStaticVariable);
        System.out.println("Fu-��̬�����");
    }
}

public class Zi2 extends Fu2 {

    static {
        new Fu2();
        System.out.println("Zi-��̬�����");
    }

    static Fu2 fu2 = new Fu2();

    public Zi2() {
        System.out.println(ziVariable);
        System.out.println(fu2);
        System.out.println("Zi-����");
    }

    {
        System.out.println(fu2);
        System.out.println("Zi-�Ǿ�̬�����");
    }

    int ziVariable = 1;

    public static void main(String[] args) {
        new Zi2();
    }

    /**
     * 1. ���� fuStaticVariable = 3
     * 2. 3
     * 3. Fu-��̬�����
     * 4. ���� fuVariable = 4
     * 5. 4
     * 6. 3
     * 7. Fu-�Ǿ�̬�����
     * 8. 4
     * 9. 3
     * 10. Fu-����
     * 11. Zi-��̬�����
     * 12. 4
     * 13. 3
     * 14. Fu-�Ǿ�̬�����
     * 15. 4
     * 16. 3
     * 17. Fu-����
     * 18. 4
     * 19. 3
     * 20. Fu-�Ǿ�̬�����
     * 21. 4
     * 22. 3
     * 23. Fu-����
     * 24. fu2����
     * 25. Zi-�Ǿ�̬�����
     * 26. ���� ziVariable = 1
     * 27. 1
     * 28. fu2����
     * 29. Zi-����
     */
}