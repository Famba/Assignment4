package assignment4.OCP;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Admin on 2017/03/30.
 */
public class InsuranceTest {
    HealthInsuranceSurveyor healthInsuranceSurveyor;
    ClaimApprovalManager claim1;
    VehicleInsuranceSurveyor vehicleInsuranceSurveyor;
    ClaimApprovalManager claim2;

    @Before
    public void setUp() throws Exception {
        healthInsuranceSurveyor = new HealthInsuranceSurveyor();
        claim1 = new ClaimApprovalManager();
        vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();
        claim2 = new ClaimApprovalManager();
    }

    @Test
    public void testProcessClaim() throws Exception {
        claim1.processClaim(healthInsuranceSurveyor);
        claim2.processClaim(vehicleInsuranceSurveyor);

    }
}