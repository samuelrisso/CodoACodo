function evaluarEdad(edad){
    if (edad >= 18) {
        alert("Es Mayor de edad");
    }else{
        alert("Es menor de edad")
    }
}
function mayorEdad(){
    var mayorEdad = 0;
    var bandera = false;
    var edad = 0;
    for (let i = 0; i < 3; i++) {
        edad = parseFloat(prompt(i+1 +": "+"Ingrese edad"));


        if (bandera === false) {
            mayorEdad = edad;
            bandera = true;
            console.log("Edad primer if" + mayorEdad);
            console.log(bandera);
        }

        if (edad > mayorEdad && bandera === true) {
            mayorEdad = edad;
            console.log("Edad segundo if" + mayorEdad);
        }
            
        }
        return mayorEdad;
}
var edadUsuario = prompt("Ingrese edad");
evaluarEdad(edadUsuario);
alert("la edad mas alta es: " +mayorEdad());