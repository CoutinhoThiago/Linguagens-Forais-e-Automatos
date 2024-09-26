mensagem :-
    write('Informe um número inteiro e positivo: '),
    read(N),
    validar(N).

validar(N) :-
    N >= 0,
    fatorial(N, F),
    write('O Fatorial de '), write(N), write(' é: '), write(F), nl.

fatorial(0, 1).
fatorial(N, F) :-
    N > 0,
    N1 is N - 1,
    fatorial(N1, F1),
    F is N * F1.
