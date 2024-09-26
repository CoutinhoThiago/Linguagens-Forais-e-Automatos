import './MenuLateral.css'

function MenuLateral(){
    return (<div class="menu">
    <ul>
      <li><a href="#">Página Inicial</a></li>
      <li><a href="#">Livros</a></li>
      <li><a href="#">Autores</a></li>
      <li><a href="#">Sobre</a></li>
      <li><a href="#">Contato</a></li>
    </ul>
    <aside>
      <span class="close-icon">x</span>
    </aside>
  </div>)
}

export default MenuLateral

// // Menu lateral

// // Seleciona o ícone do menu
// const menuIcon = document.querySelector('.menu-icon');
// // Seleciona o menu
// const menu = document.querySelector('.menu');

// // Adiciona um ouvinte de evento de clique ao ícone do menu
// menuIcon.addEventListener('click', toggleMenu);

// // Alterna a classe 'active' no menu ao clicar no ícone do menu
// function toggleMenu() {
//   menu.classList.toggle('active');
// }

// // Seleciona o ícone de fechar
// const closeIcon = document.querySelector('.close-icon');

// // Adiciona um ouvinte de evento de clique ao ícone de fechar
// closeIcon.addEventListener('click', closeMenu);

// // Função para fechar o menu
// function closeMenu() {
//   menu.classList.remove('active');
// }

// // Adiciona um ouvinte de evento de clique no documento inteiro
// document.addEventListener('click', function(event) {
//   var targetElement = event.target;

//   // Verifica se o clique foi fora da barra lateral ou do ícone do menu
//   if (!menu.contains(targetElement) && !menuIcon.contains(targetElement)) {
//     menu.classList.remove('active');
//   }
// });