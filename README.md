# AbstractFactory
Atividade escolar utilizando padrão de projeto "Abstract Factory".

Como exemplo, utilizei uma classe que representa um 'PEDIDO' de compra, este determinado pedido contém um 'CUPOM' de desconto. 
Cupom de desconto possui 2 tipos diferentes: 
Cupom10percent - classe responsável por retornar o cupom de 10% de desconto;
Cupom20percent - classe responsável por retornar o cupom de 20% de desconto.
Ao instanciar um Pedido é passado por parâmetro uma 'fabrica abstrata', a fábrica abstrata é uma interface que possui a responsabilidade para emitir determinado cupom e será 
implementada pelos diferentes tipos de cupoms.

