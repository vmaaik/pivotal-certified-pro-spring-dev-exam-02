
package com.apress.cems.beans;

import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class HumanAppCfgTest {

    @Test
    void testHumanAndItem() {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(HumanAppCfg.class);

        Human humanBean = ctx.getBean(Human.class);

        assertNotNull(humanBean);
        assertNotNull(humanBean.getItem());
        assertNotNull(humanBean.getItem().getTitle());
        assertEquals("Brief History", humanBean.getItem().getTitle());

        ctx.close();
    }
}
