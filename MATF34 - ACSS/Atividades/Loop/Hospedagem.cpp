#include <iostream>
using namespace std;

int main() {
  int max;
  cin >> max;
  int quartos = 0;
  while (true) {
    string entrada;
    cin >> entrada;

    if (entrada == "FIM") {
      break;
    } else {
      if (entrada == "Casal") {
        quartos += 2;
      } else if (entrada == "Triplo") {
        quartos += 3;
      } else if (entrada == "Quadruplo") {
        quartos += 4;
      } else if (entrada == "Familia") {
        quartos += 5;
      }
    }
  }
  if (quartos <= max) {
    cout << "Pode reservar! Esses quartos cabem todos.";
  } else {
    cout << "Procure outra pousada.";
  }
}