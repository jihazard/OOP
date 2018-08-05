package javaDesignPattern.Chapter2.abstractPart.code2_16;

public class Person {
    private Role r;
    
    public void setRole(Role r) {
        this.r = r;
    }
    
    public void doIt() {
        r.doIt();
    }




    public class Driver extends Role {
        @Override
        public void doIt() {
            System.out.println("driver! driving");
        }
    }

    public class Worker extends Role {
        @Override
        public void doIt() {
            System.out.println("workder! ~ working");
        }
    }




}

