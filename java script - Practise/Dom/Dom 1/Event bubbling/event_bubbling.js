//             Event bubbling     
// agar parent aur child pe same event apply h toh child pe click krne se dono call ho jayenge 

const grandparent = document.querySelector(".grandparent");
const parent = document.querySelector(".parent");
const child = document.querySelector(".child");

//    capture starts

// child.addEventListener("click", () => {
//     console.log("capure child");
// },true);
// parent.addEventListener("click", () => {
//     console.log("capture parent");
// },true);
// grandparent.addEventListener("click", () => {
//     console.log("capture grandparent");
// },true);
// document.body.addEventListener("click", () => {
//     console.log("capture body");
// },true);

//   bubbling  starts 

// child.addEventListener("click", () => {
//     console.log("bubble  child");
// })
// parent.addEventListener("click", () => {
//     console.log("bubble parent");
// })
// grandparent.addEventListener("click", () => {
//     console.log("bubble grandparents");
// })
// document.body.addEventListener("click", () => {
//     console.log("bubble body");
// })

//   event delegation 

grandparent.addEventListener("click", () => {
    console.log("you clicked me ");
})