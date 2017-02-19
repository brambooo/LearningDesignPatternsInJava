/**
 * Created by Bram on 18-2-2017.
 * Target interface -- client expect this interface.
 * Adapters should work with this interface (contract)
 */
public interface EnemyAttacker {
    void fireWeapon();
    void driveForward();
    void assignDriver(String name);
}
