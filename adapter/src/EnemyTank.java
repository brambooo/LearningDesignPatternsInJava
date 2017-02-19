/**
 * Created by Bram on 18-2-2017.
 */
public class EnemyTank implements  EnemyAttacker {
    @Override
    public void fireWeapon() {
        System.out.println("Tank attack");
    }

    @Override
    public void driveForward() {
        System.out.println("Moving tank forward");
    }

    @Override
    public void assignDriver(String name) {
        System.out.println("Assign " + name + " to tank");
    }
}
