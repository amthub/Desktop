const card = document.getElementById("ab");
const p = document.querySelector(".p");
const btn = document.querySelector(".btn");
const cv = document.querySelector(".cv");
const cvc = document.querySelector(".cvc");
const mm = document.querySelector(".mm");
const yy = document.querySelector(".yy");
const dy = document.querySelector(".dy");
const num = document.querySelector(".num");
const numb = document.querySelector(".numb");
const third = document.querySelector(".third");


btn.addEventListener('click', (e) =>
{
   dy.innerText = ` ${mm.value}/${yy.value}`;
   p.innerText = card.value;
   cvc.innerText = cv.value;
   num.innerText = numb.value;
   // if(mm.value==="")
   // {
   //    const li = document.createElement('p');
   //    li.innerText = 'Empty';
   //    third.append(li);

   // }
})



