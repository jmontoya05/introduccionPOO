# Ejercicios Introducción a POO

En estos ejercicios vamos a practicar sobre UML, creación de clases en java, constructores,
métodos y encapsulamiento.

1. Crear una clase llamada Persona con los atributos: nombre, edad e identificación.
Crear constructores: vacío y con todos los atributos.
Crea métodos getters/setters.
Generar diagrama UML.
Métodos adicionales:
● mostrar(): Muestra los datos de la persona.
● esMayorDeEdad(): Devuelve un booleano indicando si es mayor de edad,
validar edad mayor o igual a 18.

![Descripción de la imagen]([https://picsum.photos/800/600](https://viewer.diagrams.net/?tags=%7B%7D&highlight=0000ff&edit=_blank&layers=1&nav=1&title=Introducci%C3%B3n%20POO#R7Zhdb9owFIZ%2FDdJ2wRQnkLLLAl27jk5sdOu1SUxi4fikjvnqr99x4hACRaXVgBskJOzXx07OOY%2B%2F0vB6yfJW0TR%2BgJCJhuuEy4bXb7gucbwW%2FhllVSgt1wqR4qE1qoQRf2FlT6vOeMiymqEGEJqndTEAKVmgaxpVChZ1swmI%2BlNTGrEdYRRQsas%2B8VDHhdpxryr9jvEoLp9M%2FK9FS0JLY%2BtJFtMQFhuSd9PwegpAF6Vk2WPCBK%2BMy9P31ZMYTP3b%2B1%2FZM%2F3T%2FfH482%2BzGOzbe7qsXVBM6g8P%2Fdghd8%2Bj%2B2HTeZm5c65TNZe2izOnYmbjNWQqA0mty3pVxjFb8ERQibXuBKQe2RaCdSp4JLEc4OsxhcKcKc0xBde2QUOKahBzEQ7oCmbGiUzTYFrWujEo%2FoLDUmHHxGalLU2uX7MYmZ4oO6gqlqHNsIwM2ZIe6LJmOKCZtkIAQtA04%2BO1GwlVEZdd0BoSa7SIuWajlAbGZoETxLyITsqXtMFDb9lyi7Y3UkXW%2FODEY5AwrVbYz47StmmxU46UBC4qgL1yfsUb8LrEtxPHTppoPXQFBhYsG%2B%2FghOxw0nDRfUdCMlaoXGN5pBWXUcP1hcnoWGEp0usobaCE0dJ5ihVMWQ8EIDN9CQVbXIgtqcRLsIneC1eGScKnD3KbfqtSftvwGAmw70TkczjmYcikAQM01bSgwKQ8BS51Hr52F38Y5Z7zpd1o44v3sE6qOv6MudI9kOgL5XnGGSK2YAaz%2F0LP%2Flm7S4%2FFxfUPpOVYsLT2wMJCGhaomFBdqDgpFW33zFS091CBxwOp%2BQSTF3CQ9aXkgsgpEbnqnBkR9xVEthAQPE9tgUB5oCMfyn%2BCmRSsSvij4aHfJDtQeLtQeK8AIOiYiSFkXOcc91VhuwXGW7mvw81lzBTXR0w6cVqHZb1zpKR7e9YFexD99PmyDJx2GSDk3FvF1RtIlNtDefzEyNozRXHGyOtro%2FoGc8Hp1Dh5595WOntwSsDESeEKczl0nA8P%2F8D952h4kD2XW58mJgZynJk%2Flj3QFag%2Bu8EVxmxKxTUX8yZrvPjPM8jvvzSYRgpmMmwGBSHFxQdPB%2BYjR7eyXN%2BTc4sxgGBmzGJ89Kh4xOUufRY6vx766eX9dGK1%2BniYt218gvVu%2FgE%3D)https://viewer.diagrams.net/?tags=%7B%7D&highlight=0000ff&edit=_blank&layers=1&nav=1&title=Introducci%C3%B3n%20POO#R7Zhdb9owFIZ%2FDdJ2wRQnkLLLAl27jk5sdOu1SUxi4fikjvnqr99x4hACRaXVgBskJOzXx07OOY%2B%2F0vB6yfJW0TR%2BgJCJhuuEy4bXb7gucbwW%2FhllVSgt1wqR4qE1qoQRf2FlT6vOeMiymqEGEJqndTEAKVmgaxpVChZ1swmI%2BlNTGrEdYRRQsas%2B8VDHhdpxryr9jvEoLp9M%2FK9FS0JLY%2BtJFtMQFhuSd9PwegpAF6Vk2WPCBK%2BMy9P31ZMYTP3b%2B1%2FZM%2F3T%2FfH482%2BzGOzbe7qsXVBM6g8P%2Fdghd8%2Bj%2B2HTeZm5c65TNZe2izOnYmbjNWQqA0mty3pVxjFb8ERQibXuBKQe2RaCdSp4JLEc4OsxhcKcKc0xBde2QUOKahBzEQ7oCmbGiUzTYFrWujEo%2FoLDUmHHxGalLU2uX7MYmZ4oO6gqlqHNsIwM2ZIe6LJmOKCZtkIAQtA04%2BO1GwlVEZdd0BoSa7SIuWajlAbGZoETxLyITsqXtMFDb9lyi7Y3UkXW%2FODEY5AwrVbYz47StmmxU46UBC4qgL1yfsUb8LrEtxPHTppoPXQFBhYsG%2B%2FghOxw0nDRfUdCMlaoXGN5pBWXUcP1hcnoWGEp0usobaCE0dJ5ihVMWQ8EIDN9CQVbXIgtqcRLsIneC1eGScKnD3KbfqtSftvwGAmw70TkczjmYcikAQM01bSgwKQ8BS51Hr52F38Y5Z7zpd1o44v3sE6qOv6MudI9kOgL5XnGGSK2YAaz%2F0LP%2Flm7S4%2FFxfUPpOVYsLT2wMJCGhaomFBdqDgpFW33zFS091CBxwOp%2BQSTF3CQ9aXkgsgpEbnqnBkR9xVEthAQPE9tgUB5oCMfyn%2BCmRSsSvij4aHfJDtQeLtQeK8AIOiYiSFkXOcc91VhuwXGW7mvw81lzBTXR0w6cVqHZb1zpKR7e9YFexD99PmyDJx2GSDk3FvF1RtIlNtDefzEyNozRXHGyOtro%2FoGc8Hp1Dh5595WOntwSsDESeEKczl0nA8P%2F8D952h4kD2XW58mJgZynJk%2Flj3QFag%2Bu8EVxmxKxTUX8yZrvPjPM8jvvzSYRgpmMmwGBSHFxQdPB%2BYjR7eyXN%2BTc4sxgGBmzGJ89Kh4xOUufRY6vx766eX9dGK1%2BniYt218gvVu%2FgE%3D)

2. Crear una clase que permita crear cuentas bancarias. La clase ha de tener los siguientes
requisitos:
• Nombre: Cuenta.
• Tendrá las siguientes propiedades:
§ saldoDeCuenta, de tipo double.
§ nombreDelTitular, de tipo String.
§ numeroDeCuenta, de tipo long.
• Constructor de la clase con dos parámetros:
§ nombreDelTitular, de tipo String.
§ saldoDeCuenta, de tipo double.
• Métodos de la clase:
§ Se	crearán	dos	setters,	uno	para	hacer	ingresos	(setIngreso)	y	otro	para
hacer retirar	 (setRetiro).
§ Se	crearán	dos	getters,	uno	permitirá	obtener	el	saldo	(getSaldoCuenta)	de	la
cuenta	corriente	y	el	otro	obtendrá	los	datos	generales	(getDatosCuenta)	de
una Cuenta .
El constructor de la clase Cuenta será el encargado de establecer:
• Un nombre para el titular de la cuenta corriente
• Un saldo inicial para la cuenta corriente.
• Asignará un número de cuenta corriente, de tipo long, de forma aleatoria
