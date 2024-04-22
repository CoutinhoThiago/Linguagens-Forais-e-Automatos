% Base de dados
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

% Regra para apresentar a cadeia alimentar de um determinado animal
cadeia_alimentar(Animal, Cadeia) :-
    animal(Animal),
    cadeia_alimentar_recursiva(Animal, [Animal], Cadeia).

cadeia_alimentar_recursiva(Animal, _, [Animal]) :-
    \+ come(Animal, _).

cadeia_alimentar_recursiva(Animal, Visitados, [Animal | CadeiaRestante]) :-
    come(Animal, ProximaPresa),
    \+ member(ProximaPresa, Visitados),
    cadeia_alimentar_recursiva(ProximaPresa, [ProximaPresa | Visitados], CadeiaRestante).


% cadeia_alimentar(urso, Cadeia).
% Cadeia = [urso, peixe, peixinho, alga].

% cadeia_alimentar(lince, Cadeia).
% Cadeia = [lince, veado, grama].

%  cadeia_alimentar(coelho, Cadeia).
% Cadeia = [coelho, grama].

%  cadeia_alimentar(guaxinim, Cadeia).
% Cadeia = [guaxinim, peixe, peixinho, alga].

%  cadeia_alimentar(peixe, Cadeia).
% Cadeia = [peixe, peixinho, alga].

% cadeia_alimentar(grama, Cadeia).
% Cadeia = [grama].






