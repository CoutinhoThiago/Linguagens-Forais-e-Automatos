#include <iostream>
using namespace std;

int main() {
  string entrada;
  int v = 0;
  int d = 0;
  int e = 0;
  for (int i = 0; i < 12; i++) {
    cin >> entrada;

    if (entrada == "D") {
      d++;
    }
    if (entrada == "E") {
      e++;
    }
    if (entrada == "V") {
      v++;
    }
  }
  if (d > 0) {
    cout << "Saori nao foi salva." << endl;
  } else {
    if (e > 3) {
      cout << "Saori nao foi salva." << endl;
    } else {
      cout << "Saori foi salva! " << e << " cavaleiros ficaram pelo caminho."
           << endl;
    }
  }
}