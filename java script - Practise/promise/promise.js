//              promise  // then wla kaam browser krega
//        microtask queue priority > callback queue
//  const bucket = ['rice', 'vegetable', 'sugar',]; 
//   then hamesa promise return krega

// const mypromise = new Promise((resolve, reject) => {
//     if(bucket.includes("salt") && bucket.includes("vegetables") && bucket.includes("rice"))
//     {
//         resolve("fried rice");
//     }
//     else{
//         reject("couldn't do it");
//     }
// })

//            consume  //    ek call back function bhi likh skte h 

// mypromise.then((food) => {
//     console.log("let's eat", food);  //   pehla call back tab chlega jab promise resolve hga 
// },
// (error) => {
//     console.log(error);   // dusra tab chlega jab promise reject
// })


// mypromise.then((food) => {
//     console.log("lets eat", food);
// }).catch((error) =>
//     {
//        console.log(error);
//     }
// )

//               function returning a promise

// function mypromise(){
//     const bucket = ['rice', 'vegetable', 'sugar', 'salt']; 
//     return new Promise((resolve, reject) => {
//         if(bucket.includes("rice") && bucket.includes("salt"))
//         {
//             resolve("fried rice");
//         }
//         else{
//             reject("couldn't do it");
//         }
//     })
// }

// mypromise().then((food) => {
//     console.log("lets eat", food);
// }).catch((error) => {
//     console.log(error);
// })