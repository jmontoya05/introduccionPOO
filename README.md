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

![UML Persona](https://i.ibb.co/Vj5x0sS/persona.png)

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

![UML Cuenta](https://i.ibb.co/qsfffyL/cuenta.png)