#include <iostream>
using namespace std;

int main() {
  // 2 Esmeraldas do Caos
  // 20 Anéis
  // 1 Estrela
  int esmeraldas = 0;
  cin >> esmeraldas;
  ;
  int aneis = 0;
  cin >> aneis;
  int estrelas = 0;
  cin >> estrelas;

  if (esmeraldas == 6) {
    cout << "Final Verdadeiro" << endl;
  } else {
    cout << 6 - esmeraldas << " " << 60 - aneis << " " << 3 - estrelas << endl;
  }
}