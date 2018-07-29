package oopAndDesignPattern.chapter7.FactoryPattern;

import oopAndDesignPattern.chapter7.FactoryPattern.unit.Boss;
import oopAndDesignPattern.chapter7.FactoryPattern.unit.Obstacle;
import oopAndDesignPattern.chapter7.FactoryPattern.unit.SmallFight;

public class EasyStageEnemyFactory extends  EnemyFactory{
    @Override
    public Boss createBoss() {
        return null;
    }

    @Override
    public SmallFight createSmallFight() {
        return null;
    }

    @Override
    public Obstacle createObstacle() {
        return null;
    }

    class HardStageEnemyFactory extends  EnemyFactory {

        @Override
        public Boss createBoss() {
            return null;
        }

        @Override
        public SmallFight createSmallFight() {
            return null;
        }

        @Override
        public Obstacle createObstacle() {
            return null;
        }
    }
}
