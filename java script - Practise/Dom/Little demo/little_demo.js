// const mainbutton = document.querySelector("button");
// const body = document.body;
// const h1 = document.querySelector(".h1");

// function randomColorGenerator(){
//     const red = Math.floor(Math.random()*256);
//     const green = Math.floor(Math.random()*256);
//     const blue = Math.floor(Math.random()*256);
//     const randomColor = `rgb(${red}, ${green}, ${blue})`;
//     return randomColor;
// }
// mainbutton.addEventListener("click", function(){
//     const randomColor = randomColorGenerator();
//     console.log(randomColor);
//     body.style.backgroundColor = randomColor;
//     h1.textContent = randomColor;
// })





const body = document.body;
const button = document.querySelector("button");
const Currentcolor = document.querySelector(".current-color");

function randomColorGenerator()
{
    const red = Math.floor(Math.random()*256);
    const green = Math.floor(Math.random()*256);
    const blue = Math.floor(Math.random()*256);
    const randomColor = `rgb(${red}, ${green}, ${blue})`;
    return randomColor;
}

button.addEventListener("click", function(){
    const randomColor = randomColorGenerator();
    body.style.backgroundColor = randomColor;
    Currentcolor.textContent = randomColor;
})
















