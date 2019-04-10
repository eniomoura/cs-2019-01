//MÉTODOS ESSENCIAIS
var view = ''

function getView(){
    try{
        addToView(propriedade3025(3025))
        addToView(propriedade153(153))
        addToView(diaDaSemana(1,1,2000))
        addToView(mod(5, 3))
        addToView(somaNaturais(3))
        addToView(fatoriais(3))
        addToView(produto(3,3))
        addToView(potencia(3,3))
        addToView(pi(3))
        addToView(logaritmoNatural(3, 3))
        addToView(razaoAurea(3,3,3))
        addToView(quadradoPerfeito(3))
        addToView(raiz(9,3))
        addToView(primo(3))
        addToView(crivoErastotenes([1, 2, 3], 3))
        addToView(mdc(81, 54))
        addToView(mdc2([81, 54], 27))
        addToView(horner(3, 4, 5, 6, 7))
        addToView(fibonacci(3))
        addToView(cpf([9,3,0,9,1,9,8,5,0,8,3]))
        addToView(cpf2([9,3,0,9,1,9,8,5,0,8,3]))
    }catch(e){
        console.error(e);
    }
    return view
}

function addToView(value){
        view+='<br><br>'+value
}

//INÍCIO DOS EXERCÍCIOS
function propriedade3025(n){
    if(0<n&&n<9999){
        i=n/100
        j=n%100
        return (i+j)*(i+j)==n
    }else{
        throw new Error('Argumento Inválido');
    }
}

function propriedade153(cdu){
    if(100<=cdu&&cdu<=999){
        c=cdu/100
        du=cdu%100
        d=du/100
        d=du/10
        u=du%10
        return (c*c*c+d*d*d+u*u*u)==cdu
    }else{
        throw new Error('Argumento Inválido');
    }
}

function diaDaSemana(d, m, a){
    if(1<=d&&d<=31&&1<=m&&m<=12&&a>1753){
        if(m==1||m==2){
            m=m+12
        }else{
            a=a-1
        }
        s=d+2*m+3*(m+1)/5+a+a/100+a/400
        return s%7
    }else{
        throw new Error('Argumento Inválido');
    }
}

function mod(x, y){
    if(0<=y&&0<x){
        s=x
        while(y<=s){
            s=s-y
        }
        return s
    }else{
        throw new Error('Argumento Inválido');
    }
}

function somaNaturais(){

}