% Base de dados - Exercício 12
% Fatos
animal(urso).
animal(peixe).
animal(peixinho).
animal(lince).
animal(raposa).
animal(coelho).
animal(veado).
animal(guaxinim).
planta(alga).
planta(grama).
come(urso, peixe).
come(lince, veado).
come(urso, raposa).
come(urso, veado).
come(peixe, peixinho).
come(peixinho, alga).
come(guaxinim, peixe).
come(raposa, coelho).
come(coelho, grama).
come(veado, grama).
come(urso, guaxinim).

% Regra recursiva para apresentar a cadeia alimentar de um animal
cadeia_alimentar(Animal, [Animal]) :-
    \+ come(Animal, _).

cadeia_alimentar(Animal, [Animal | CadeiaRestante]) :-
    come(Animal, Alimento),
    cadeia_alimentar(Alimento, CadeiaRestante).

exemplo_cadeia_alimentar_lista(Lista) :-
    setof(Cadeia, Animal^(animal(Animal), cadeia_alimentar(Animal, Cadeia)), Lista).




% exemplo_cadeia_alimentar_lista(Lista).
% Lista = [[guaxinim, peixe, peixinho, alga], [lince, veado, grama], [raposa, coelho, grama], [urso, peixe, peixinho, alga]].
