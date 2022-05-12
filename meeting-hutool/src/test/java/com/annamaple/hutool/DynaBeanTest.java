package com.annamaple.hutool;

import cn.hutool.core.bean.DynaBean;
import cn.hutool.core.lang.Console;
import com.annamaple.hutool.bean.User;
import org.junit.jupiter.api.Test;

/**
 * @author xionglei
 * @create 2022-05-07 17:25
 */
public class DynaBeanTest {

    @Test
    public void test() {
        User user = new User();
        DynaBean dynaBean = DynaBean.create(user);
        dynaBean.set("name", "annamaple");
        dynaBean.set("age", 12);
        Console.log("dynaBean: {}, user.name: {}, user.age: {}", dynaBean, dynaBean.get("name"), dynaBean.get("age"));
        // 执行指定方法
        dynaBean.invoke("show");
        System.out.println(("show"));
    }
}
