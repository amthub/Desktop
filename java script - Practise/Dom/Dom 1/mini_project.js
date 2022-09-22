const submit = document.querySelector(".form-todo");
const todoinput = document.querySelector(".form-todo input[type='text']"); 
const ul = document.querySelector(".todo-list");
submit.addEventListener("submit", (e) =>
{
     e.preventDefault();      //it stops to default refresh the page
     const newtodoText = todoinput.value;
     const newLi = document.createElement("li");
     const newliText = `<span class="text">${newtodoText}</span>
     <div class="button">
     <button class="todo-btn add">Add</button>
     <button class="todo-btn remove">remove</button>
     </div>`;
     newLi.innerHTML = newliText;
     ul.append(newLi);
     todoinput.value = "";
})

//                 event delegation

ul.addEventListener("click", (e) => {
    if(e.target.classList.contains("add"))
    {
       const linethrough = e.target.parentNode.previousElementSibling;
       linethrough.style.textDecoration = "line-through";
    }
    if(e.target.classList.contains("remove"))
    {
       const removeline = e.target.parentNode.parentNode;
       removeline.remove();
    }
})