//                   Object

// refrence type
// object don't have index 

//const person = {name:"amit", age:18};
/*  const about = {
         name: "amit",
         age: 18,
         hobbies: ["cricket", "signing", "sleeping"]
}
console.log(about);
console.log(about.hobbies);

//                add
about.gender = "Male";
console.log(about);

console.log(about["name"]);
console.log(about["profession"]="student");
console.log(about);                         

const key = "email";                      //use bracket notation
about[key] = "sdhdh@gmail.com";
console.log(about);                      */

//              for in
/*
const about = {
    name: "amit",
    age: 18,
    hobbies: ["cricket", "signing", "sleeping"]
}
 for( let key in about)
 {
    console.log(key);
 }
 for(let key in about)
 {
    console.log(about[key]);
 }
 for(let key in about)
 {
    console.log(`${key}: ${about[key]}`);
 }
//or
for(let key in about)
{
    console.log(key,":", about[key]);
}                                               
const person = {
    name: "harshit",
    age:22,
    hoobies:["cricket", "singing"]
}
console.log(person);
console.log(Object.keys(person));                 */

//                     computrd properties
/*
const key1 = "objectkey1";
const key2 = "objectkey2";

const value1 = "myvalue1";
const value2= "myvalue2";

const obj = {
    [key1] : value1,
    [key2] : value2,
}
console.log(obj);                           */ 

//                             spread opearator in object

/*const arr1 = [1, 2, 3];
const arr2 = [4, 5, 6];

//const newarr = [...arr1, ...arr2, 7];

//const newarr = ["abc"];    //one element

const newarr = [..."abc"];     // three different element
console.log(newarr);                       */

/*const obj1 = {
    key1 : "value1",
    key2 : "value2",
}
const obj2 ={
    key1 : "uniquevalue",
    key3 : "value3",
}

const newarr ={...obj1, ...obj2};
console.log(newarr);
const newarr1 = {...obj2, ...obj1};
console.log(newarr1);                       */

/* const newobj = {..."abc"};
console.log(newobj);

const newobj1 = {...["item1", "item2"]};
console.log(newobj1);              */

//                 object destructuring

// const band = {
//     bandname: "led zepplin",
//     famoussong: "stairway to heaven",
//     year: 1987,
//     member: 10,
// }

// const {bandname: name, famoussong, ...otherelement} = band;
// console.log(name," ", famoussong);
// console.log(otherelement);


//                         object inside array 

// const users = [
//     {userId: 1, firstname:"harshit", gender:"male"},
//     {userId: 2, firstname:"mohit", gender:"female"},
//     {userId: 3, firstname: "manisi", gender: "female"},
// ]
// console.log(users);
// for(let user of users)
// {
//     console.log(user);
//     console.log(user.firstname);
// }

// //                       nested destructing

// const [user1, user2, user3] = users;
// console.log(user1);

// const employee = [
//     {userid: 1, name: "harshit"},
//     {userid: 2, name:"rahul"},
//     {userid:3, name:"karan"},
// ]
// console.log(employee);
// const [user1, user2, user3] = employee;
// console.log(user3);
// const [{name}, , {userid:id}] = employee;
// console.log(name);
// console.log(id);
