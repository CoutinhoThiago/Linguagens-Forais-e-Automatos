#include <iostream>
using namespace std;

int main() {
  string e1;
  cin >> e1;
  string e2;
  cin >> e2;
  string e3;
  cin >> e3;
  string e4;
  cin >> e4;

  if (e1 == e2) {
    cout << "Driblado" << endl;
    if (e3 == e4) {
      cout << "Gol" << endl;
    } else {
      cout << "...e o goleiro pega" << endl;
    }
  } else {
    cout << "Bloqueado" << endl;
  }
}