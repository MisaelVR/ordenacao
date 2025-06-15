# 🔢 Projeto de Análise de Algoritmos de Ordenação – RA 04

Este projeto foi desenvolvido para a disciplina **Resolução de Problemas Estruturados em Computação**, com o objetivo de comparar diferentes algoritmos de ordenação quanto ao desempenho em **tempo de execução**, **número de trocas** e **número de iterações**.

Foram utilizados **vetores gerados com valores aleatórios e seeds fixas**, com tamanhos variados, garantindo reprodutibilidade e análise comparativa justa entre os algoritmos.

---

## 📋 Sobre o Projeto

Este projeto consiste na implementação de **diversos algoritmos de ordenação** divididos em grupos, avaliando sua eficiência com base nos seguintes critérios:

- ⏱️ Tempo de execução
- 🔁 Número de trocas
- 🔄 Número de iterações

Todos os algoritmos foram desenvolvidos manualmente, **sem o uso de estruturas ou métodos prontos**, respeitando as restrições impostas pela disciplina.

---

## ⚙️ Algoritmos Implementados

Os algoritmos foram organizados nos seguintes grupos:

- **Grupo A**: Insert Sort, Selection Sort  
- **Grupo B**: Merge Sort, Quick Sort  
- **Grupo C**: Gnome Sort, Counting Sort  

> A divisão pode variar conforme a implementação dos integrantes. Consulte o código para os detalhes finais.

---

## 📊 Metodologia

- Foram gerados vetores de inteiros com os seguintes tamanhos:
  - `1.000`, `10.000`, `100.000`, `500.000`, `1.000.000` elementos
- Para cada tamanho, foram testados **5 conjuntos de dados diferentes**, utilizando `seed` para permitir a replicação exata dos resultados.
- Foram coletados e armazenados os seguintes dados por algoritmo:
  - Tempo total de execução
  - Total de trocas realizadas
  - Número de iterações do laço principal
- Os resultados foram salvos em `.csv` e analisados com **gráficos comparativos** gerados via Python.

---

## 🧱 Estrutura do Projeto
```
 📁 ordenacao-ra04/
├── src/
│ ├── sort/ # Implementações dos algoritmos de ordenação
│ ├── util/ # Geração de vetores com seed
│ └── Main.java # Execução principal
├── dados/ # Resultados em CSV
├── graficos/ # Gráficos gerados com Python
├── analisar_resultados.py # Script Python para gerar gráficos
└── README.md
```

---

## 🚀 Como Executar

### 🔧 Etapa 1 – Executar algoritmos em Java

1. Compile o projeto:
   ```bash
   javac src/*.java
2. Execute a aplicação:
   ```bash
   java Main
Os resultados serão salvos automaticamente na pasta dados/.

### 📈 Etapa 2 – Gerar gráficos com Python

1. Instale as bibliotecas necessárias:
   ```bash
   pip install pandas matplotlib
2. Execute o analisador:
   ```bash
   python analisar_resultados.py
Os gráficos serão salvos na pasta graficos/.

---

## 📊 Exemplos de Gráficos: 
- graficos/tempo_execucao.png

- graficos/numero_trocas.png

- graficos/iteracoes.png

---

## 👨‍💼 Equipe
Projeto desenvolvido por:
- Emmanuel Victorio
- Misael Rodrigues
- Otávio Augusto
Disciplina: Resolução de Problemas Estruturados em Computação
Curso de Engenharia de Software – PUCPR

--- 
## 📌 Observações Importantes
- O código não utiliza bibliotecas de ordenação prontas (Arrays.sort(), etc).
- Todas as estruturas foram implementadas do zero, utilizando apenas tipos primitivos, laços, condicionais, e manipulação básica de arquivos.
- Projeto testado com vetores grandes, respeitando as limitações de memória e desempenho.
---
## 🔗 Links Importantes
- 📂 Repositório GitHub: https://github.com/SEU_REPOSITORIO
- 🎥 Vídeo de explicação: https://youtu.be/SEU_VIDEO
