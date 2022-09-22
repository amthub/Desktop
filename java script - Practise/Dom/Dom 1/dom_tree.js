//                       Dom tree


// const rootNode = document.getRootNode();
// console.log(rootNode);
// console.log(rootNode.childNodes);
// const htmlchildNode = rootNode.childNodes[0];
// console.log(htmlchildNode);

// //           child node
// const htmlchildNodes = htmlchildNode.childNodes;
// console.log(htmlchildNodes);
// console.log(htmlchildNode.childNodes[0]);
// console.log(htmlchildNode.childNodes[1]);
// console.log(htmlchildNode.childNodes[2]);

// //         parent node
 
// console.log(htmlchildNode.parentNode);

//  //            sibling relation
// const headElementNode = htmlchildNode.childNodes[0];
// console.log(headElementNode);
// console.log(headElementNode.nextSibling);


// //               next Element Sibling    ----->  Ignore spaces
// console.log(headElementNode.nextElementSibling);

//
// const div =  document.getElementById("container");
// console.log(div);



// const h1 = document.querySelector("h1");
// console.log(h1);
// const h1sparent = h1.parentNode;
// console.log(h1sparent);

//     you can also direct select 
const head = document.head;
console.log(head);

const title = head.querySelector("title");
console.log(title);

// use children if u dont want teaxt in child ------>   children
const child = head.childNodes;
console.log(child);
const children = head.children;
console.log(children);


