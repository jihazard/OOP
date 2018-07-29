package oopAndDesignPattern.chapter7.FactoryPattern;

import oopAndDesignPattern.chapter7.FactoryPattern.unit.Boss;
import oopAndDesignPattern.chapter7.FactoryPattern.unit.Obstacle;
import oopAndDesignPattern.chapter7.FactoryPattern.unit.SmallFight;

public abstract  class EnemyFactory  {
    public static EnemyFactory getFactory(int level){
        if(level == 1) return EasyStageEnemyFactory();
        return HardEnemyFactory();
    }

    private static EnemyFactory HardEnemyFactory() {
        return null;
    }

    private static EnemyFactory EasyStageEnemyFactory() {
        return null;
    }

    //객체생성을 위한 팩토리 메서드
    public abstract Boss createBoss();
    public abstract SmallFight createSmallFight();
    public abstract Obstacle createObstacle();
}
