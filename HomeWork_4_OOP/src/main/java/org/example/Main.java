// 1)расширить класс калькулятор на умножение
// 2)расширить класс калькулятор на деление
// 3)расширить класс калькулятор на бинарный перевод(принимаемые значения как стринг, так и инт - тут необходимо подумать как наилучшим образом реализовать, что будет если будут приниматься округляемые Double/Float (округляемые -> с нулем на конце прим. 3.0 , 4.0 и тд т))


package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calc calc3 = new Calc();
        System.out.println(calc3.sum(new ArrayList<>(Arrays.asList(1.0,2.0,3.5))));
        System.out.println(calc3.sub(new ArrayList<>(Arrays.asList(2.0,1.1))));
        System.out.println(calc3.multi(new ArrayList<>(Arrays.asList(1.0,2.0,3.5))));
        System.out.println(calc3.div(new ArrayList<>(Arrays.asList(1.0,2.0,3.5))));
        calc3.clear();
        System.out.println(calc3.div(new ArrayList<>(Arrays.asList(6.0,2.0))));
        calc3.add(24.0);
        System.out.println(calc3.div(new ArrayList<>(Arrays.asList(6.0,2.0))));
        calc3.clear();
        System.out.println(calc3.sum(new ArrayList<>(Arrays.asList(1,2,3))));

        System.out.println();
        System.out.println(calc3.binary(1111));
        System.out.println(calc3.binary("1111"));

        System.out.println();
        calc3.add(6.8);
        System.out.println(calc3.toBinary());
        System.out.println(calc3.toBinary(7.5));
        System.out.println(calc3.toBinary(7));
        System.out.println(calc3.toBinary("7.5"));

        System.out.println();
        System.out.println(calc3.getRes());
    }
}