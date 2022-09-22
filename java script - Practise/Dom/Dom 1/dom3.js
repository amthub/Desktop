// const section = document.querySelector(".section");
// console.log(section);

// console.log(document.getRootNode());
// const rootNode = document.getRootNode();
// const rootchilds = rootNode.childNodes;
// console.log(rootchilds);
// const htmlpage = rootNode.childNodes[1];
// console.log(htmlpage);
// const htmlelements = htmlpage.childNodes;
// console.log(htmlelements);


// const section = document.querySelector(".section");
// console.log(section);
// console.log(section.classList);                     // class list 
// const classList = section.classList;

// //              Add class and remove class  and contains
// section.classList.add("bg-dark");

// section.classList.remove("bg-dark");

// const contains = section.classList.contains("section");
// console.log(contains);

// //       toggle ----->   agar class hai toh remove kar dega wrna add kr dega 
// section.classList.toggle("bg-dark");
// section.classList.toggle("bg-dark");


// const header = document.querySelector(".header");
// console.log(header);
// console.log(header.classList);
// header.classList.toggle("bg-dark");

//        add new HTML elements  to page

// const todoList = document.querySelector(".todo-list");
// console.log(todoList);
// console.log(todoList.innerHTML);
// todoList.innerHTML = todoList.innerHTML + "<li> New todo </li>";
// todoList.innerHTML +=  "<li> teach Students </li>";                      // not use this things performance issue


// document.createElement()
// append    ------>             last me add krega
// prepend   ------->>           starting me addkrega
// remove

// const newtodoItem = document.createElement("li");
// const newtodoItemText = document.createTextNode("Teach Students");
// newtodoItem.append(newtodoItemText);
// const todoList = document.querySelector(".todo-list");
// todoList.append(newtodoItem);
// console.log(newtodoItem);

// const newtodoitem = document.createElement("li");
// newtodoitem.textContent = "teach students";
// const todolist = document.querySelector(".todo-list");
// todolist.append(newtodoitem);
// console.log(newtodoitem);

//           remove 
// const todo1 = document.querySelector(".todo-list li");
// todo1.remove();
// console.log(todo1);


//         before and after

// const newtodo = document.createElement("li");
// newtodo.textContent = "Teach students";
// const todolist = document.querySelector(".todo-list");
// todolist.before(newtodo);

// newtodo.textContent = "study";
// todolist.after(newtodo);


//                dimension 
const section = document.querySelector(".section");
const info = section.getBoundingClientRect();
console.log(info);