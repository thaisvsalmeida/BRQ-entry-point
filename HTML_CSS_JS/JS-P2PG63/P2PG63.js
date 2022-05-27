function calcular() {
    var ANO = parseInt(document.getElementById("campoAno").value);
    var a = ANO % 19;
    var b = Math.floor(ANO / 100);
    var c = ANO % 100;
    var d = Math.floor(b / 4);
    var e = b % 4;
    var f = Math.floor((b + 8) / 25);
    var g = Math.floor((b - f + 1) / 3);
    var h = (19 * a + b - d - g + 15) % 30;
    var i = Math.floor(c / 4);
    var j = c % 4;
    var k = (32 + 2 * e + 2 * i - h - j) % 7;
    var L = Math.floor((a + 11 * h + 22 * k) / 451);
    var MES = Math.floor((h + k - 7 * L + 114) / 31);
    var DIA = ((h + k - 7 * L + 114) % 31) + 1;

    function mesNome() {
        switch(MES){
            case 1: return("Janeiro"); break;
            case 2: return("Fevereiro"); break;
            case 3: return("Março"); break;
            case 4: return("Abril"); break;
            case 5: return("Maio"); break;
            case 6: return("Junho"); break;
            case 7: return("Julho"); break;
            case 8: return("Agosto"); break;
            case 9: return("Setembro"); break;
            case 10: return("Outubro"); break;
            case 11: return("Novembro"); break;
            case 12: return("Dezembro"); break;
        }
    }
    document.getElementById("msg").innerHTML= 
    "No ano " + ANO + ", a Páscoa é no mês de " + mesNome() + ", dia " + DIA + ".";
}

function limpar() {
   document.getElementById("msg").innerHTML=null;
}
