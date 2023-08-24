class recursao{
    int calculof,calculo;
    int sequencia;
    int calculo(int posicao){
        if(posicao<2){
            return 1;
        }        
        else{
            return (posicao-1) + (posicao-2);
        }
    }
}
