/**
 * Created by Bram on 18-2-2017.
 */
public class AdapterDemo {
    public static void main(String[] args) {

        EnemyTank enemyTank = new EnemyTank();

        EnemyRobot enemyRobot = new EnemyRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(enemyRobot);

        System.out.println("Robot:");
        enemyRobot.reactToHuman("Bram");
        enemyRobot.walkForward();
        enemyRobot.smashWithHands();

        System.out.println("\nEnemy tank:");

        enemyTank.assignDriver("Bram");
        enemyTank.driveForward();
        enemyTank.fireWeapon();

        // Robot with adapter
        System.out.println("\nRobot with adapter");
        robotAdapter.assignDriver("Henk");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();


    }

}
