# Agenda telefônica #

Agenda telefônica básica para praticar JSF.

### Lista de páginas ###

* *index.xhtml*: Página principal; Permite que o usuário realize login ou se cadastre no sistema.
* *loginError.xhtml*: Tela usada para indicar 'falha na autenticação'.
* *newUser.xhtml*: Tela onde um novo usuário pode se cadastrar.

Obs.: As páginas abaixo são protegidas (só podem ser acessadas se um usuário estiver logado)

* *home.xhtml*: Tela principal do sistema que mostra os contatos de um usuário, permite manipulá-los (editar, remover) e/ou adicionar novos.
* *addContact.xhtml*: Tela onde um usuário pode adicionar um novo contato.
* *confirmRemove.xhtml*: Tela que pede a confirmação antes de remover um contato.
* *editContact.xhtml*: Tela para editar um contato.


### Managed beans ###

Foram criados os seguintes Managed beans:

* *LoginBean*: Responsável por login.
* *SystemBean*: Responsável por controle do sistema.
* *PhonebookBean*: Responsável por controle da agenda.


### Estratégia utilizada para representar a camada de dados ###

Foi utilizada uma classe DBSimulator para simular um banco de dados. Essa classe segue o padrão Singleton, possuindo somente uma instância. Nela é armazenada uma coleção (List) de usuários, onde cada usuário possui: (*i*) nick para login, (*ii*) senha e (*iii*) uma lista telefônica. No construtor dessa classe foram criados três usuários com dados iniciais.

Essa classe também possui um método que checa se um determinado usuário existe no sistema.

Além disso, a classe disponibiliza um método para adicionar um usuário no banco.


### Modularização ###

O projeto foi estruturado em duas camadas básicas:

* *phonebook*: onde são armazenadas as classes relacionadas com a lista telefônica.
* *system*: onde são armazenadas as classes relacionadas com o sistema.

A *phonebook* possui dois pacotes: *jsf* e *model*. Em *jsf* são armazenados os *managed beans* e em *model* as classes modelo, seguindo o padrão MVC.

A *system* possui quatro camadas: *jsf*, *model*, *control* e *data*. O pacote *control* contém classes para manipular a camada *data*, que por sua vez contém os dados. Os pacotes *jsf* e *model* funcionam da mesma forma que em *phonebook*.

