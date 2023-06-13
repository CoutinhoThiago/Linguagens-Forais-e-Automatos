% Base de dados - Exercício 11
% Fatos
localizado_em(salvador, bahia).
localizado_em(bahia, brasil).
localizado_em(brasil, america).
localizado_em(maceio, brasil).
localizado_em(roma, italia).
nasceu_em(joao, salvador).
nasceu_em(maria, maceio).
nasceu_em(giuseppe, roma).

% Regra para determinar se uma pessoa nasceu em um local utilizando recursão
nasceu_em_recursao(Pessoa, Local) :-
    nasceu_em(Pessoa, Local).

nasceu_em_recursao(Pessoa, Local) :-
    localizado_em(LocalX, Local),
    nasceu_em_recursao(Pessoa, LocalX).

exemplo_nasceu_em_recursao_lista(Lista) :-
    setof(Pessoa, nasceu_em_recursao(Pessoa, _), Lista).


% exemplo_nasceu_em_recursao_lista(Lista).
% Lista = [joao, maria, giuseppe].