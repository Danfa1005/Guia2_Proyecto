
public class Cuenta {

    private int saldo;

    public Cuenta (int saldo){
        this.saldo = saldo ;

    }
    public int sal (int saldo){
        this.saldo = saldo;
        return this.saldo;

    }
    public int reti (int retiro){
        this.saldo=this.saldo-retiro;
        return this.saldo;
    }
    public int depos (int deposito){
        this.saldo=this.saldo+deposito;
        return saldo;
    }

}

