% Base de dados
% fatos
progenitor(maria, jose).
progenitor(joao, jose).
progenitor(joao, ana).
progenitor(jose, julia).
progenitor(jose, iris).
progenitor(iris, jorge).

% Regra para consultar todos os avós sem usar recursividade
avos(Avo, Neto) :-
    progenitor(Avo, Pai),
    progenitor(Pai, Neto).

% Regra para consultar todos os ancestrais utilizando recursividade
ancestrais(Anc, Desc) :-
    progenitor(Anc, Desc).
ancestrais(Anc, Desc) :-
    progenitor(Anc, Pai),
    ancestrais(Pai, Desc).

% Regra para consultar todos os descendentes utilizando recursividade
descendentes(Desc, Anc) :-
    progenitor(Anc, Desc).
descendentes(Desc, Anc) :-
    progenitor(Anc, Filho),
    descendentes(Desc, Filho).




% Exemplos de chamadas

% Exemplo de chamada para a função avos:
% avos(Avo, Neto)
% 
% Exemplo de chamada para a função ancestrais:
% ancestrais(Ancestral, Descendente)

% Exemplo de chamada para a função descendentes:
% descendentes(Descendente, Ancestral)



