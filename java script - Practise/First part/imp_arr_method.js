//            Important method of array

// const numbers = [2, 4, 8, 23];

// function multiplyby2(number, index)
// {
//     console.log("Index of a number is =", index);
//     console.log(number*2);
// }
// multiplyby2(numbers[2], 2);

//                         forEach  pass number and index of each element
// const numbers = [4, 5 , 67, 4];
// numbers.forEach(function(number, index){
//     console.log(`The number is ${number} and index is ${index}`);
// })

// const users = [
//     {firstname:"harshit", age:22},
//     {firstname:"amit", age:22},
// ]
// users.forEach(function(user)
//     {
//         console.log(user.firstname);
//     })


//                                    Map

// const numbers = [2, 5, 7,9];
// const square = function(number)
// {
//     return number*number;
// }
// const squarenumber = numbers.map(square);
// console.log(squarenumber);

// const users = [
//     {firstname: "harshit", age:22},
//     {firstname: "rahul", age:20},
//     {firstname: "karan", age:10},
// ]

// users.map(({firstname, age}) =>{
// console.log(firstname);

// })


//                filtermethod

// const numbers = [1,2,3,4,5,6,7];
// const iseven = function(number)
// {
//     return number % 2 === 0;
// }

// //const evenarr = numbers.filter(iseven);
// console.log(numbers.filter(iseven));

//                        reduce method

// const numbers = [1, 2,93, 4, 7, 8];
// const sum = numbers.reduce((a,b) =>  a+b)
// console.log(sum);

// const cart = [
//     {productid: 1, product: "smartphone", price: 12000},
//     {productid: 2, product: "tv", price: 18000},
//     {productid: 3, product: "refrigerator", price: 21000},
// ]

// const totalprice = cart.reduce((totalmoney, product) =>
// {
//     return totalmoney + product.price;
// },0)
// console.log(totalprice);


//                               Sorting

// const numbers = [1, 56, 322, 78];
// numbers.sort();                             // deal as sting so doesnt give tight output
// console.log(numbers);

// const numbers = [1, 33, 332, 53, 7, 567];
// const ascendingorder = numbers.sort((a,b) => a-b);
// const descendingorder = numbers.sort((a,b) => b-a);
// console.log(ascendingorder);
// console.log(descendingorder);

//                price low to high 

// const products = [
//     {userid: 1, products: "tv", price: 32000},
//     {userid: 2, products: "smartphone", price: 15000},
//     {userid: 3, products: "refrigerator", price: 21000},
// ]
//  low to high
//  const lowtohigh = products.sort((product1, product2) => product1.price-product2.price);
//  console.log(lowtohigh);

//                    find method

// const myarray = ["dog", "cat", "monkey", "donkey"];

// function islength3(string)
// {
//     return string.length ===3;
// }

// const animal = myarray.find(islength3);
// console.log(animal);

// const animal = myarray.find((string) => string.length ===3);
// console.log(animal);

// const users = [
//     {userid: 1, firstanem: "Amit"},
//     {userid: 2, firstanem: "aman"},
//     {userid: 3, firstanem: "rahul"},
//     {userid: 4, firstanem: "harshit"},
// ]
// function findid(user)
// {
//     return user.userid === 3;
// }
// const employee = users.find(findid);
// console.log(employee);

//                    Every method

// const number = [ 2, 4, 6, 8];
// const ans = number.every((a) => a%2===0);
// console.log(ans);

// const user = [ 
//     { userid : 1, price: 12000},
//     { userid : 2, price: 13000},
//     { userid : 3, price: 14000},
// ]

// // every item less than 20000 true or false

// const ans = user.every((cartitem) => cartitem.price < 20000);
// console.log(ans);


//                  some method

// const numbers = [3,4,5,7];
// const ans = numbers.some((number)=> number%2);
// console.log(ans);

//                 fill :- value, start , end

// const numbers = new Array(10).fill(2);
// console.log(numbers);

// const numbers = [2,4,5,6,3,4,5];
// const newarray = numbers.fill(-1,2,5);
// console.log(newarray);

//       splice method     start,insert, delete
// const numbers = [2,4,5,6,3,4,5];
// numbers.splice(2, 3, 0, 0, 0);
// console.log(numbers);


//                  Set

// const numbers = new Set(["item1", "item2"]);
// numbers.add(1);
// numbers.add(2);           // you can not repeat same 
// numbers.add(3);           
// numbers.add(4);            
// numbers.add(5);            

// for(let number of numbers)
// {
//     console.log(number);
// }

// if we want unique element using set

// const myarray1 = [1,2,4,5,4,3,2,1,5];
// const unique = new Set(myarray1);
// console.log(unique);

// //           length of unique
// for(let number of unique)
// {
//     length++;
// }
// console.log(length);


//                           Map
// kisi bhi type ki key rkh skte h ex array string const etc
// const person = new Map();
// person.set("firstname", "harshit");
// person.set("age", 22);
// person.set(1, "one");
// console.log(person);
// console.log(person.get("age"));
// console.log(person.keys());

// for(let key of person.keys())
// {
//     console.log(key);
// }