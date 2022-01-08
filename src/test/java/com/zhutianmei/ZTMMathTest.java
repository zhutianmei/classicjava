package com.zhutianmei;

import junit.framework.TestCase;
import org.junit.Test;

public class ZTMMathTest extends TestCase {

    ZTMMath zm = new ZTMMath();

    @Test
    public void testAdd() {
        assertEquals(3d,zm.add(1,2));
    }
}