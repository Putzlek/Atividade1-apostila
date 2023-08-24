class Teste1{
       String titular,agencia,abertura,impressao;
       int numero;
       double saldo,saque,deposito,rendimento;

      boolean saque(double vsacado){
        if(this.saldo<vsacado){
            return false;
            }
        else{
            double saldoatual = this.saldo - vsacado;
            this.saldo = saldoatual;
                return true;
            }
       }
     void deposito(double vdepositado){
        double saldoatual= this.saldo + vdepositado;
        this.saldo = saldoatual;
     }
    void rendimento(){
        double saldoatual= this.saldo * 0.1;
        this.rendimento=saldoatual;
    }
    String impressao(){
        System.out.println("Titular:"+titular + "\n" +"Agencia:"+ agencia + "\n" +"Data de abertura:"+ abertura);
        System.out.println( "\n" +"Numero: "+ numero +"\n" +"Saldo: "+ saldo + "\n" + "rendimento: " + rendimento);
            return impressao;
    }
}