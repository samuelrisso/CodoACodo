var nombre = prompt("Ingrese nombre del alumno");
var nota1 = parseFloat(prompt("Ingrese primera nota"));
var nota2 = parseFloat(prompt("Ingrese segunda nota"));
var nota3 = parseFloat(prompt("Ingrese tercera nota"));

var promedio = (nota1 + nota2 + nota3) / 3;

alert("El promedio de " + nombre + " es: " + promedio);