package dip.without;

public class MovementController {

    private GroundEnemy groundEnemy;
    private JumperEnemy jumperEnemy;
    private FlyEnemy flyEnemy;

    public void moveAll () {
        groundEnemy.move();
        jumperEnemy.move();
        flyEnemy.move();
    }
}
