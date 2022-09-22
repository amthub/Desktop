const loading = document.querySelector(".loading");
const loadingtext = document.querySelector(".loading-text");
const bg = document.querySelector('.bg');

let load = 0;

let interval = setInterval(blur, 200);
function blur()
{
    load++;
    
    if(load>99)
    {
        clearInterval(interval)
    }
    loadingtext.innerText = load;
    let b = (100-load)/2;
    let c = (100-load)/100;
    
    bg.style.filter = `blur(${b}px)`;
    loading.style.opacity = c;
}