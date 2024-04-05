#ifndef LISTA_HPP
#define LISTA_HPP

#include <iostream>
#include <unordered_set>

typedef struct Nodo {
    int dado;
    struct Nodo* prox;
} Lista;

using std::cout;

void exibir(Lista* lista); // Função para exibir o conteúdo da lista
int count(Lista* lista); // Função para contar os elementos da lista
bool contains(int valor, Lista* lista); // Função para verificar se um valor está na lista
Lista* inserir(int valor, Lista* lista); // Função para inserir um valor na lista
void mostrarNumerosNListas(const std::vector<Lista*>& listas); // Função para mostrar os números que aparecem em todas as listas
void mostrarNumerosUnicos(const std::vector<Lista*>& listas); // Função para mostrar os números únicos em uma única lista

void exibir(Lista* lista) { // Implementação da função exibir
    cout << "[ ";
    for (Lista* p = lista; p != nullptr; p = p->prox) {
        cout << p->dado << " ";
    }
    cout << "]";
}

int count(Lista* lista) { // Implementação da função count
    int total = 0;
    for (Lista* p = lista; p != nullptr; p = p->prox) {
        total++;
    }
    return total;
}

bool contains(int valor, Lista* lista) { // Implementação da função contains
    for (Lista* p = lista; p != nullptr; p = p->prox) {
        if (valor == p->dado) return true;
    }
    return false;
}

Lista* inserir(int valor, Lista* lista) { // Implementação da função inserir
    Lista* novo = (Lista*)malloc(sizeof(Lista));
    novo->dado = valor;
    novo->prox = nullptr;

    if (!lista) return novo;

    Lista* p = lista;
    Lista* pR = nullptr;

    while (p) {
        if (valor == p->dado) {
            free(novo);
            return lista;
        }
        if (valor < p->dado) break;
        pR = p;
        p = p->prox;
    }

    if (!pR) {
        novo->prox = lista;
        return novo;
    }

    pR->prox = novo;
    novo->prox = p;
    return lista;
}

void mostrarNumerosNListas(const std::vector<Lista*>& listas) { // Implementação da função para mostrar os números que aparecem em todas as listas
    std::unordered_set<int> numeros;
    for (auto lista : listas) {
        Lista* p = lista;
        while (p) {
            numeros.insert(p->dado);
            p = p->prox;
        }
    }

    cout << "\nNúmeros que aparecem em todas as listas:\n";
    for (auto numero : numeros) {
        bool emTodasListas = true;
        for (auto lista : listas) {
            if (!contains(numero, lista)) {
                emTodasListas = false;
                break;
            }
        }
        if (emTodasListas) {
            cout << numero << " ";
        }
    }
    cout << std::endl;
}

void mostrarNumerosUnicos(const std::vector<Lista*>& listas) { // Implementação da função para mostrar os números únicos em uma única lista
    std::unordered_set<int> numeros;
    std::unordered_set<int> duplicados;

    for (auto lista : listas) {
        Lista* p = lista;
        while (p) {
            if (numeros.find(p->dado) == numeros.end()) {
                numeros.insert(p->dado);
            } else {
                duplicados.insert(p->dado);
            }
            p = p->prox;
        }
    }

    cout << "\nNúmeros que aparecem somente em uma das listas:\n";
    for (auto numero : numeros) {
        if (duplicados.find(numero) == duplicados.end()) {
            cout << numero << " ";
        }
    }
    cout << std::endl;
}

#endif // LISTA_HPP
