//             Events
const btn = document.querySelector(".btn-headline");
btn.addEventListener("click", function(){
    console.log("youclick me !!!");
    console.log("value of this");
    console.log(this);     // arrow functon ke cse me this ki value window hgi
})

