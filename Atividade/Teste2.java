class Teste2{
    public static void main(String[] args){
            Teste1 conta;
                conta = new Teste1 ();
                conta.agencia = "Kason Bank";
                conta.titular = "Alex";
                conta.numero = 123;
                conta.abertura = "23/08/2023";
                conta.saldo = 100;
                conta.saque (50);
                conta.deposito(4.40);
                conta.rendimento();
                conta.impressao();
                System.out.println(conta.impressao);
            Teste1 conta2;
            conta2 = conta;
                conta.agencia = "Kason Bank2";
                System.out.println(conta2.agencia + "\n");
        
        boolean contaigual;
            if(conta == conta2){
                System.out.println("São iguais.");
            }
            else{
                System.out.println("Não são iguais.");
            }
    }
}