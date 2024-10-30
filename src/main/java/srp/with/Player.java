package srp.with;

import srp.Item;
import srp.with.controller.AttackController;
import srp.with.controller.MoveController;
import srp.with.controller.PickupController;

public class Player {

    private int health;
    private Item item;

    private AttackController attackController;
    private MoveController moveController;
    private PickupController pickupController;

    public void initControllers (AttackController attackController, MoveController moveController, PickupController pickupController) {
        this.attackController = attackController;
        this.moveController = moveController;
        this.pickupController = pickupController;
    }

    public void attack() {
        attackController.attack();
    }

    public void move() {
        moveController.move();
    }

    public void pickItem() {
        pickupController.pickItem();
    }


}
