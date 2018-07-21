package oopAndDesignPattern.chapter3.Polymorphism;

public class Plane {
    public static void main(String[] args) {
        TurboPlane tb = new TurboPlane();
        tb.boost();
        tb.fly();

        Plane2 p=tb;
        Turbo p2 = tb;

       //상속받거나 구현한 객체는 부모객체에 할당이 가능하다. 타입상속을 통한 다형성 구현
    }



}

class Plane2 {
    public void fly(){
        System.out.println("fly");
    }

}



interface  Turbo {
    public void boost();
}

class TurboPlane extends Plane2 implements Turbo{


    @Override
    public void boost() {
        System.out.println("가속");
    }
}


