// Entrar e criar conta

// Seleciona os elementos relevantes
const loginButton = document.querySelector('.login');
const createAccountButton = document.querySelector('.create-account');
const loginScreen = document.querySelector('.login-screen');
const createAccountScreen = document.querySelector('.create-account-screen');
const loginCloseButton = document.getElementById('login-close-button');
const createAccountCloseButton = document.getElementById('create-account-close-button');

// Adiciona um ouvinte de evento de clique ao botão de login
loginButton.addEventListener('click', showLoginScreen);

// Adiciona um ouvinte de evento de clique ao botão de criar conta
createAccountButton.addEventListener('click', showCreateAccountScreen);

// Função para exibir a tela de login
function showLoginScreen() {
  // Exibe a tela de login sobre a tela inicial
  loginScreen.style.display = 'flex';
}

// Função para exibir a tela de criar conta
function showCreateAccountScreen() {
  // Exibe a tela de criar conta sobre a tela inicial
  createAccountScreen.style.display = 'flex';
}

// Fecha a tela de login ao clicar no botão "x"
loginCloseButton.addEventListener('click', function() {
  loginScreen.style.display = 'none';
});

// Fecha a tela de cadastro ao clicar no botão "x"
createAccountCloseButton.addEventListener('click', function() {
  createAccountScreen.style.display = 'none';
});

document.querySelector('form').addEventListener('submit', function(event) {
  var password = document.getElementById('password').value;
  var confirmPassword = document.getElementById('confirm-password').value;
  var passwordError = document.getElementById('password-error');
  var email = document.getElementById('email').value;
  var name = document.getElementById('name').value;
  var emailError = document.getElementById('email-error');
  var nameError = document.getElementById('name-error');

  // Verifica se as senhas são iguais
  if (password !== confirmPassword) {
    passwordError.style.display = 'block';
    event.preventDefault(); // Impede o envio do formulário se as senhas não forem iguais
  } else {
    passwordError.style.display = 'none';
  }

  // Verifica se algum campo está em branco
  if (password === '' || confirmPassword === '' || email === '' || name === '') {
    event.preventDefault();
    alert('Por favor, preencha todos os campos.');
    return;
  }

  // Verifica se o campo de email é válido
  var emailRegex = /^\S+@\S+\.\S+$/;
  if (!emailRegex.test(email)) {
    event.preventDefault();
    emailError.style.display = 'block';
  } else {
    emailError.style.display = 'none';
  }

  // Verifica se o campo de nome tem mais de 5 caracteres
  if (name.length <= 5) {
    event.preventDefault();
    nameError.style.display = 'block';
  } else {
    nameError.style.display = 'none';
  }
});
 