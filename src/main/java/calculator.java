public class calculator {

    public static int add(int a , int b)
    {

        if (a > 0 && b > 0 && a+b <=0)
            throw new IndexOutOfBoundsException();

        return a+b;
    }

    public static int subtract(int a , int b)
    {

        return 0;

    }


}



