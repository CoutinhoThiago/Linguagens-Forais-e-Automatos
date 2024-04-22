% Base de dados
% Fatos
progenitor(maria, jose).
progenitor(joao, jose).
progenitor(joao, ana).
progenitor(jose, julia).
progenitor(jose, iris).
progenitor(iris, jorge).

% Regra para listar todos os filhos de uma pessoa a partir de uma entrada interativa
listar_filhos :-
    write('Digite o nome da pessoa: '),
    read(Pessoa),
    findall(Filho, progenitor(Pessoa, Filho), Filhos),
    write('Os filhos de '), write(Pessoa), write(' sao: '), write(Filhos).

% Regra para listar os pais de uma pessoa a partir de uma entrada interativa
listar_pais :-
    write('Digite o nome da pessoa: '),
    read(Pessoa),
    findall(Pai, progenitor(Pai, Pessoa), Pais),
    write('Os pais de '), write(Pessoa), write(' sao: '), write(Pais).
