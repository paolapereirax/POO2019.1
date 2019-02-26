class Carro:
	def __init__(self):
		self.psg = 0
		self.gas = 0
		self.km = 0
		self.lim_psg = 2
		self.lim_gas = 10

	def __str__(self):
		return "Passageiros: " + str(self.psg) + ", Combustivel: " + str(self.gas) + ", Kilometragem: " + str(self.km)

	def entrar(self):
		if self.psg < self.lim_psg:
			self.psg += 1
		else:
			print ("Limite de pessoas atingido")

	def sair(self):
		if self.psg > 0:
			self.psg -= 1
		else: 
			print ("Nao ha pessoas no carro")

	def abastecerCarro(self, qtd):
		self.gas += qtd
		if self.gas > self.lim_gas:
			self.gas = self.lim_gas

	def dirigirCarro(self, dist):
		if self.psg == 0:
			print ("Nao ha pessoas no carro")

		gas_nessecario = dist / 10
		if self.gas >= gas_nessecario:
			self.km += dist
			self.gas -= gas_nessecario
		else:
			print ("Combustivel insuficiente")

carro = Carro()
comando = " "
print ("Digite: status, entrar, sair, abastecer, dirigir ou end")
while (comando !=  "end"):
	comando = input()

	if (comando == "end"):
		break
	elif (comando == "status"):
		print (carro)
	elif (comando == "entrar"):
		carro.entrar()
	elif (comando == "sair"):
		carro.sair()
	elif (comando == "abastecer"):
		qtd = int(input:"Quanto deseja abastecer?")
		carro.abastecerCarro(qtd)
	elif (comando == "dirigir"):
		dist = int(input:"Quantos kilometros deseja dirigir?")
		carro.dirigirCarro(dist)
	else:
		print ("Comando invalido")
