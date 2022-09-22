// class Createuser{
//        constructor(firstname, age){
//         this.firstname = firstname;
//         this.age = age;
//        }
//        about(){
//         return `My name is ${this.firstname} and age is ${this.age}`;
//        }
//        is18(){
//         return this.age>=18;
//        }
//        song(){
//         return "lalallaa";
//        }
// }

// const user1 = new Createuser("harshit", 22);
// console.log(user1);
// console.log(user1.about());
// console.log(user1.is18());
// console.log(user1.song());
// console.log(Object.getPrototypeOf(user1));


// class Animal{
//     constructor(name, age, eats){
//         this.name = name;
//         this.age = age;
//         this.eats = eats;
//     }
//     eat(){
//         return `${this.name} eats ${this.eats}`;
//     }
// }
// const animal1 = new Animal("monkey", 7, "banana");
// const animal2 = new Animal("dog", 2, "biscuit");
// console.log(animal1);
// console.log(animal1.eat());

// //        Extends

// // class Dog extends Animal{
    
// // }
// // const tommy = new Dog("cat", 1, "milk");
// // console.log(tommy.eat());

// class dog extends Animal{
//     constructor(name, age,eats, speed){
//         super(name,age, eats);
//         this.speed = 23; 
//     }
// }
// const tommy = new dog("cat", 2,"milk", 23);
// console.log(tommy);