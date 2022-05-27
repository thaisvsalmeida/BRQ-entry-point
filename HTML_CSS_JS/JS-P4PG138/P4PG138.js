function calcular() {
    //Leitura dos campos informados pelo usuário para as variáveis
    var identificacao = document.getElementById("campoId").value;
    var horas = (document.getElementById("campoHoras").value);
    var salarioHora = (document.getElementById("campoSalario").value);
    //Transformar string com separação com "," para float com "."
    horas = parseFloat(horas.replace(/,/g, '.'));
    salarioHora = parseFloat(salarioHora.replace(/,/g, '.'));
    //Calcular o salário e fixar o número de casas decimais para 2
    var salario = (horas * salarioHora).toFixed(2);
    //Atribuir a uma nova variável o valor do salário, porém com "," e imprimir para o usuário
    var salarioNovo = salario.replace('.', ',');
    document.getElementById("msg").innerHTML="Olá, " + identificacao + "!" + "<br>" + 
    "O seu salário é de R$ " + salarioNovo + ". <br><br>" + "Confira a distribuição nas cédulas abaixo:";

    //Cálculo das cédulas
    var cont200 = 0;
    cont200 = cont200 + Math.floor(salario/200);
    document.getElementById("nota200").innerHTML=cont200;
    salario = salario % 200;
        
    var cont100 = 0;
    cont100 = cont100 + Math.floor(salario/100);
    document.getElementById("nota100").innerHTML=cont100;
    salario = salario % 100;

    var cont50 = 0;
    cont50 = cont50 + Math.floor(salario/50);
    document.getElementById("nota50").innerHTML=cont50;
    salario = salario % 50;

    var cont20 = 0;
    cont20 = cont20 + Math.floor(salario/20);
    document.getElementById("nota20").innerHTML=cont20;
    salario = salario % 20;

    var cont10 = 0;
    cont10 = cont10 + Math.floor(salario/10);
    document.getElementById("nota10").innerHTML=cont10;
    salario = salario % 10;

    var cont5 = 0;
    cont5 = cont5 + Math.floor(salario/5);
    document.getElementById("nota5").innerHTML=cont5;
    salario = salario % 5;

    var cont2 = 0;
    cont2 = cont2 + Math.floor(salario/2);
    document.getElementById("nota2").innerHTML=cont2;
    salario = salario % 2;

    var cont1 = 0;
    cont1 = cont1 + Math.floor(salario/1);
    document.getElementById("moeda1").innerHTML=cont1;
    salario = salario % 1;
}

function limpar() {
    document.getElementById("msg").innerHTML=null;
    document.getElementById("moeda1").innerHTML=null;
    document.getElementById("nota2").innerHTML=null;
    document.getElementById("nota5").innerHTML=null;
    document.getElementById("nota10").innerHTML=null;
    document.getElementById("nota20").innerHTML=null;
    document.getElementById("nota50").innerHTML=null;
    document.getElementById("nota100").innerHTML=null;
    document.getElementById("nota200").innerHTML=null;
}