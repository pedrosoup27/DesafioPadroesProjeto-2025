# Objetivo

Um sistema de vendas de uma famosa cadeia de lojas precisa registrar a venda de produtos e emitir um comprovante de venda simplificado. Para registrar a venda de um produto é necessário conhecer o código e a quantidade do produto sendo vendido. O comprovante de venda simplificado possui uma listagem contendo cada produto (com seu nome, quantidade, preço unitário e subtotal), bem como o valor total da venda efetuada.

Sabe-se que o sistema apresenta um novo requisito. Os produtos vendidos podem ser agrupados em “kits”. Cada kit pode ser vendido a partir de agora como um novo produto. O preço unitário do kit deve ser a soma dos preços individuais de cada produto. Aplique o padrão Composite em uma nova implementação do sistema.

O exemplo de uso deve ser alterado de maneira a explorar o uso do padrão.