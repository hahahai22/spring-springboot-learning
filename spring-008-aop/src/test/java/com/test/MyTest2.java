package com.test;

import com.proxy2.BookServiceImp;
import com.proxy2.SubBookServiceImp;
import org.junit.Test;

/**
 * @author 焦海龙
 * @version 2021.2
 * @date 2022/4/25 20:57
 */
public class MyTest2 {
    @Test
    public void test02() {
        BookServiceImp bookServiceImp = new SubBookServiceImp();
        bookServiceImp.buy();
    }
}
