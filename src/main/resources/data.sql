USE db_joalheriajoiasjoia;

-- INSERÇÃO: Tipos de Usuários
INSERT IGNORE INTO tb_tipo_usuario (id_tipo_usuario, nome_tipo_usuario) VALUES
(1, 'Admin'),
(2, 'Cliente');

-- INSERÇÃO: Categorias de Produto
INSERT IGNORE INTO tb_categoria_produto (idCategoriaProduto, nomeCategoriaProduto, descricaoCategoria) VALUES
(1, 'Novidades', 'Novidades do site'),
(2, 'Descontos', 'Peças com desconto '),
(3, 'Colares', 'Peças para o pescoço'),
(4, 'Aneis', 'Peças para os dedos'),
(5, 'Brincos', 'Peças para as orelhas');

-- INSERÇÃO: Tipos de Produto
INSERT IGNORE INTO tb_tipo_produto (idTipoProduto, nomeTipoProduto, descricaoTipoProduto) VALUES
(1, 'Ouro', '18k'),
(2, 'Prata', '750');

-- INSERÇÃO: De ornamentos
INSERT IGNORE INTO tb_ornamentos (idOrnamentos, nomeOrnamentos, descricaoOrnamentos) VALUES
(1, 'Diamante rosa', '18k'),
(2, 'Quartzo rosa', '750'),
(3, 'Turmalina rosa', '750'),
(4, 'Morganita', '750');

-- INSERÇÃO: Usuários
INSERT IGNORE INTO tb_usuario (idUsuario, nomeUsuario, cpf, telefone, data_nascimento, email, tipo_usuario, senha) VALUES
(1, 'Ana Silva', '12345678901', '11999990001', '1990-05-01', 'ana@email.com', 2, 'senha12'),
(2, 'Bruno Costa', '12345678902', '11999990002', '1988-03-12', 'bruno@email.com', 2, 'senha123'),
(3, 'Carla Mendes', '12345678903', '11999990003', '1992-08-23', 'carla@email.com', 2, 'senha1234'),
(4, 'Diego Souza', '12345678904', '11999990004', '1985-11-15', 'diego@email.com', 2, 'senha1235'),
(5, 'Eduarda Lima', '12345678905', '11999990005', '1995-02-28', 'eduarda@email.com', 2, 'senha1236');


INSERT IGNORE INTO tb_endereco (nomeRua, numeroCasa, cidade, estado, cep, IdUsuario, bairro, comp) VALUES
('Rua das Flores', '123', 'São Paulo', 'SP', '01001-000', 1, 'Centro', 'Apto 101'),
('Av. Paulista', '1000', 'São Paulo', 'SP', '01310-100', 2, 'Bela Vista', 'Apto 202'),
('Rua das Acácias', '45', 'Belo Horizonte', 'MG', '30130-000', 3, 'Funcionários', 'Sala Comercial'),
('Rua do Sol', '789', 'Recife', 'PE', '50000-000', 4, 'Boa Vista', 'Perto do metrô'),
('Rua Central', '321', 'Curitiba', 'PR', '80000-000', 5, 'Centro', 'Loja 1');

INSERT IGNORE INTO tb_produto (idProduto, nomeProduto, descricao, preco, img, categoriaProduto, tipoProduto, ornamentoProduto) VALUES
(1, 'Conjunto de peças arco-íris', 'Conjunto de peças com pedras preciosas nas cores do arco-íris.', 2500.00, 'https://i.pinimg.com/736x/c2/66/1d/c2661d79fc1da942215bbc055483a0b8.jpg', 1, 1, 1),
(2, 'Brincos geométricos', 'Brincos duplos com pedras moldadas em formato retangular.', 650.00, 'https://i.pinimg.com/736x/f3/4f/10/f34f103426c56e10d8edd46e7ec5e3b3.jpg', 1, 1, 4),
(3, 'Conjunto rosas prateadas', 'Conjunto composto por pares de colares em pedras rosas e prateadas, juntamente de um combo de pulseiras do mesmo material.', 1200.00, 'https://i.pinimg.com/736x/cc/54/6b/cc546b3cec0d438201c36ba47e5f13a8.jpg', 1, 1, 3),
(4, 'Brincos de sol', 'Brincos de argola com pedras de quartzo rosa. ', 2300.00, 'https://i.pinimg.com/736x/d5/b1/1d/d5b11dde38b5e03f74c2956cd008e5f2.jpg"', 1, 2, 2),
(5, 'Conjunto Miss Bella', 'Conjunto de colares, brincos, anéis e pulseiras composto inteiramente de pedras preciosas.', 7000.00, 'https://i.pinimg.com/736x/8a/23/31/8a2331938dc5c86685919f3f708bc7bd.jpg', 1, 1, 1),
(6, 'Conjunto Wicked', 'Conjunto de colares e pulseiras, nas cores verde e rosa.', 4500.00, 'https://i.pinimg.com/736x/d2/d3/ec/d2d3eca249079105c8347540f239a449.jpg', 1, 1, 1),
(7, 'Doce encanto', 'Pulseira com acabamento refinado', 1600.00, 'https://i.pinimg.com/736x/41/86/5d/41865dfeb5e6fe90aa63502d991ac3e3.jpg', 2, 2, 1),
(8, 'Conjunto brilhos serenos', 'Conjunto de colar, pulseiras e brincos feito com pedras preciosas de cores frias.', 1440.00, 'https://i.pinimg.com/736x/fd/a7/05/fda70503ddbb64d78a909198e62dccee.jpg', 2, 1, 1),
(9, 'Rosa Crepúsculo', 'Brincos de ouro em forma de rosas com pedras de Morganita ', 1200.00, 'https://i.pinimg.com/736x/b6/23/77/b623771aba31dc9f3b6b3dfe7ef159af.jpg', 2, 2, 4),
(10, 'Colar Gota do Encanto', 'Colar de ouro com pequeno pingente de ouro coberto por pequenas pedras preciosas.', 500.00, 'https://i.pinimg.com/736x/05/27/2b/05272b4ead402d1de7849f8de516bcc8.jpg', 3, 1, 1),
(11, 'Conjunto de colares Sunshine', 'Conjunto de colares extravagantes nas cores rosa, laranja e amarelo.', 1400.00, 'https://i.pinimg.com/736x/58/cf/c1/58cfc1dad535d86c8e09a2c5ffa739a0.jpg', 3, 2, 1),
(12, 'Colar Flora Rosa', 'Colar de ouro em forma de rosas com pedras de Morganita.', 760.00, 'https://i.pinimg.com/736x/57/e8/7f/57e87f821c3c0d85b352fb3bf840b825.jpg', 3, 1, 4),
(13, 'Anel Pétalas Douradas', 'Anel em estilo retrô com ouro e turmalina rosa.', 450.00, 'https://i.pinimg.com/736x/c6/ae/b7/c6aeb79e7c15caba8cdb8ea21824ebc1.jpg', 4, 1, 3),
(14, 'Anel Mar Perolado', 'Anel de ouro com uma grande pérola ao redor de pequenas pedras preciosas.', 300.00, 'https://i.pinimg.com/736x/57/57/2d/57572d1209d2ee4d0fd49cd6c166de22.jpg', 4, 2, 4),
(15, 'Anel Pontos de Luz Perolado', 'Anel fino de ouro cravejado com pequenas pedras preciosas.', 120.00, 'https://i.pinimg.com/736x/93/8b/b4/938bb4ea672018df5a711ade65f3d191.jpg', 4, 2, 4),
(16, 'Brincos lunar', 'Luxuoso Brinco de ouro cravejado com pequenas pedras preciosas', 890.00, 'https://i.pinimg.com/736x/85/48/f7/8548f7678d9aac612d9baf0e3a7203e6.jpg', 5, 2, 3),
(17, 'Brincos Mar Perolado', 'Modelo elegante para festas', 500.00, 'https://i.pinimg.com/736x/96/67/79/966779942aae4bfdfc75a97182bbb32e.jpg', 5, 2, 4),
(18, 'Brincos Gota do Encanto', 'Pulseira de ouro com pequeno pingente de ouro coberto por pequenas pedras preciosas.', 400.00, 'https://i.pinimg.com/736x/e2/4c/87/e24c87be0520250f50b6935757895309.jpg', 5, 1, 2),
(19, 'Colar Minimalista', 'Design simples e moderno', 390.00, 'img/colar5.jpg', 5, 2, 2),
(20, 'Pulseira de Couro e Ouro', 'Combinação moderna de materiais', 1300.00, 'img/pulseira5.jpg', 1, 1, 2),