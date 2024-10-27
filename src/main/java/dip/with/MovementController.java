package dip.with;

import dip.without.FlyEnemy;
import dip.without.GroundEnemy;
import dip.without.JumperEnemy;

public class MovementController {

    private Movable groundEnemy;
    private Movable jumperEnemy;
    private Movable flyEnemy;

    public MovementController(Movable groundEnemy, Movable jumperEnemy, Movable flyEnemy) {
        this.groundEnemy = groundEnemy;
        this.jumperEnemy = jumperEnemy;
        this.flyEnemy = flyEnemy;
    }

    public void moveAll () {
        groundEnemy.move();
        jumperEnemy.move();
        flyEnemy.move();
    }
}
