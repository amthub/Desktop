console.log("hello");
const body = document.body;
const button = document.querySelector("button");
const changecolor = () => {
   
    const red = Math.floor(Math.random()*126);
    const green = Math.floor(Math.random()*126);
    const blue = Math.floor(Math.random()*126);
    const changeColor = `rgb(${red}, ${green}, ${blue})`;
   
    return changeColor;
}

button.addEventListener("click", () => {
    const color = changecolor();
    body.style.backgroundColor = color;
    button.innerText = color;
});



