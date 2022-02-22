# Capgemini Course

![Capgemini Logo](https://capgemini.proway.com.br/assets/img/logo-capgemini.png)

Repositório destinado para avaliação da Academia Capgemini 2022

# Tecnologias Utilizadas

Para este desafio de algoritmos, fora utilizado **Java JDK**, com auxílio da **Java Online IDE**, **Visual Studio Code** para implementação dos algoritmos e testes dos mesmos.

## Rodar o projeto

Para rodar o projeto é bem simples, utilize a ferramenta **GitClone** via terminal **_git/bash_**, simplesmente copie e cole este comando

`git clone https://github.com/viniciusr-cmd/capgemini-challenge.git`

e depois utilize `cd capgemini-challenge` para entrar na pasta.

## Rodar via web

Tomei a liberdade de utilizar a online-ide para os programas, pra utilizá-la é bem simples

Você pode verificar os links de cada questão e clicar no botão **RUN** ou **F8**

# Questões

### Questão 1

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere \* e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

Exemplo:

`Entrada: n = 6`

Saída (exemplo):

`*`
`**`
`***`
`****`
`*****`
`******`

### [Resolução: Questão 001](https://www.online-ide.com/p2ANkzonXm)

### Questão 2

Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:

- Possui no mínimo 6 caracteres.
- Contém no mínimo 1 digito.
- Contém no mínimo 1 letra em minúsculo.
- Contém no mínimo 1 letra em maiúsculo.
- Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&\*()-+
- Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.

Exemplo:

`Entrada: Ya3`

`Saída: 3`

Explicação:

Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando a senha em Ya3&ab. 2 caracteres não são suficientes visto que a senha precisa ter um tamanho mínimo de 6 caracteres.

### [Resolução: Questão 002](https://www.online-ide.com/AWi8gb9fEp)

### Questão 3

Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.

Exemplo:

`Entrada: ovo`
`Saída: 2`

Explicação:

A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0], [2]], [[0, 1], [1, 2]] respectivamente.

Exemplo 2:

`Entrada: ifailuhkqq`
`Saída: 3`

Explicação:

A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0], [3]], [[8], [9]] e [[0, 1, 2], [1, 2, 3]].

### [Resolução: Questão 003](https://www.online-ide.com/NdbwV6cYTF)
