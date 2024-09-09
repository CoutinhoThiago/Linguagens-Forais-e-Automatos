#include <iostream>
using namespace std;

int main() {
  int x;
  cin >> x;

  if (x < 20) {
    cout << "reprovado" << endl;
  }
  else if (x >= 20 && x < 50) {
    cout << "genin" << endl;
  }
  else if (x >= 50 && x < 80) {
    cout << "chunin" << endl;
  }
  else {
    cout << "jounin" << endl;
  }
}