package assignment4.OCP;

/**
 * Created by Admin on 2017/03/30.
 */
public class ClaimApprovalManager {
    public ClaimApprovalManager() {
    }
    public void processClaim(InsuranceSurveyor surveyor){
        if(surveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....\n");
        }
    }
}

