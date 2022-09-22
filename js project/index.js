const submit = document.querySelector(".form-search");
const todoinput = document.querySelector(".input input[type='text']");
const ul = document.querySelector(".todo");
//      <button class="btns add">add</button>   line no 14
submit.addEventListener("submit", (e) =>
{
    e.preventDefault();
    const todoinputText = todoinput.value;
    console.log(todoinputText);
    const newLi = document.createElement("li");
    const newtodo = `<span class="todo-list">${todoinputText}</span>
                   
    <div class="action-buttons">
    <input type="time" class="btns">
        <button class="btns remove">remove</button>
    </div>`;
    newLi.innerHTML =newtodo;
    ul.append(newLi);
    todoinput.value="";
})

ul.addEventListener("click", (e) =>
{
    if(e.target.classList.contains("add"))
    {
        const add = e.target.parentNode.previousElementSibling;
        add.style.textDecoration = "line-through";
    }
    if(e.target.classList.contains("remove"))
    {
        const remove = e.target.parentNode.parentNode;
        remove.remove();
    }
})