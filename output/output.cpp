#include <iostream>
#include <string>

using namespace std;

int sumar(int a, int b) {
	cout << "a plus b";
}

struct Carro {
	string placa, marca;
	int puertas, sillas;
	bool automatico;
	char color;
};

int restar(int a, int b) {
	cout << "a minus b";
}

int main(){
	cout << "Hello world";
	Carro carro;
	carro.automatico = false;
	return 0;
}

int sumar(int a, int b) {
	cout << "a plus b";
}

int restar(int a, int b) {
	cout << "a minus b";
}

int multiplicar(int a, int b) {
	cout << "a times b";
}

