import BookItem from '../BookItem/BookItem';

import "./BooksSection.css";

function BookSection(){
    return(
    <div class="books-section">
        <div class="book-row">
        <BookItem titulo="Velozes e Furiosos" avaliacao='1' autor="Moroana Morais" editora="FTD" ulrImg="https://marketplace.canva.com/EAE4oJOnMh0/1/0/1003w/canva-capa-de-livro-de-suspense-O7z4yw4a5k8.jpg" />
        <BookItem titulo="Título2" avaliacao='2' autor="Autor12" editora="Editora31" ulrImg="https://marketplace.canva.com/EAE4oJOnMh0/1/0/1003w/canva-capa-de-livro-de-suspense-O7z4yw4a5k8.jpg" />
        <BookItem avaliacao='3' />
        <BookItem avaliacao='3' />
        <BookItem avaliacao='3' />
        </div>
        <div class="book-row">
        <BookItem titulo="Velozes e Furiosos" avaliacao='4' autor="Moroana Morais" editora="FTD" ulrImg="https://marketplace.canva.com/EAE4oJOnMh0/1/0/1003w/canva-capa-de-livro-de-suspense-O7z4yw4a5k8.jpg" />
        <BookItem titulo="Título2" avaliacao='5' autor="Autor12" editora="Editora31" ulrImg="https://marketplace.canva.com/EAE4oJOnMh0/1/0/1003w/canva-capa-de-livro-de-suspense-O7z4yw4a5k8.jpg" />
        <BookItem titulo="Título2" avaliacao='3' autor="Autor12" editora="Editora31" ulrImg="https://marketplace.canva.com/EAE4oJOnMh0/1/0/1003w/canva-capa-de-livro-de-suspense-O7z4yw4a5k8.jpg" />
        </div>
        <div class="book-row">
        <BookItem titulo="Velozes e Furiosos" avaliacao='3' autor="Moroana Morais" editora="FTD" ulrImg="https://marketplace.canva.com/EAE4oJOnMh0/1/0/1003w/canva-capa-de-livro-de-suspense-O7z4yw4a5k8.jpg" />
        <BookItem titulo="Título2" avaliacao='3' autor="Autor12" editora="Editora31" ulrImg="https://marketplace.canva.com/EAE4oJOnMh0/1/0/1003w/canva-capa-de-livro-de-suspense-O7z4yw4a5k8.jpg" />
        <BookItem titulo="Título2" avaliacao='3' autor="Autor12" editora="Editora31" ulrImg="https://marketplace.canva.com/EAE4oJOnMh0/1/0/1003w/canva-capa-de-livro-de-suspense-O7z4yw4a5k8.jpg" />
        </div>
    </div>
   )
}

export default BookSection