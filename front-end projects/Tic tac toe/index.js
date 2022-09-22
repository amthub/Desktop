console.log("Hello");
// const player1 = prompt("Your name");
// const player2 = prompt("Your name");
let playerName;
let music = new Audio("nudge.ogg");
let turn = "X";
let info = document.getElementsByClassName("info")[0];
const reset = document.querySelector(".btn");
let gameover = false;

//   change turn fumction
 const changeturn = () => {
    return turn === "X" ? "0" : "X";
 }

 
 let print = document.querySelector(".info");
//  check win
const checkwin = () =>
{
    let boxtext = document.getElementsByClassName("boxtext");
    let wins = [
        [0,1,2],
        [3,4,5],
        [6,7,8],
        [0,3,6],
        [1,4,7],
        [2,5,8],
        [0,4,8],
        [2,4,6],
    ]
    wins.forEach(e => {
        if((boxtext[e[0]].innerText === boxtext[e[1]].innerText) && (boxtext[e[2]].innerText === boxtext[e[1]].innerText) && (boxtext[e[0]].innerText !== ""))
        {
        print.innerText  = boxtext[e[0]].innerText + " win";
            gameover = true;
          
        }
    })
}

//    select all box
let boxes = document.getElementsByClassName("box");

Array.from(boxes).forEach(box => {
    
    var boxtext = box.querySelector('.boxtext');
    
    box.addEventListener('click', () => {
        if(boxtext.innerText === ''){
            boxtext.innerText = turn;
            turn = changeturn();
            music.play();
            checkwin();
            if(!gameover)
            {
                
                // document.getElementsByClassName("info")[0]
                info.innerText = "Turn for " + turn;
            }
        }
    })
    reset.addEventListener("click", () => {
        boxtext.innerText ="";
        turn = "X";
        info.innerText = "Turn for " + turn;
        
    })
})

