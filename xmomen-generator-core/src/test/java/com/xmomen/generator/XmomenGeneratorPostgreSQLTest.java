package com.xmomen.generator;

import com.xmomen.generator.configuration.GeneratorConfiguration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by tanxinzheng on 17/8/6.
 */
public class XmomenGeneratorPostgreSQLTest extends XmomenGeneratorTest {
    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void generate() throws Exception {
        GeneratorConfiguration configuration = super.generate("src/main/resources/generator-config-postgresql.yml");
        PostgreSqlGenerator generator = new PostgreSqlGenerator();
        generator.generate(configuration);
    }
}