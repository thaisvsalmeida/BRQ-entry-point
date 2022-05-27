function categoria() {
    var idade = parseInt(document.getElementById("campoIdade").value);

    if(idade<=4){
        var img = document.createElement("img"); 
        img.src = "./img/categoria_baby.jpg";  
        document.getElementById("img").appendChild(img).innerHTML;
        document.getElementById("msg").innerHTML= "Categoria Baby";
    }
    else if(idade>=5 && idade<=7){
        var img = document.createElement("img"); 
        img.src = "./img/categoria_a.jpg";  
        document.getElementById("img").appendChild(img).innerHTML;
        document.getElementById("msg").innerHTML= "Categoria Infantil A";
    }
    else if(idade>=8 && idade<=11){
        var img = document.createElement("img"); 
        img.src = "./img/categoria_b.jpg";  
        document.getElementById("img").appendChild(img).innerHTML;
        document.getElementById("msg").innerHTML= "Categoria Infantil B";
    }
    else if(idade>=12 && idade<=13){
        var img = document.createElement("img"); 
        img.src = "./img/categoria_juvenil_a.jpg";  
        document.getElementById("img").appendChild(img).innerHTML;
        document.getElementById("msg").innerHTML= "Categoria Juvenil A";
    }
    else if(idade>=14 && idade<=17){
        var img = document.createElement("img"); 
        img.src = "./img/categoria_juvenil_b.jpg";  
        document.getElementById("img").appendChild(img).innerHTML;
        document.getElementById("msg").innerHTML= "Categoria Juvenil B";
    }
    else if(idade>=18){
        var img = document.createElement("img"); 
        img.src = "./img/categoria_adulto.jpg";  
        document.getElementById("img").appendChild(img).innerHTML;
        document.getElementById("msg").innerHTML= "Categoria Adulto";
    }
}

function limpar() {
   document.getElementById("msg").innerHTML=null;
   document.getElementById("img").innerHTML=null;
}