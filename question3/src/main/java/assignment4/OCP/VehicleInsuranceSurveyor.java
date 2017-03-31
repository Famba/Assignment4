package assignment4.OCP;

/**
 * Created by Admin on 2017/03/30.
 */
public class VehicleInsuranceSurveyor extends InsuranceSurveyor{
    @Override
    public boolean isValidClaim() {
        System.out.print("VehicleInsuranceSurveyor: Validating health insurance claim...\n");
        return true;
    }
}
