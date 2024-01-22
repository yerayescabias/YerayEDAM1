#include <stdio.h>

// Función para encontrar el máximo común divisor (MCD)
int findGCD(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

int main() {
    int num1, num2;
    int lcm, gcd;

    // Solicitar al usuario que ingrese dos números
    printf("Ingresa dos números enteros positivos: ");
    scanf("%d %d", &num1, &num2);

    if (num1 > 0 && num2 > 0) {
        // Calcular el MCD de los números
        gcd = findGCD(num1, num2);

        // Calcular el MCM usando la fórmula MCM(a, b) = (a * b) / MCD(a, b)
        lcm = (num1 * num2) / gcd;

        // Mostrar el resultado
        printf("El MCM de %d y %d es %d\n", num1, num2, lcm);
    } else {
        printf("Por favor, ingresa enteros positivos.\n");
    }

    return 0;
}
