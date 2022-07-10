Algoritmo "MENU_VETOR"

Var
   // Seção de Declarações das variáveis
   Nome, destino: vetor[1..10] de caracter
   idade, RG: vetor[1..10] de inteiro
   m, i:inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Quantas pessoas você deseja cadastrar? Máximo de 10 pessoas.")
   leia(m)
   para i de 1 ate m faca
      escreva("Digite o seu nome: ")
      leia(nome[i])
      escreva("Digite a sua idade: ")
      leia(idade[i])
      escreva("Digite o numero do seu RG: ")
      leia(RG[i])
      escreva("Digite o destino da viagem: ")
      leia(destino[i])
      escreval("")
   fimpara
   limpatela

   escreva("**CADASTRO DE CLIENTES**")
   escreval("")
   para i de 1 ate m faca
      escreval("")
      escreval("===========")
      escreval("Nome:",nome[i])
      escreval("idade: ",idade[i])
      escreval("rg: ",RG[i])
      escreval("Destino:",destino[i])
   fimpara

Fimalgoritmo