% Base de dados
% fatos
localizado_em(salvador, bahia).
localizado_em(bahia, brasil).
localizado_em(brasil, america).
localizado_em(maceio, brasil).
localizado_em(roma, italia).
nasceu_em(joao, salvador).
nasceu_em(maria, maceio).
nasceu_em(giuseppe, roma).

% Regra para determinar se uma pessoa nasceu em um local usando recursão
nasceu_em_recursao(X, Y) :-
    nasceu_em(X, Y).
    
nasceu_em_recursao(X, Y) :-
    localizado_em(Z, Y),
    nasceu_em_recursao(X, Z).

% Exemplos de chamadas
% nasceu_em_recursao(joao, salvador)
% nasceu_em_recursao(joao, bahia)
% nasceu_em_recursao(joao, brasil)
