const btn = document.querySelector(".btn");
const search = document.querySelector("input");
const dark = document.querySelector(".dark");
const light = document.querySelector(".light");
const navbar = document.querySelector(".nav-bar");
const display = document.querySelector(".contain-modes");
const mode = document.querySelector(".mode");
const body = document.body;
btn.addEventListener("click", () => 
{
    search.classList.toggle("hide");
    btn.classList.toggle("bg");
})
dark.addEventListener("click", () => {
   body.style.backgroundColor = "black";
   navbar.style.backgroundColor = "black";
})
light.addEventListener("click", () => {
   body.style.backgroundColor = "white";
   navbar.style.backgroundColor = "blue";
})
display.addEventListener("click", () => {
    mode.classList.toggle("mode");
})