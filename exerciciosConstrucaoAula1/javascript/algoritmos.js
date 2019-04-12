//MÉTODOS ESSENCIAIS
var view = ''

function getView(){
    try{
        addToView('propriedade3025', propriedade3025(3025))
        addToView('propriedade153', propriedade153(153))
        addToView('diaDaSemana', diaDaSemana(11,4,2019))
        addToView('mod', mod(5, 3))
        addToView('somaNaturais', somaNaturais(3))
        addToView('fatorial', fatorial(3))
        addToView('produto', produto(4,3))
        addToView('potencia', potencia(3,3))
        addToView('pi', pi(1000000))
        addToView('logaritmoNatural', logaritmoNatural(3, 3))
        addToView('razaoAurea', razaoAurea(3,4,3))
        addToView('quadradoPerfeito', quadradoPerfeito(3))
        addToView('raiz', raiz(9,3))
        addToView('primo', primo(3))
        addToView('crivoErastotenes', crivoErastotenes([1, 2, 3], 3))
        addToView('mdc', mdc(81, 54))
        addToView('mdc2', mdc2([81, 54], 27))
        addToView('horner', horner(3, 4, 5, 6, 7))
        addToView('fibonacci', fibonacci(3))
        addToView('cpf', cpf([9,3,0,9,1,9,8,5,0,8,3]))
        addToView('cpf2', cpf2([9,3,0,9,1,9,8,5,0,8,3]))
    }catch(e){
        console.error(e);
    }
    return view
}

function addToView(name, value){
        view+='<br><br>'+name+':\t'+value
}

//INÍCIO DOS EXERCÍCIOS
function propriedade3025(n){
    if( 0<n     &&
        n<9999  
    ){

        i=parseInt(n/100)
        j=parseInt(n%100)
        return ((i+j)*(i+j)==n).toString()

    }else{
        throw new Error('Argumento Inválido');
    }
}

function propriedade153(cdu){
    if( 100<=cdu    && 
        cdu<=999    
    ){
            
        c=parseInt(cdu/100)
        du=parseInt(cdu%100)
        d=parseInt(du/10)
        u=parseInt(du%10)
        return ((c*c*c)+(d*d*d)+(u*u*u)==cdu).toString()

    }else{
        throw new Error('Argumento Inválido');
    }
}

function diaDaSemana(d, m, a){
    if( 1<=d    &&
        d<=31   &&
        1<=m    &&
        m<=12   &&
        a>1753  
    ){

        if(m==1||m==2){
            m=m+12
            a=a-1
        }
        s=d+(2*m)+((3*(m+1))/5)+a+(a/4)-(a/100)+(a/400)
        return parseInt(s%7)

    }else{
        throw new Error('Argumento Inválido');
    }
}

function mod(x, y){

    if( 0<=y    &&
        0<x     
    ){
            
        s=x
        while(y<=s){
            s=s-y
        }
        return s

    }else{
        throw new Error('Argumento Inválido');
    }
}

function somaNaturais(n){
    if( 0<=n    
    ){

        i=2
        s=1
        while(i<=n){
            s=s+i
            i=i+1
        }

        return s
    }else{
        throw new Error('Argumento Inválido');
    }
}

function fatorial(n){
    if( n<=i 
    ){

        i=2
        f=1
        while(i<=n){
            f=f*i
            i=i+1
        }
        return f

    }else{
        throw new Error('Argumento Inválido');
    }
}

function produto(a, b){
    if( 0<=a    &&
        0<=b    
    ){
            
        totalParcelas=a
        parcela=b
        if(b<a){
            totalParcelas=b
            parcela=a
        }
        i=1
        s=0
        while(i<=totalParcelas){
            s+=parcela
            i+=1
        }
        return s

    }else{
        throw new Error('Argumento Inválido');
    }
}

function potencia(x, y){
    if( 0<x     &&
        0<=y
    ){

        let potencia=1
        i=1
        while(i<=y){
            potencia=produto(potencia, x)
            i+=1
        }
            return potencia

    }else{
        throw new Error('Argumento Inválido');
    }
}

function pi(n){
    if( 1<=n
    ){
        i=1
        s=-1
        d=-1
        p=0
        while(i<=n){
            d=d+2
            s=-1*s
            p=p+4*s/d
            i=i+1
        }
        return p
    }else{
        throw new Error('Argumento Inválido');
    }
}

function logaritmoNatural(n, k){
    if( 1<=n    &&
        2<=k
    ){
        i=2
        e=1+n
        numerador=2
        denominador=1
        while(i<=k){
            numerador = numerador*numerador
            denominador = denominador * i
            e = e + numerador / denominador
            i = i + 1
        }
        return e;
    }else{
        throw new Error('Argumento Inválido');
    }
}

function razaoAurea(x, y, k){
    if(
        0<=x    &&
        x<y     &&
        0<k
    ){
        c=y
        a=x
        i=1
        while(i<=k){
            t=c
            c=c+a
            a=t
            i=i+1
        }
        return c/a
    }else{
        throw new Error('Argumento Inválido');
    }

}

function quadradoPerfeito(n){
     if(
        1<n
    ){
        i=1
        s=1
        while(s<n){
            i+=2
            s+=i
        }
        return s==n
    }else{
        throw new Error('Argumento Inválido');
    }
}

function raiz(n, i){
    if(
        0<n
    ){
        r=1
        while(0<=i){
            r=(r+n/r)/2
            i=i-1
        }
        return r
    }else{
        throw new Error('Argumento Inválido');
    }
}

function primo(n){
    if(
        n>1
    ){
        i=2
        while(i<=n){
            if(n%i==0){
                return false
            }
            i+=1
        }
        return true
    }else{
        throw new Error('Argumento Inválido');
    }
}

function crivoErastotenes(a, n){
    for(i=0;i<arguments.length;i++){
        if(
            n>1             &&
            !(i>2 && i>n)   ||
            arguments[i]==0
        ){
            i=2
            //TODO: Completar algoritmo
        }else{
            throw new Error('Argumento Inválido');
        }
    }
}

function mdc(a, b){
    if(
        true
    ){
    }else{

        throw new Error('Argumento Inválido');
    }
}

function mdc2(a, n){
    if(
        true
    ){
    }else{

        throw new Error('Argumento Inválido');
    }
}

function horner(/*x, g, ag, ag-1, ..., a0*/){
    if(
        true
    ){
    }else{

        throw new Error('Argumento Inválido');
    }
}

function fibonacci(n){
    if(
        true
    ){
    }else{

        throw new Error('Argumento Inválido');
    }
}

function cpf(d){
    if(
        true
    ){
    }else{

        throw new Error('Argumento Inválido');
    }
}

function cpf2(d){
    if(        
        true
    ){
    }else{

        throw new Error('Argumento Inválido');
    }
}