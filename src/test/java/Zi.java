class Fu {
    static int fuStaticVariable = 3;
    int fuVariable = 4;

    public Fu() {
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

public class Zi extends Fu {

    static int ziStaticVariable = 2;

    public Zi() {
        System.out.println(ziVariable);
        System.out.println(ziStaticVariable);
        System.out.println("Zi-����");
    }

    {
        System.out.println(ziStaticVariable);
        System.out.println("Zi-�Ǿ�̬�����");
    }

    int ziVariable = 1;

    static {
        System.out.println(ziStaticVariable);
        System.out.println("Zi-��̬�����");
    }

    public static void main(String[] args) {
        new Zi();
    }

    /**
     * 1. ���� fuStaticVariable = 3
     * 2. 3
     * 3. Fu-��̬�����
     * 4. ���� ziStaticVariable = 2
     * 5. 2
     * 6. Zi-��̬�����
     * 7. ���� fuVariable = 4
     * 8. 4
     * 9. 3
     * 10. Fu-�Ǿ�̬�����
     * 11. 4
     * 12. 3
     * 13. Fu-����
     * 14. 2
     * 15. Zi-�Ǿ�̬�����
     * 16. ���� ziVariable = 1
     * 17. 1
     * 18. 2
     * 19. Zi-����
     */
}