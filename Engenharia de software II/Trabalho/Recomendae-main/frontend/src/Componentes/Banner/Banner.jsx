import './Banner.css'

function Banner(){
  

  
  return (
    <div class="banner">
      <div class="news">
        <div class="news-item active">
          <img src="caminho-da-imagem-da-noticia" alt="Imagem da Notícia" />
          <h2>Título da Notícia</h2>
          <p>Conteúdo da Notícia</p>
        </div>
        <div class="news-item">
          <img src="caminho-da-imagem-da-noticia" alt="Imagem da Notícia" />
          <h2>Título da Notícia</h2>
          <p>Conteúdo da Notícia</p>
        </div>
        <div class="news-item">
          <img src="caminho-da-imagem-da-noticia" alt="Imagem da Notícia" />
          <h2>Título da Notícia</h2>
          <p>Conteúdo da Notícia</p>
        </div>
        <div class="news-item">
          <img src="caminho-da-imagem-da-noticia" alt="Imagem da Notícia" />
          <h2>Título da Notícia</h2>
          <p>Conteúdo da Notícia</p>
        </div>
        <div class="news-item">
          <img src="caminho-da-imagem-da-noticia" alt="Imagem da Notícia" />
          <h2>Título da Notícia</h2>
          <p>Conteúdo da Notícia</p>
        </div>
        <div class="news-indicator">
          <span class="current">•</span>
          <span class="other">•</span>
          <span class="other">•</span>
          <span class="other">•</span>
          <span class="other">•</span>
        </div>
        <button class="arrow arrow-left">&lt;</button>
        <button class="arrow arrow-right">&gt;</button>
      </div>
    </div>
  )
}

export default Banner

// // Variáveis para controlar o banner de notícias
// let currentNewsIndex = 0;
// const newsItems = document.querySelectorAll('.news-item');
// const newsIndicator = document.querySelector('.news-indicator');
// const arrowLeft = document.querySelector('.arrow-left');
// const arrowRight = document.querySelector('.arrow-right');

// // Função para mostrar a próxima notícia
// function showNextNews() {
//   newsItems[currentNewsIndex].classList.remove('active');
//   currentNewsIndex = (currentNewsIndex + 1) % newsItems.length;
//   newsItems[currentNewsIndex].classList.add('active');
//   updateNewsIndicator();
// }

// // Função para mostrar a notícia anterior
// function showPreviousNews() {
//   newsItems[currentNewsIndex].classList.remove('active');
//   currentNewsIndex = (currentNewsIndex - 1 + newsItems.length) % newsItems.length;
//   newsItems[currentNewsIndex].classList.add('active');
//   updateNewsIndicator();
// }

// // Função para atualizar o indicador de notícias
// function updateNewsIndicator() {
//   newsIndicator.textContent = '.'.repeat(currentNewsIndex) + ' ' + '.'.repeat(newsItems.length - currentNewsIndex - 1);
// }

// // Função para avançar para a próxima notícia automaticamente a cada 5 segundos
// function autoNextNews() {
//   setInterval(showNextNews, 5000);
// }

// // Event listeners para as setas do banner de notícias
// arrowLeft.addEventListener('click', showPreviousNews);
// arrowRight.addEventListener('click', showNextNews);

// // Inicialização do banner de notícias
// if (newsItems.length > 0) {
//   updateNewsIndicator();
//   newsItems[currentNewsIndex].classList.add('active');

//   // Chamada da função para iniciar a rotação automática das notícias
//   autoNextNews();
// }