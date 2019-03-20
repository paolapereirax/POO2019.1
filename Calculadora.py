class Calculadora:
	def __init__(self, batMax):
		self.bateria = 0
		self.bateriamax = batMax

	def __str__(self):
		return "Bateria Restante: " + str(self.bateria) + "/" + str(self.bateriaMax)

	def carregarBateria(self, carga):
		self.bateria += carga
		if (self.bateria > self.bateriaMax):
			self.bateria = self.bateriaMax
  
	def somar(self, n1, n2):
		print (n1 + n2)
		self.bateria -= 1

	def dividir(self, n1, n2):
		if (n2 == 0):
			print ("Erro: Numero nao pode ser dividido por 0")
		else:	
			print (n1 / n2)
		self.bateria -= 1

calculadora = Calculadora()
operacao = " "
print ("Digite: iniciar _cargaMax, bateria, carregar _valor, somar _a _b, dividir _a _b ou finalizar")
while (operacao != "finalizar"):
	operacao = input()

	if (operacao == "finalizar"):
		break
	elif (operação == "iniciar"):
		calculadora = Calculadora(int(ui[1])) 
	elif (operacao == "bateria"):
		print(calculadora)
	elif (operacao == "carregar"):
		calculadora.carregarBateria(int(ui[1]))
	elif (operacao == "somar"):
		if (calculadora.bateria == 0):
			print ("Sem bateria")
		else:
			calculadora.somar(int(ui[1]), (ui[2]))
	elif (operacao == "dividir"):
		if (calculadora.bateria == 0):
			print ("Sem bateria")
		else:
			calculadora.dividir(int(ui[1]), (ui[2]))
	else:
		print ("Comando invalido")
