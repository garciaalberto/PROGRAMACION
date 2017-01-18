//Ejercicio FIZZBUZZ propuesto por el libro "Eloquent JavaScript"
//Autor: Alberto García
counter = 0
number = 1
while (counter<100){
  if (number%3==0 && number%5==0){
    console.log("FizzBuzz");
  }
  else if (number%3==0){
    console.log("Fizz");
  }
  else if (number%5==0){
    console.log("Buzz");
  }
  else (console.log(number));
  counter++;
  number++;
}