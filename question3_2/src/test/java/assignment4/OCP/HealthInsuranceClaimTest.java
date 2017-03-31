package assignment4.OCP;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Admin on 2017/03/31.
 */
public class HealthInsuranceClaimTest {
    HealthInsuranceSurveyor surveyor;
    ClaimApprovalManager manager;

    @Before
    public void setUp() throws Exception {
        surveyor = new HealthInsuranceSurveyor();
        manager = new ClaimApprovalManager();

    }

    @Test
    public void testClaim() throws Exception {
        manager.processHealthClaim(surveyor);
        manager.processVehicleClaim(surveyor);
    }
}