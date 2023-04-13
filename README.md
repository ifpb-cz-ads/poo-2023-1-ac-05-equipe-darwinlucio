## Questões do Documento em Anexo

### Questão 01
- Variável de inicialização, será usada para controlar a quantidade de repetições do loop
- Condição, é o que determina se o loop será encerrado ou não
- Atualização da variável do contador, sempre que a instrução for executada é atualizado o contador para o loop ser executado no numero exato.
- Corpo da execução, basicamente é o que vai ser executado em cada loop

### Questão 02
While e For são duas estruturas de repetições, onde usam os mesmo quatros elementos básicos citados na questão anterior, a principal diferença entre eles é no seu uso. Enquanto o for usamos quando sabemos a quantidade de repetições, no while é o contrário, quando não sabemos a quantidade de repetições exatas,  podemos usa-lo. Além disso uma diferença entre eles é a sua sintaxe, enquanto no for os primeiros três elementos básicos são descrito no começo dentro de pareteses, no while é definido apenas a condição e no corpo as demais.

### Questão 03
Do while podemos usar quando queremos executar uma instrução antes da condição ser testada, ou seja executamos obrigatoriamente uma única vez independente da condição de parada. Por exemplo: Quando queremos pegar do usuário um determinado nado, é executado uma primeira vez, a partir daí se o dado for correto o programa continua, caso não é pedido novamento ao usuário.

### Questão 04
São duas instruções usadas dentro de estruturas de repetições,o break usamos quando queremos sair forçadamento do loop, já o continue usamos quando queremos pular para a reétição seguinte.

### Questão 05
- A) Aqui temos um erros de sintaxe, o comando está começando com letra maiúscula, o uso de virgulas no lugar de ponto virgula além do falta das chaves para delimitar o corpo do loop, sem contar que aí teriamos um loop infinito
O código ideal seria assim: 
```bash
for(i = 100; i <= 1; i++){
  System.out.println(i);
}
```
- B) Apesar da lógica está correta, vemos que está faltando o comando break para sair do switch quando um caso for indenficado
O código ideal seria assim:
```bash
switch (value % 2) {
  case 0:
    System.out.println("Inteiro par");
    break
  case 1:
    System.out.println("Inteiro ímpar");
    break
}
```
- C) Podemos ver de cara que o corpo do loop está fora das chaves, além de que por causa do 'i+=2' o loop será infinito, não dando um resultado correto. O código ideal seria assim:
```bash
for(i = 19; i >= 1; i-=2){
  System.out.println(i);
}
```
- D) Nesse caso existe um erro de lógica, na condiçaõ de parada, ou seja imprimirá somente até o 98, outro erro poderia ser a variável counter que não tem tipo, mas pode-se entender que elas já tenha sido criada anteriormente. O código ideal seria assim:
```bash
counter = 2;
do {
System.out.println(counter);
counter += 2;
} while (counter <= 100);
```
