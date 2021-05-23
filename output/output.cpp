#include <iostream>
#include <string>

using namespace std;

struct Fecha {
	int dd;
	int mm;
	int aa;
};

struct Estudiante {
	string cedula;
	string nombre;
	int edad;
	double definitiva;
	Fecha fingreso;
};

int main(){
	Estudiante estudiante;
	int opcion;
	do {
		opcion = menu();
		switch (opcion){
			case 1:
				estudiante = capturar(estudiante);
				break;
			case 2:
				mostrar(estudiante);
				break;
			case 3:
				break;
			default : 
				cout << "Digite una opcion entre 1 y 3 ";
				break;
		}
	} while (opcion != 3);
	return 0;
}

int menu() {
	int opcion;
	cout << "menu de estructuras ";
	cout << "1  Capturar el registro ";
	cout << " 2 Imprimir el registro ";
	cout << " 3  Salir ";
	cout << " digite su opcion entre 1 y 3  ";
	cin >> opcion;
	return opcion;
}

Estudiante capturar(Estudiante estudiante) {
	int i;
	double def = 0.0;
	cout << "digite la cedula del estudiante  ";
	cin >> estudiante.cedula;
	cout << "digite el nombre del estudiante ";
	cin >> estudiante.nombre;
	for ( i = 0; i < 3; i += 1) {
		cout << "digite la nota " << i + 1 << " del estudiante";
		cin >> estudiante.nota;
		def = def + estudiante.nota;
	}
	cout << "digite la edad del estudiante ";
	cin >> estudiante.edad;
	estudiante.definitiva = def / 3;
	cout << "digite el dia de ingreso a la Universidad ";
	cin >> estudiante.fingreso.dd;
	cout << "digite el mes de ingreso a la Universidad  ";
	cin >> estudiante.fingreso.mm;
	cout << "digite el ako de ingreso a la Universidad  ";
	cin >> estudiante.fingreso.aa;
	return estudiante;
}

int mostrar(Estudiante estudiante) {
	int i;
	cout << "";
	cout << "Cedula  " << estudiante.cedula;
	cout << "Nombre  " << estudiante.nombre << "";
	for ( i = 0; i < 3; i += 1) {
		cout << "Nota " << estudiante.nota << " ";
	}
	cout << "Edad  " << estudiante.edad;
	cout << "Definitiva  " << estudiante.definitiva;
	cout << "Fecha de Ingreso ddmmaaaa  " << estudiante.fingreso.dd << estudiante.fingreso.mm << estudiante.fingreso.aa;
	return i;
}

