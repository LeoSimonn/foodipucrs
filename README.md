README

APLICATIVO IFOOD

CLASSES: 

LEONARDO
-----------------------------------------------
• ESTABELECIMENTOS (class Estab) 
+ TIPO (String tipoEstab)
+ NOME (String nomeEstab)
+ RUA (String ruaEstab)
+ NÚMERO (int numeroEstab)
+ COMPLEMENTO (String complementoEstab)
+ BAIRRO  (String bairroEstab)
+ CIDADE (String cidadeEstab)
+ UF (String ufEstab)
+ CNPJ (String cnpjEstab) 
+ TELEFONE (String telefoneEstab)

• PEDIDOS (Class Pedido)
+ ESTABELECIMENTO (Estabelecimento estab)
+ ARRAY DE ITENS E QUANTIDADES (int [][] codItem, quantidade)
+ CLIENTE (Cliente cliente)
+ FORMA DE PAGAMENTO (String formaPagamento)
+ COD DA ENTREGA (int codigoEntrega)


OTÁVIO
-----------------------------------------------
• CLIENTES (class Cliente)
+ NOME (String nomeCli)
+ CPF (String cpfCli)
+ TELEFONE (String telefoneCli)
+ RUA DE ENTREGA (String ruaCli)
+ NÚMERO (int numeroCli)
+ COMPLEMENTO (String complementoCli)
+ BAIRRO (String bairroCli)
+ CIDADE (String cidadeCli )
+ UF (String ufCli)

• ITENS (Class Item)
+ COD ITEM (int codItem)
+ ESTABELECIMENTO (Estabelecimento estab)
+ NOME (String nomeItem)
+ DESCRIÇÃO (String descricaoItem)
+ CATEGORIA (String categoriaItem)
+ PREÇO (double precoItem)


MURILO
-----------------------------------------------
• ENTREGAS (Class Entrega)
+ PEDIDO (Pedido pedido)
+ ENTREGADOR (Entregador entregador)
+ STATUS DA ENTREGA (String statusEntrega)

• ENTREGADORES (Class Entregador)
+ NOME (String nomeEntregador)
+ FORMA DE ENTREGA (String formaDeEntrega)
+ TELEFONE (String telefoneEntregador) 