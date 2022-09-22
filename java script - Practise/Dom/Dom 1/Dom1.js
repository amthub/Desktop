// console.log(document);
// console.log(document.getElementById("header"));
// console.log(document.querySelector("#main-heading"));


//              textContext
// const mainheading = document.getElementById("main-heading");
// console.log(mainheading.textContent);
// mainheading.textContent = "Manage your work";
// console.log(mainheading.textContent);

//                inner text
// const mainheading = document.getElementById("main-heading");
// console.log(mainheading.textContent);
// console.log(mainheading.innerText);


//           chnage style

// const mainheading = document.getElementById("main-heading");
// console.log(mainheading.style);
// mainheading.style.color = "blue";
// mainheading.style.border = "2px solid red";


//           get give you attribute

// const link = document.getElementById("a");
// console.log(link.getAttribute(href));

//              set allows you to set attribute
// link.setAttribute = ("href", "www.google.com");
// console.log(link.getAttribute("href"));


//    loop

// const navItems = document.getElementsByTagName("a");
// console.log(navItems);

//            for loop
// for(let i=0; i< navItems.length;i++)
// {
    //     console.log(navItems[i]);
    //     const navItem =  navItems[i];
    //     navItem.style.color = "green";
    //     navItem.style.backgroundColor = "black";
// }

//               for of          for style
// for(let navItem of navItems)
// {
//     navItem.style.color = "red";
//     navItem.style.backgroundColor = "purple";
 // }
    
 //  We cant use foreach method to iterate through html Collection
 // but after change in array u can use
 

// const navItems = document.querySelectorAll("a");   // you can use for, for of , forEach
// console.log(navItems);
// for(let navItem of navItems)
//  {
//      navItem.style.color = "red";
//      navItem.style.backgroundColor = "purple";
//  }

//             for each

// navItems.forEach((navItem) =>
// {
//     navItem.style.color = "yellow";
// } )



//            inner Html

// const headline = document.querySelector(".headline");
// console.log(headline.innerHTML);
// headline.innerHTML = "<h2>Inner HTML </h2>"
// headline.innerHTML += "<button class=\"btn\"> Learn more </button>"
// console.log(headline.innerHTML);

