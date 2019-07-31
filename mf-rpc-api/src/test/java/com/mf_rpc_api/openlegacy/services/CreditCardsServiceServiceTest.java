package com.mf_rpc_api.openlegacy.services;


import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mf_rpc_api.openlegacy.config.AbstractWebContextAwareTest;
import com.mf_rpc_api.openlegacy.services.CreditCardsServiceService.CreditCardsServiceIn;
import com.mf_rpc_api.openlegacy.services.CreditCardsServiceService.CreditCardsServiceOut;


/**
 *  A test which invokes CreditCardsService service.
 *  To run the test, select Run As -> JUnit test.
 *  If the service has parameters, they should be set via the test.
 */
public class CreditCardsServiceServiceTest extends AbstractWebContextAwareTest {
    private static final Logger logger = LoggerFactory.getLogger(CreditCardsServiceServiceTest.class);
    
    @Inject
    CreditCardsServiceService creditCardsServiceService;

    @Test
    public void testCreditCardsServiceService() throws Exception {
        long before = System.currentTimeMillis();

        CreditCardsServiceIn creditCardsServiceIn = new CreditCardsServiceIn();
        creditCardsServiceIn.setCustId("");
        CreditCardsServiceOut creditCardsServiceOut = creditCardsServiceService.getCreditCardsService(creditCardsServiceIn);
        Assert.assertNotNull(creditCardsServiceOut);

        long after = System.currentTimeMillis();
        logger.info("Execution time:" + (after - before));
    }
}
