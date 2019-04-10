//MÉTODOS ESSENCIAIS
var view = ''

function getView(){
    try{
        addToView(propriedade3025(3025))
        addToView(propriedade153())
        addToView(exercicio3())
        addToView(exercicio4())
        addToView(exercicio5())
        addToView(exercicio6())
        addToView(exercicio7())
        addToView(exercicio8())
        addToView(exercicio9())
        addToView(exercicio10())
        addToView(exercicio11())
        addToView(exercicio12())
        addToView(exercicio13())
        addToView(exercicio14())
        addToView(exercicio15())
        addToView(exercicio16())
        addToView(exercicio17())
        addToView(exercicio18())
        addToView(exercicio19())
        addToView(exercicio20())
        addToView(exercicio21())
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
        i=n/100;
        j=n%100;
        return (i+j)*(i+j)==n
    }else{
        throw new Error('Argumento Inválido');
    }
}

function propriedade153(cdu){
    if(100<=cdu&&cdu<=999){
        c=n/100;
        du=n%100;
        
    }
}