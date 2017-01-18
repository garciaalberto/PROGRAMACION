from DNIChecker import *

class cuentaCorriente:
    def __init__(self, nombre, apellidos, direccion, telefono, dni, saldo=None):
        self.nombre = nombre
        self.apellidos = apellidos
        self.direccion = direccion
        self.telefono = telefono
        self.dni = dni
        self.saldo = saldo

    def setNombre(self, nombre):
        self.nombre = nombre

    def getNombre(self):
        self.nombre

    def setApellidos(self, apellidos):
        self.apellidos = apellidos

    def getApellidos(self):
        self.apellidos

    def setDireccion(self, direccion):
        self.direccion = direccion

    def getDireccion(self):
        self.direccion

    def setTelefono(self, telefono):
        self.telefono = telefono

    def getTelefono(self):
        self.telefono

    def setDNI(self, dni):
        self.dni = dni

    def getDNI(self):
        self.dni

    def setSaldo(self, saldo):
        self.saldo=int(saldo)

    def getSaldo(self):
        return self.saldo

    def retirarDinero(self, cantidad):
        self.setSaldo(self.getSaldo() - int(cantidad))

    def ingresarDinero(self, cantidad):
        self.setSaldo(self.getSaldo() + int(cantidad))    

    def consultarCuenta(self):
        usuario = "Usuario: " + str(self.nombre) + " " + str(self.apellidos) + "\n"
        identificacion = "Con DNI: " + str(self.nif)
        numeroDeTelefono = "Numero de telefono: " + str(self.telefono)
        domicilio = "Domicilio: " + str(self.direccion)

        print (usuario, " identificacion" + "\n", numeroDeTelefono + "\n", domicilio)