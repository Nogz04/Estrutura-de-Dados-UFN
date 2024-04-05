#include <iostream>
#include <vector>
#include <cstdlib>
#include <ctime>
#include "Lista.hpp"

using namespace std;

int main() {
    srand(time(NULL));

    int n, m;

    cout << "Digite o numero de listas: ";
    cin >> n;

    cout << "Digite o tamanho das listas: ";
    cin >> m;

    vector<Lista*> listaGenerica(n, nullptr);

    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < m; ++j) {
            listaGenerica[i] = inserir(rand() % 10, listaGenerica[i]);
        }
    }

    for (int i = 0; i < n; ++i) {
        cout << "\nLista " << i + 1 << ": ";
        exibir(listaGenerica[i]);
        cout << endl;
    }

    mostrarNumerosNListas(listaGenerica);
    mostrarNumerosUnicos(listaGenerica);

    for (auto lista : listaGenerica) {
        free(lista);
    }

    return 0;
}
