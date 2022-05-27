function reservaVoo(lugar) {
    var resposta;
    var lugar = document.getElementById("campoSelecionado").value;
    try {    
        var assento = document.getElementById( "v" + lugar).innerHTML;
        console.log(lugar)
        console.log(assento);

        if(assento>0) {
            document.getElementById("v" + lugar).innerHTML = --assento;

            resposta = "Reserva para o voo " + lugar + " confirmada!"
            
        } else {
        resposta = "Não é possível reservar para o voo " + lugar;
        }
    } catch(e) {
        resposta = "Opção incorreta. Por favor, escolha uma opção válida!"
    }
    console.log(resposta)

    document.getElementById("msg").innerHTML= resposta;
    document.getElementById("msg").style.backgroundColor = '#eeeeee';
    document.getElementById("msg").style.padding = '10';
}

function limpar(){
   document.getElementById("msg").innerHTML=null;
   document.getElementById("msg").style.backgroundColor = null;
   document.getElementById("msg").style.padding = null;
}