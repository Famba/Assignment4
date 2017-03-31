package assignment4.OCP;

/**
 * Created by Admin on 2017/03/30.
 */
public class HealthInsuranceSurveyor extends InsuranceSurveyor {
    public HealthInsuranceSurveyor(){}

    @Override
    public boolean isValidClaim(){
        System.out.print("HealthInsuranceSurveyor: Validating health insurance claim...\n");
        return true;
    }
}
