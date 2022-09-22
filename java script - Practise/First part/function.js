
//                      function 

//                     Example of function

// function sumoftwonum(num1, num2){
//     return num1 + num2;
// }
// const sum = sumoftwonum(4, 6);
// console.log(sum);


// function checkeven(num)    // functon declaration
// {
//    if(num%2==0)
//    {
//     console.log("true");
//    }
//    else{
//       console.log("false");
//    }
//   return num%2 === 0;
// }
// const num = prompt("Enter a number");
// const result = checkeven(num);
// console.log(result);


// find a number in array using function

// const findtarget = function (arr, target)     // Function expression
// {
//     for(let i=0; i<arr.length; i++)
//     {
//         if(arr[i]===target)
//         {
//             return i;
//         }
//     }
//     return -1;
// }

// const myarr = [23, 34 , 53 , 78];
// const index = findtarget(myarr, 54);
// console.log(index);


//                  Array functtion       =>

// const iseven = (num) => {
//     return num%2==0;
// }
// console.log(iseven(13));

// if return in one line and one number
// const iseven = number => number % 2 ===0;
// console.log(iseven(12));

// const firstchar = anystring => anystring[0];
// console.log(firstchar("rahul"));



//                     hoisting     // only for declaration type fuction

// hello();

// function hello()
// {
//     console.log("hello world");
// }

//                           function inside function

// function app()
// {
//     const myfun= function()
//     {
//         console.log("my function");
//     }
//     const add = (num1, num2) => num1 + num2;
//     const mul = (num1, num2) => num1*num2;
//     console.log("inside app");
//     myfun();
//     console.log(mul(3, 5));
//     console.log(add(3, 5));
// }
// app();


//               lexical scope

// function myapp()
// {
//     const myvar = "value1";
//     function myfunct(){
//        const myvar = 34;
//         console.log("value of my var", myvar);
//     }
//     console.log("inside me");
//     myfunct();
// }
// myapp();

//               rest parameters

// function alladd(...numbers)
// {
//   let total = 0;
//  for(let number of numbers)
//  {
//       total = total + number;
//  }
//  return total;
// }
// console.log(alladd(1, 2, 3,4));
 
//                          paramater destructuring

// const person = {
//     firstname:"harshit",
//     age: 22,
//     gender: " male",
// }

// function printdetails({firstname, age})                                       //function printdetails(obj)
// {
//     // console.log(obj.firstname);
//     // console.log(obj.gender);
//     console.log(firstname);
//     console.log(age);
// }
// printdetails(person);


//                  call back function

// function myfunct2(){
//     console.log("function 2");
// }
// function myfunct(a)
// {
//     a();
// }
// myfunct(myfunct2);







