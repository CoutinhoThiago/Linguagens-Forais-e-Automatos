document.querySelectorAll('.btn').forEach((botao) => {
    document.getElementById(botao.id).addEventListener('click', () => {

        console.log(botao.value);
        votacao(botao);
    });
});

let num1 = document.getElementById('num1');
let num2 = document.getElementById('num2');

let somaNumeros = document.getElementById('somaNumeros');
let somaConfirma = document.getElementById('somaConfirma');

let nomeTitulo = document.getElementById('nomeTitle');
let nomeJogador = document.getElementById('nomeJogador');
let pais = document.getElementById('paisJogador');
let foto = document.getElementById('fotoJogador');

document.getElementById('btnConfirma').addEventListener('click', confirma);
document.getElementById('btnCorrige').addEventListener('click', corrige);
document.getElementById('btnBranco').addEventListener('click', votoBranco);



function mostraJogador() {
    if(num1.value == '0' && num2.value == '7') {
        nomeTitulo.innerText = jogador.richarlison.nome;
        nomeJogador.innerHTML = 'Nome: <b>' + jogador.richarlison.nomeCompleto + '</b>';
        pais.innerHTML = 'Pais: <b>' + jogador.richarlison.pais+ '</b>';
        foto.style.backgroundImage = jogador.richarlison.foto;
        legenda.style.display = 'flex';
    }
    else if(num1.value == '1' && num2.value == '0') {
        nomeTitulo.innerText = jogador.neymar.nome;
        nomeJogador.innerHTML = 'Nome: <b>' + jogador.neymar.nomeCompleto + '</b>';
        pais.innerHTML = 'Pais: <b>' + jogador.neymar.pais + '</b>';
        foto.style.backgroundImage = jogador.neymar.foto;
        legenda.style.display = 'flex';
    }
    else if(num1.value == '0' && num2.value == '3') {
        nomeTitulo.innerText = jogador.thiago.nome;
        nomeJogador.innerHTML = 'Nome: <b>' + jogador.thiago.nomeCompleto + '</b>';
        pais.innerHTML = 'Pais: <b>' + jogador.thiago.pais + '</b>';
        foto.style.backgroundImage = jogador.thiago.foto;
        legenda.style.display = 'flex';
    }
    else if(num1.value == '2' && num2.value == '3') {
        nomeTitulo.innerText = jogador.filipe.nome;
        nomeJogador.innerHTML = 'Nome: <b>' + jogador.filipe.nomeCompleto + '</b>';
        pais.innerHTML = 'Pais: <b>' + jogador.filipe.pais + '</b>';
        foto.style.backgroundImage = jogador.filipe.foto;
        legenda.style.display = 'flex';
    }
    else if(num1.value == '1' && num2.value == '3') {
        nomeTitulo.innerText = jogador.daniel.nome;
        nomeJogador.innerHTML = 'Nome: <b>' + jogador.daniel.nomeCompleto + '</b>';
        pais.innerHTML = 'Pais: <b>' + jogador.daniel.pais + '</b>';
        foto.style.backgroundImage = jogador.daniel.foto;
        legenda.style.display = 'flex';
    }
    else if(num1.value == '0' && num2.value == '4') {
        nomeTitulo.innerText = jogador.nikola.nome;
        nomeJogador.innerHTML = 'Nome: <b>' + jogador.nikola.nomeCompleto + '</b>';
        pais.innerHTML = 'Pais: <b>' + jogador.nikola.pais + '</b>';
        foto.style.backgroundImage = jogador.nikola.foto;
        legenda.style.display = 'flex';
    }
    else if(num1.value == '2' && num2.value == '5') {
        nomeTitulo.innerText = jogador.kim.nome;
        nomeJogador.innerHTML = 'Nome: <b>' + jogador.kim.nomeCompleto + '</b>';
        pais.innerHTML = 'Pais: <b>' + jogador.kim.pais + '</b>';
        foto.style.backgroundImage = jogador.kim.foto;
        legenda.style.display = 'flex';
    }
    else if(num1.value == '0' && num2.value == '0') {votoBranco();}
    else {votoInvalido()}
}

function votacao(botao) {
    if (!num1.value) {
        num1.innerHTML = botao.value;
        num1.value = botao.value;
        somaNumeros.play();
        return
    }
    else if (!num2.value) {
        num2.innerHTML = botao.value;
        num2.value = botao.value;
        somaNumeros.play();
        mostraJogador();
    }
}
function confirma() {
    if (document.getElementById('fim').style.display == 'flex') {

        corrige();
        console.log('caiu aqui')
    } 
    else {
        if (num1.value != null && num2.value != null) {
            document.getElementById('fim').style.display = 'flex';
            somaConfirma.play()
        } 
    }
}
function corrige() {
    nomeTitulo.innerText = 'Jogador';
    nomeJogador.innerText = 'Nome:';
    pais.innerText = 'Pais:';
    num1.innerText = '';
    num2.innerText = '';
    num1.value = null;
    num2.value = null;
    somaNumeros.play();
    foto.style.backgroundImage = "url('./images/pessoa.jpg')";
    legenda.style.display = 'none';
    document.getElementById('fim').style.display = 'none';
}
function votoBranco() {
    nomeTitulo.innerText = jogador.branco.nome;
    nomeJogador.innerText = '';
    pais.innerText = '';
    num1.innerText = '0';
    num2.innerText = '0';
    num1.value = '0';
    num2.value = '0';
    somaNumeros.play();
    foto.style.backgroundImage = jogador.branco.foto;
    legenda.style.display = 'none';
}
function votoInvalido() {
    nomeTitulo.innerText = jogador.invalido.nome;
    nomeJogador.innerText = '';
    pais.innerText = '';
    num1.value = null;
    num2.value = null;
    somaNumeros.play();
    foto.style.backgroundImage = jogador.invalido.foto;;
    legenda.style.display = 'none';
}

let jogador = {
    richarlison: {
        nome: 'Richarlison',
        nomeCompleto: 'Richarlison',
        pais: 'Brasil',
        foto: "url('./images/richarlison.jpg')",
    },
    neymar: {
        nome: 'Neymar',
        nomeCompleto: 'Neymar Jr',
        pais: 'Brasil',
        foto: "url('./images/neymar.jpg')",
    },
    thiago: {
        nome: 'Thiago',
        nomeCompleto: 'Thiago Silva',
        pais: 'Brasil',
        foto: "url('./images/thiago.jpg')",
    },
    filipe: {
        nome: 'Filipe Coutinho',
        nomeCompleto: 'Filipe Coutinho',
        pais: 'Brasil',
        foto: "url('./images/filipe.jpg')",
    },
    daniel: {
        nome: 'Daniel',
        nomeCompleto: 'Daniel Alves',
        pais: 'Brasil',
        foto: "url('./images/daniel.jpg')",
    },

    nikola: {
        nome: 'Nikola',
        nomeCompleto: 'Nikola Milenković',
        pais: 'Servia',
        foto: "url('./images/nikola.jpg')",
    },

    kim: {
        nome: 'kim',
        nomeCompleto: 'Kim Seung-Gyu',
        pais: 'Coréia',
        foto: "url('./images/kim.jpg')",
    },

    

    branco: {
        nome: 'Voto em branco',
        foto: "url('./images/pessoa.jpg')",
    },
    invalido: {
        nome: 'Voto invalido',
        foto: "url('./images/pessoa.jpg')",
    },
}