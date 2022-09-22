// const allbuttons = document.querySelectorAll("button");
// for(let button of allbuttons)
// {
//     button.addEventListener("click", function(){
//         console.log(this.textContent);
//     })
// }

// allbuttons.forEach(function(button){
//     button.addEventListener("click", function(){
//         console.log(this);
//     })
// })

//                  Current target

// const allbuttons = document.querySelectorAll("button");
// allbuttons.forEach(function(button){
//     button.addEventListener("click", function(e){
//         console.log(e.currentTarget.textContent);
//     })
// })

//                Practise

const allbuttons = document.querySelectorAll("button");
allbuttons.forEach(function(button){
    button.addEventListener("click", function(e){
        e.target.style.backgroundColor = "black";
        e.target.style.color = "Red";
    })
})