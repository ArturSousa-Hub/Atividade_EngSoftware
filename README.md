# Atividade Prática - Testes Unitários com JUnit e Gradle

## Como executar os testes
Abra o terminal na raiz do projeto e execute o comando do Gradle:
- No Windows: `gradlew.bat test`
  Os resultados (passou/falhou) serão exibidos diretamente no console.

## Como apliquei os conceitos
Separei o código nos diretórios padrão (`src/main/java` e `src/test/java`). Na classe `ContaBancariaTest`, utilizei a anotação `@Test` do JUnit 5 e estruturei todos os métodos seguindo o padrão AAA. Primeiro preparei o estado (Arrange), depois executei a operação da conta (Act) e por fim validei o resultado ou a exceção esperada usando `assertEquals` e `assertThrows` (Assert).

## Como os testes automatizados ajudam a garantir a qualidade do software?
Os testes garantem a qualidade funcionando como uma rede de segurança para o código. Eles provam que a minha lógica atende aos requisitos e me impedem de quebrar algo que já estava funcionando quando eu precisar fazer alterações no futuro, eliminando a necessidade de testar tudo manualmente a cada mudança.