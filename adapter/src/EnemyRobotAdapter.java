/**
 * Created by Bram on 18-2-2017.
 * This is the adapter. The client aspects something(the target) This adapter converts the given interface (adaptee) to expected target interface.
 * Adapter solves the issue that classes must implement every method defined by the shared interface.
 *
 */
public class EnemyRobotAdapter implements EnemyAttacker {
    private EnemyRobot enemyRobot;

    public EnemyRobotAdapter(EnemyRobot enemyRobot) {
        this.enemyRobot = enemyRobot;
    }


    @Override
    public void fireWeapon() {
        enemyRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        enemyRobot.walkForward();
    }

    @Override
    public void assignDriver(String name) {
        enemyRobot.reactToHuman(name);
    }
}
