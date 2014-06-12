package com.darcstarsolutions.apis.threetaps.reference;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by mharris021 on 6/11/14.
 */

public class ReferenceServiceTest {

    private ReferenceService referenceService;

    private static final Logger LOGGER = LoggerFactory.getLogger(ReferenceServiceTest.class);

    @Before
    public void setUp() throws Exception {
        referenceService = new ReferenceService("25fdd620fdb6d18a61e9162cfbb67373");
    }

    @After
    public void tearDown() throws Exception {
        referenceService = null;
    }

    @Test
    public void testGetDataSources() throws Exception {
        Assert.assertThat(referenceService.getApiKey(), is(equalTo("25fdd620fdb6d18a61e9162cfbb67373")));
        String result = referenceService.getDataSources();
        LOGGER.debug(result);

    }
}
