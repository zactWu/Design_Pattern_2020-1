package com.github.tongjisserollman.iceamusementpark.interpreter;

import com.github.tongjisserollman.iceamusementpark.base.calculator.interpreter.*;
import org.junit.jupiter.api.Test;

class InterpreterTest {

    @Test
    public void testInterpreter() {
        // 解析 2+3-4/2 的值
        Expression a = new Num(2), b = new Num(3),
                c = new Num(4), d = new Num(2);

        Expression result = new Sub(new Add(a, b), new Div(c, d));

        System.out.println(result.interpret());
    }
}