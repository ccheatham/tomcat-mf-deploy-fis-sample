package tests;

import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openlegacy.core.rpc.RpcSession;
import org.openlegacy.core.rpc.actions.RpcActions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.mf_rpc_sdk.openlegacy.Fininq2;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles({"fininq2-test"})
public class Fininq2Test {

    @Inject
    private RpcSession rpcSession;

    @Test
    public void testFininq2EXECUTE() throws Exception {
        try {
            Fininq2 fininq2 = new Fininq2();
            fininq2 = rpcSession.doAction(RpcActions.EXECUTE(), fininq2);
            assertNotNull(fininq2);
        } finally {
            rpcSession.disconnect();
        }
    }

}

