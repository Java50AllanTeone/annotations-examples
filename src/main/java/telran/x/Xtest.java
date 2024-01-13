package telran.x;

import telran.reflect.BeforeEach;
import telran.reflect.Test;
public class Xtest {

    @Test
    void f1() {
        System.out.println("test 1");
    }

    int sum(int op1, int op2) {
        return op1 + op2;
    }

    int substract(int op1, int op2) {
        return op1 - op2;
    }

    @Test
    void f2() {
        System.out.println("test 2");
    }

    @BeforeEach
    void f3() {
        System.out.println("BeforeEach");
    }
}
