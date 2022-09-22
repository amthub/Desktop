
let list = document.querySelector(".list");
let button = document.querySelector(".form");
let title = document.querySelector(".title1 input[type='text']");
let author = document.querySelector(".title2 input[type='text']");
let isbn = document.querySelector(".title3 input[type='text']");


button.addEventListener('submit', (e) => {
    e.preventDefault();
    const li1 = document.createElement("li");
    const li2 = document.createElement("li");
    const li3 = document.createElement("li");
    li1.innerText = title.value;
    li2.innerText = author.value;
    li3.innerText = isbn.value;
    const ul = document.createElement("ul");
    ul.append(li1);
    ul.append(li2);
    ul.append(li3);
    console.log(ul);
    list.append(ul);
    ul.classList.toggle("grid")
    console.log(list);
    title.value='';
    author.value='';
    isbn.value='';
})