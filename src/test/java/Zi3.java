class Fu3 {
    static int fuStaticVariable = 3;
    int fuVariable = 4;

    public Fu3() {
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

public class Zi3 extends Fu3 {

    static {
        System.out.println("Zi-��̬�����");
    }


    public Zi3() {
        System.out.println(ziVariable);
        System.out.println("Zi-����");
    }

    {
        System.out.println("Zi-�Ǿ�̬�����");
    }

    int ziVariable = 1;

    public static void main(String[] args) {
    }
    /**
     * 3
     * Fu-��̬�����
     * Zi-��̬�����
     */
}