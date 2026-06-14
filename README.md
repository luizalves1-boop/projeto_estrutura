# Projeto Estrtura de Dados
 
 # Problema
   Este trabalho tem como objetivo implementar e comparar os algoritmos de ordenação Bubble Sort, Selection Sort e Insertion Sort. Para a análise, serão utilizados dois conjuntos de vetores contendo valores aleatórios, com tamanhos variando de 10 a 100 elementos e de 1.000 a 10.000 elementos.

   Cada algoritmo deverá ordenar os mesmos vetores de entrada, permitindo uma comparação justa de desempenho. O tempo de execução será medido em 100 execuções para cada caso, utilizando-se a média dos resultados obtidos para avaliar a eficiência de cada método de ordenação.

# Objetivo

Implementar os algoritmos de ordenação Bubble Sort, Selection Sort e Insertion Sort, aplicando-os a diferentes conjuntos de dados para analisar e comparar seus desempenhos. O projeto busca medir o tempo médio de execução de cada algoritmo, identificando seu comportamento diante de vetores com diferentes quantidades de elementos. E transformar o resultado em gráficos para melhor análise e compreensão da comparação dos algoritmos.

# Solução

A solução desenvolvida consiste na implementação dos algoritmos de ordenação Bubble Sort, Selection Sort e Insertion Sort na classe `Ordena`. Os vetores utilizados nos testes são gerados aleatoriamente pela classe `Utilidades`, seguindo os tamanhos definidos para os conjuntos Dataset1 e Dataset2.

Para garantir uma comparação justa, cada algoritmo recebe exatamente os mesmos vetores de entrada. A classe `Teste` é responsável por executar os algoritmos, medir seus tempos de execução utilizando o relógio do sistema e calcular a média de 100 execuções para cada vetor.

Após a coleta dos dados, os tempos médios obtidos são organizados em tabelas e gráficos, permitindo a análise e comparação do desempenho dos algoritmos em diferentes volumes de dados.

# Saídas

A execução do programa gera os tempos médios de execução dos algoritmos Bubble Sort, Selection Sort e Insertion Sort para cada tamanho de vetor definido nos datasets. Os resultados são apresentados em tabelas contendo o tamanho do vetor e o respectivo tempo médio obtido após 100 execuções.

Além das tabelas, os dados coletados são utilizados na geração de gráficos comparativos, permitindo visualizar o comportamento de cada algoritmo à medida que o volume de dados aumenta e facilitando a análise de desempenho entre eles.

# Conclusão

Os resultados experimentais mostraram crescimento aproximadamente quadrático para os três algoritmos analisados, confirmando a complexidade teórica O(n²). O Insertion Sort apresentou os menores tempos médios em todos os conjuntos de dados, seguido pelo Selection Sort. O Bubble Sort apresentou o pior desempenho, especialmente para vetores maiores, devido ao elevado número de trocas realizadas durante a ordenação.

# Tabelas

![Data set 1](https://github.com/luizalves1-boop/projeto_estrutura/blob/master/TabelaDataSet1.png?raw=true)
