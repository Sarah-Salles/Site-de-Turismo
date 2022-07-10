Algoritmo "MENU_VETOR"

Var
   // Seção de Declarações das variáveis
   Nome, destino: vetor[0..3] de caracter
   idade, RG: vetor[0..3] de inteiro
   i:inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   para i de 0 ate 3 faca
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
   para i de 0 ate 3 faca
      escreval("")
      escreval("===========")
      escreval("Nome:",nome[i])
      escreval("idade: ",idade[i])
      escreval("rg: ",RG[i])
      escreval("Destino:",destino[i])
   fimpara

Fimalgoritmo