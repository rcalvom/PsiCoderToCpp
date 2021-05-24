#include <iostream>
#include <string>

using namespace std;

struct Test {
	int a;
	bool b;
	double c;
	char d;
	string e;
};

int SinParametros() {
	cout << "funcion sin parametros" << "\n";
	return 0;
}

int UnParametro(int a) {
	cout << "funcion con un parametro" << "\n";
	return a;
}

int DosParametros(int a, int b) {
	cout << "funcion con dos parametros" << "\n";
	return a + b;
}

int main(){
	cout << "Hola Mundo" << "\n";
	bool flag;
	cin >> flag;
	int a;
	if (flag){
		a = 2;
	} else {
		a = 1;
	}
	switch (a){
		case 1:
			cout << "El valor de a es 1" << "\n";
			break;
		case 2:
			cout << "El valor de a es 2" << "\n";
			break;
		default : 
			cout << "El valor de a no es ni 1 ni 2" << "\n";
	}
	int i = 5;
	while (i > 0){
		cout << "El valor de i es " << i << "\n";
		i = i - 1;
	}
	int j = 5;
	do {
		cout << "El valor de j es " << j << "\n";
		j = j - 1;
	} while (i > 0);
	for (int k = 0; k < 10; k += 1) {
		cout << "El valor de k es " << k << "\n";
	}
	SinParametros();
	int par = UnParametro(5);
	cout << par << "\n";
	char c1 = '\n';
	string c2 = "\n";
	return 0;
}

struct Test_Inaccesible {
	int a;
	bool b;
	double c;
	char d;
	string e;
};

int Inaccesible(int a, int b) {
	cout << "funcion inaccesible" << "\n";
	return a + b;
}

