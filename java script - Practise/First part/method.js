//                    method
// function inside obj
// this === window

// const person = {
//     firstname: "harshit",
//     age: 22,
//     about: function()
//     {
//         console.log(`my name is ${this.firstname} and my age is ${this.age}`);
//     }
// }
// person.about();


// function info()
// {
//     console.log(`My name is ${window.firstname} and age is ${this.age}`);
// }

// const person1 = {
//     firstname: "harshit",
//     age: 22,
//     about: info,
// }
// const person3 = {
//     firstname: "Karan",
//     age: 26,
//     about: info,
// }
// const person2 = {
//     firstname: "Rahul",
//     age: 12,
//     about: info,
// }

// person1.about();
// person2.about();
// person3.about();

//              call

// const person1 = {
//         firstname: "harshit",
//         age: 22,
//         about: function()
//         {
//             console.log(`my name is ${this.firstname} and age is ${this.age}`);
//         }
//     }
// const person2 = {
//         firstname: "Karan",
//         age: 26,
        
//     }
// // use about in person2
// person1.about.call(person2);        // here person2 is this


// aur bahar function bnake call ka use krke diresct call kr skte h
//  for ex about.call(user2);



// function createuser(firstname, lastname, email, age, address)

//                Example 1
// {
//     const user = {};
//     user.firstname = firstname;
//     user,lastname = lastname;
//     user.email =  email;
//     user.age = age;
//     user.address = address;
//     user.about = function()
//     {
//         return (`my name is ${this.firstname} and age is ${this.age}`);
//     }
//     user.is18 = function(){
//        return age>=18;
//     }
//     return user;
// }
// const user1 = createuser("harshit", "vanshit", "@gmail.com", 22, "kjhaw");
// console.log(user1);
// const agevalid = user1.is18();
// console.log(agevalid);
// const info = user1.about();
// console.log(info);

//          update Example 1
// bahar banane se about aur is18 save storage and work fast

// const usermethods = {
//     about: function(){
//         return (`my name is ${this.firstname} and age is ${this.age}`);
//     },
//     is18: function(){
//         return age>=18;
//     },
// }
// function createuser(firstname, lastname, email, age, address)
// {
//     const user = {};
//     user.firstname = firstname;
//     user,lastname = lastname;
//     user.email =  email;
//     user.age = age;
//     user.address = address;
//     user.about = usermethods.about;
//     user.is18 = usermethods.is18;
//     return user;
// }
// const user1 = createuser("Amit", "djds", 17, "sjhiuf", "uehie");
// console.log(user1);
// console.log(user1.about());

// object.create

// const obj1 = {
//     key1: "value1",
//     key2: "value2",
// }

// const obj2 = Object.create(obj1);   // now u ca access keys of obj1 but first keys are check in obj2
// console.log(obj2.key2);

//                    upadate Example 1 again

// const usermethod = {
//     about: function(){
//         return (`My name is ${this.firstname} and age is ${this.age}`);
//     },
//     is18: function(){
//         return age>=18;
//     }, 
//     sing: function(){
//         return "johnny johny yus PerformancePaintTiming";
//     }
// }
// function createuser(){
//     const user = Object.create(usermethod);
//     user.firstname=firstname;
//     user.lastname=lastname;
//     user.email= email;
//     user.age= age;
//     user.about= usermethod.about;
//     user.is18= usermethod.is18;
// }
// const user1 = createuser("harshit", "vanshit", "@gmail.com",)

//       protype :- free space :- called object i can add or remove anything using prototype

// function hello(){
//     console.log("hello world")
// }
// hello.prototype.abc = "abc";
// hello.prototype.xyz = "abc";
// hello.prototype.sing = function(){
//     return "lalalaa";
// }
// console.log(hello.prototype.sing());

//      again example 1 :- add prototype

// function createuser(firstname, age){
//         const user = Object.create(createuser.prototype);  // you can add "new" to replace this
//         user.firstname=firstname;
//         user.age= age;
//         return user;
//     }

// createuser.prototype.about = function(){
//     return `my name is ${this.firstname} and age is ${this.age}`;
// }
// createuser.prototype.is18 = function(){
//     return this.age>=18;
// }
// createuser.prototype.sing = function(){
//     return "lalalala";
// }
// const user1 = createuser("harshit", 22 );
// console.log(user1);
// console.log(user1.sing());
// console.log(user1.is18());

//                         new keyword


// function Createuser(firstname, age){
//         // const user = Object.create(createuser.prototype);  // you can add "new" to replace this
//         this.firstname=firstname;
//         this.age= age;
//         // return this automatically by new new keyword
//     }

// Createuser.prototype.about = function(){
//     return `my name is ${this.firstname} and age is ${this.age}`;
// }
// Createuser.prototype.is18 = function(){
//     return this.age>=18;
// }
// Createuser.prototype.sing = function(){
//     return "lalalala";
// }
// const user1 = new Createuser("harshit", 22 );
// console.log(user1);
// console.log(user1.sing());
// console.log(user1.is18());

// for(let key in user1)
// {
//     if(user1.hasOwnProperty(key))
//     {
//         console.log(key);
//     }
// }

