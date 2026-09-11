TicketPass 🎟️
Projetinho em Java que desenvolvi pra colocar em prática os conceitos de Programação Orientada a Objetos e Tratamento de Exceções. A ideia foi simular o backend de um sistema de venda de ingressos para eventos, aplicando regras de negócio do mundo real.

🚀 O que o projeto faz
Diferentes tipos de ingressos: Tem ingresso Comum, VIP e Estudante. O cálculo do preço usa polimorfismo pra aplicar as taxas ou descontos de cada tipo automaticamente.

Validações com exceções customizadas: O sistema usa uma exceção própria (DomainException) pra impedir a venda caso o evento já tenha acontecido ou se a capacidade de pessoas for ultrapassada.

Proteção contra erros de digitação: Trata falhas no console (try-catch) pra evitar que o programa feche sozinho se o usuário digitar uma data no formato errado ou letras no lugar de números.

Resumo do Pedido: Monta um extrato limpo com os dados do cliente, status da compra (Enum), data formatada e o valor total calculado.

🛠️ Conceitos e Tecnologias
Linguagem: Java (JDK 21+)

Orientação a Objetos: Herança, Polimorfismo, Classes Abstratas e Composição

Datas: Java Time API (LocalDateTime e DateTimeFormatter)

Coleções: List / ArrayList

Exceções: try-catch e exceções de domínio customizadas (RuntimeException)

🏃 Como rodar
Clone o repositório:

Bash
git clone https://github.com/seu-usuario/ticketpass.git
Abra na sua IDE (IntelliJ, Eclipse ou VS Code) e rode a classe application.Main.java.
