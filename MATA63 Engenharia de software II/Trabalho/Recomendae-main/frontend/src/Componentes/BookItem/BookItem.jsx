import { Nota0, Nota1, Nota2, Nota3, Nota4, Nota5 } from "./Nota";

import "./BookItem.css";

// O BookItem recebe todos seus elementos como props
function BookItem({ulrImg, titulo, avaliacao, autor, editora}){
  
  // Controle de quantas estrelas são exibidas
  function nota(valor){
    switch (valor) {
      case '1':
        return <Nota1 />;
      case '2':
        return <Nota2 />;
      case '3':
        return <Nota3 />;
      case '4':
        return <Nota4 />;
      case '5':
        return <Nota5 />;
      default:
        return <Nota0 />;
    }
  } 
    
 return(
  <div class="book-item">
    <img src={ulrImg ? ulrImg : "https://png.pngtree.com/png-vector/20190507/ourmid/pngtree-vector-question-mark-icon-png-image_1024598.jpg"} alt="Capa do Livro" />
    <div class="title">{titulo ? titulo : "Livro sem título"}</div>
    {nota(avaliacao)}
    <div>{autor ? autor : "Autor desconhecido"}/{editora ? editora : "Sem editora"}</div>
 </div>)
}

export default BookItem