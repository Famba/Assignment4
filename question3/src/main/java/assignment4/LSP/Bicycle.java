package assignment4.LSP;

/**
 * Created by Admin on 2017/03/30.
 */
public class Bicycle extends NonEngineMachine {
    @Override
    public void startMoving() {
        super.startMoving();
        System.out.print("Bicycle: Bicycle is moving");
    }
}