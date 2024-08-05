package org.lili.converters;

import org.apache.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;



/**
 * @packgeName: org.lili.converters
 * @ClassName: OrikaTest
 * @copyright: CopyLeft
 * @description:<描述>
 * @author: lili
 * @date: 2017/8/15-0:52
 * @version: 1.0
 * @since: JDK 1.8
 */
public class OrikaTest {

    private static final Logger LOG  = Logger.getLogger(OrikaTest.class);

    @Test
    public void testOrika(){
        assertFalse(false);
        assertTrue(true);
        assertNotNull("Hello");
        assertEquals("1","1");
    }

    @Test
    public void testDemo(){
        LOG.debug("555");
    }

}
