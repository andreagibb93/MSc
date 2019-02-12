// using switch statements in JS,
//the same as saying if, else. if, else

var name = "bill";
var val = 0;

switch (val) {
    case 0:
        console.log("you have nothing");
        break;
    case 1:
        console.log("you have a single item");
        break;
    case 2:
        console.log("you have a couple of items");
        break;

    default:
        console.log("invalid value")

}

// using arrays

var myList = [1, 2, 3, 4, "hello", ["hi", "hey"]];
//array inside an array
//to access this
console.log(myList[5][1]);
// index posistion starts at 0
//output "hey"

var myNewList = [1, 2, 3, 4, 5];

// for loop
for (var i = 0; i < myNewList.length; i++) {
    console.log(myNewList[i]);
}

// while loop, must meet a condition
var i = 0;
while (i < myNewList.length) {
    console.log(myNewList[i]);
    i++;

}

// guessing game
alert("you have 10 guesses, guess 1-10");

var answer = 3;
var guess = prompt("whats your guess?");

for (i = 0; i < 10; i++) {
    if (answer == guess) {
        alert("you guessed correctly")
        break;
    } else {
        guess = prompt("please try again");
    }
}
// functions
var name = "scott";

//defines firstFunc function
function firstFunc() {
  console.log("yo yo");
  var name = "bill";
  console.log ("name is function " + name)

}
//runs firstFunc
firstFunc();
console.log(name);

// using arguments in functions
var name = "andi";

function secondFunc(num1, num2) {
  return num1 + num2;
}
console.log(secondFunc(3,2));
