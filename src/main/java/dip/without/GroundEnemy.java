package dip.without;

public class GroundEnemy {

    // если мы добавим в метод аргумент float speed :
    // public void move(float speed){}
    // то тогда придётся менять метод moveAll в классе MovementController тоже
    // получается что класс высокого уровня зависит от класса низкого уровня
    // что несоответствует: High level modules should not depend upon low level modules
    public void move() {
        // some crawl logic
    }
}
