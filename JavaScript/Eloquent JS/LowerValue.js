// Ejercicio propuesto por el libro Eloquent JavaScript
// El ejercicio consiste en crear una función que devuelva el valor más pequeño en un conjunto de dos valores
// Autor: Alberto García
function min(num1, num2){
  if (num1 > num2)
    return num2;
  if (num2 > num1)
    return num1;
}

console.log(min(0, 10));
// → 0
console.log(min(0, -10));
// → -10
