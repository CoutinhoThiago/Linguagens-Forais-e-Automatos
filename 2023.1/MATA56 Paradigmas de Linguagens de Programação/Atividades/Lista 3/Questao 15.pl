% Base de dados - Exercício 10
% Fatos
progenitor(maria, jose).
progenitor(joao, jose).
progenitor(joao, ana).
progenitor(jose, julia).
progenitor(jose, iris).
progenitor(iris, jorge).

% Regra para consultar todos os avós sem usar recursividade
avos_sem_recursao(Avo, Pessoa) :-
    progenitor(Avo, Filho),
    progenitor(Filho, Pessoa).

% Regra para consultar todos os ancestrais utilizando recursividade
ancestrais(Ancestral, Pessoa) :-
    progenitor(Ancestral, Pessoa).

ancestrais(Ancestral, Pessoa) :-
    progenitor(Ancestral, Filho),
    ancestrais(Filho, Pessoa).

% Regra para consultar todos os descendentes utilizando recursividade
descendentes(Descendente, Pessoa) :-
    progenitor(Pessoa, Descendente).

descendentes(Descendente, Pessoa) :-
    progenitor(Pessoa, Filho),
    descendentes(Descendente, Filho).

exemplo_consultar_avos_sem_recursao(Lista) :-
    findall(Avo-Pessoa, avos_sem_recursao(Avo, Pessoa), Lista).



% exemplo_consultar_avos_sem_recursao(Lista).
% Lista = [maria-jose, joao-jose].

% descendentes(Descendente, joao).
% Descendente = jose ;
% Descendente = julia ;
% Descendente = iris ;
% Descendente = jorge.

% ancestrais(Ancestral, iris).
% Ancestral = jose ;
% Ancestral = maria ;
% Ancestral = joao.