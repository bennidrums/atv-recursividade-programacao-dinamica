# Recursividade — Problema dos Degraus

Atividade prática do curso **EBAC Back-end Java v2** para exercitar chamadas recursivas com um problema de contagem de maneiras de subir uma escada.

## O que o programa faz

Recebe o número de degraus e calcula o total de maneiras de subir considerando passos de um ou dois degraus. A função usa os casos-base para um e dois degraus e, para os demais valores, soma os resultados dos dois casos anteriores.

## Conceitos praticados

- Método estático e chamada recursiva.
- Casos-base para interromper a recursão.
- Decomposição do problema em subproblemas.
- Entrada de dados com `Scanner`.
- Validação simples para não aceitar quantidade de degraus menor ou igual a zero.

## Como executar

Abra o projeto no IntelliJ IDEA e execute `src/RecursaoMain.java).

## Limitação importante

Apesar do nome do repositório mencionar programação dinâmica, a implementação atual usa recursão direta, sem memoização ou armazenamento dos resultados intermediários. Por isso, pode ficar lenta para valores grandes; a profundidade de chamadas também é limitada pela pilha da JVM.

---

**Curso:** EBAC — Back-end Java v2  
**Tema:** recursividade e decomposição de problemas
