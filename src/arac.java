public class arac {
    double ucret;
    String tip;

    public arac(double ucret, String tip) {
        this.ucret = ucret;
        this.tip = tip;
    }

    public double getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}

class class_1 extends arac{
    public class_1(double ucret, String tip) {
        super(ucret,tip);
    }
}


class class_2 extends arac{
    public class_2(double ucret, String tip) {
        super(ucret,tip);
    }
}


class class_3 extends arac{
    public class_3(double ucret, String tip) {
        super(ucret,tip);
    }
}