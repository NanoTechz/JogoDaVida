O LIFE é um jogo simples de simulação de processos biológicos criado pelo matemático John Conway.
O “ambiente” onde se passa a simulação é uma grade quadriculada onde são colocadas “células” vivas; cada
quadrado da grade pode conter ou não uma célula viva. A partir de um estado inicial (que pode ser gerado
aleatoriamente, por exemplo), o estado seguinte da grade é determinado através de 3 regras bem simples:

</br>
<i>
• Uma célula viva com menos de 2 vizinhos morre.
• Uma célula viva com mais de 3 vizinhos morre.
• Uma célula viva aparece quando tem 3 vizinhos vivos exatamente.
</i>
</br>

O processo de simulação é iterativo, ou seja, as regras são aplicadas ao estado inicial que produz um
segundo estado. A este segundo estado são aplicadas as regras novamente e assim sucessivamente, criando
novas “gerações” de células ao longo do tempo.

<b> fonte: http://ccsl.ime.usp.br/files/books/intro-java-cc.pdf pg. 113 </b>