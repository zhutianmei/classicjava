package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZTMMathTest extends TestCase {

    ZTMMath zm = new ZTMMath();

    @Test
    public void testAdd() {
        assertEquals(3d,zm.add(1,2));
    }
}