
 /* console.log("helloworld");          // for print 

const m=2;

console.log(m);

const sum = 2*m;

console.log(sum);                       */

/*

let name = "Amit";
console.log(name);
console.log(name.length);

let firstname = "     Amit     "
console.log(firstname.length);
firstname = firstname.trim();
console.log(firstname);
console.log(firstname.length);

console.log(firstname.toUpperCase());
console.log(firstname.toLowerCase());

// slice method

let newname = firstname.slice(1,3);
console.log(newname);                         */

/* 
type of operator
data types


let name="harshit";
let age=22;
console.log(typeof name);
console.log(typeof age);

//                                convert string to number
let number="22";
console.log(typeof +number);

//                               OR
let num = "23";
num = Number(num);
console.log(typeof num);

//                               convert number to string
let mynum=22;
console.log(typeof mynum);
mynum=mynum + "";
console.log(typeof mynum)

//                                OR
let n = 22;
n = String(n);
console.log(typeof n);             */

//                                Add two string
/*
let string1 = "17"
let string2 = "10";
let string3 = string1 + string2;
console.log(string3);

let num1 = "17";
let num2 = "10";
let num3 = +num1 + +num2;
console.log(num3);                                                                                                */

/*                                               template string

let age=18;
let name = "harshit";

let aboutme = `My name is ${name} and my age is ${age}`;
console.log(aboutme);                                                                                                  */

 
/*                                          ternary operator

let age=15;
let drink = age>5 ? "coffee" : "milk";
console.log(drink);                                                                                                      */


/*                                        Nested if else                                                            

let winningnumber = 7;
let guessnumber = +prompt("Guess a number");
if(guessnumber == winningnumber){
    console.log("Your guess is right");
}
else{
    if(guessnumber > winningnumber)
    {
        console.log("too high");
    }
    else{
        console.log("too low");
    }
}                                                                */

//                    Array
/*
let fruit = ["apple", "mango", "orange"];
console.log(fruit);

//                    array push and pop

fruit.push("banana");        // Add one element in last
console.log(fruit);

let a = fruit.pop();         // Remove one element from the last
console.log(a);              // give you that element
console.log(fruit);

//                    shift and unshift

let b = fruit.shift();       // remove one element from the starting
console.log(b);
console.log(fruit);

fruit.unshift("papaya");
console.log(fruit);                                                  */

//                      cloning of array
/*
let array1 = ["item1", "item2"];

//let array2 = array1.slice(0);      //fastest
//let array2 = [].concat(array1);

//let array2 = [...array1]          // spread operator
//let onemorearray = [ "item6", "item7"];
//let array2 = [...array1, ...onemorearray];
//let array2 = array1.slice(0).concat(["item4", "item5"]);  // you can also use for spread
array1.push("item3");
console.log(array1===array2);
console.log(array1);
console.log(array2);             */


/*                      " for  of " loops

const item = ["item1", "item2"];
const item2 = [];
for(let i of item)
{
    item2.push(i.toUpperCase());
}
console.log(item2);                 */

//                  Array destructing

// const myvar =["value1", "value2", "value3", "value4"];
// let [myvar1 , myvar2, , myvar3] = myvar;               //you can also use spread operator
// console.log(myvar1);
// console.log(myvar2);
// console.log(myvar3);




