class A {
}

class B extends A {
    public void m1(){

    }

    public static void main(String[] args) {
        A a = new B();
        ((B) a).m1();
    }
}


// solve 2 here A1 and B1 instead of A and B


class A1 {
    public void m1(){

    }
}

class B1 extends A1 {
    @Override
    public void m1(){

    }

    public static void main(String[] args) {
        A1 a = new B1();
        a.m1();
    }
}