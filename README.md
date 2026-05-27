# Classificador de Nível de Herói

Este projeto foi desenvolvido como parte do desafio prático do módulo **"Dominando Estruturas de Controle"** da **Formação Lógica de Programação** da [Digital Innovation One (DIO)](https://www.dio.me/).

## 📌 Sobre o Desafio

O objetivo deste desafio é aplicar conceitos fundamentais de lógica de programação para classificar o nível de um herói com base em sua quantidade de experiência (XP).

### Requisitos Técnicos

Para a implementação, foram utilizados os seguintes conceitos:
- **Variáveis**: Para armazenar dados como nome e XP.
- **Operadores**: Para comparações lógicas de valores.
- **Laços de Repetição**: Para permitir múltiplas consultas sem reiniciar o programa.
- **Estruturas de Decisão**: `if-else` para categorizar o herói nas faixas de nível.

### Regras de Classificação

O nível é determinado seguindo a tabela abaixo:

| XP | Nível |
| :--- | :--- |
| Menor que 1.000 | Ferro |
| Entre 1.001 e 2.000 | Bronze |
| Entre 2.001 e 5.000 | Prata |
| Entre 5.001 e 7.000 | Ouro |
| Entre 7.001 e 8.000 | Platina |
| Entre 8.001 e 9.000 | Ascendente |
| Entre 9.001 e 10.000 | Imortal |
| Maior ou igual a 10.001 | Radiante |

### Saída Esperada

Ao final da execução, o programa deve exibir a mensagem:
`"O Herói de nome {nome} está no nível de {nivel}"`

---

## 🚀 Como Executar

Este projeto foi desenvolvido em **Java** utilizando o **Maven** para gerenciamento de dependências e execução.

1.  **Pré-requisitos**:
    - Java JDK 17 ou superior.
    - Maven instalado.

2.  **Compilar e Rodar**:
    Abra o terminal na pasta raiz do projeto e execute:
    ```bash
    mvn compile exec:java -Dexec.mainClass="Main"
    ```

3.  **Interação**:
    - Siga as instruções no console para digitar o nome e o XP do herói.
    - Ao final de cada classificação, você poderá escolher se deseja realizar uma nova consulta.

---

## 🛠️ Boas Práticas Aplicadas

- **Separação de Responsabilidades**: A lógica de classificação foi isolada em um método específico (`classificarNivel`), facilitando a manutenção.
- **Validação de Entrada**: O programa verifica se o XP inserido é um número válido, evitando erros de execução (Exceptions).
- **Legibilidade**: Código comentado e estruturado para fácil entendimento.

---

## 👨‍💻 Autor

<div align="center">
  <img src="https://github.com/kauavictorss.png" width="150px" style="border-radius: 50%;" alt="Kauã Victor"/>
  <br>
  <h1>Kauã Victor Silva dos Santos</h1>
  
[![GitHub](https://img.shields.io/badge/-GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/kauavictorss)
[![LinkedIn](https://img.shields.io/badge/-LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/kaua-victor-santos/)
</div>

---

## 🎓 Certificação DIO

Desenvolvido com ☕ e foco em lógica!

[![Certificado DIO](https://img.shields.io/badge/Certificado-DIO-ef4444?style=for-the-badge&logo=douban)](https://www.dio.me/certificate/GKJTUNP4/share)
