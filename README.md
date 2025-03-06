# Cotacao Microservice

## 📌 Sobre
O **Cotacao** é um microserviço responsável por processar e distribuir cotações financeiras. Diferente da comunicação via API REST, este microserviço utiliza **Kafka** somente para interação assíncrona com os demais sistemas, não aborda uma implementaçãi híbrida.

## 🚀 Tecnologias Utilizadas
- **Quarkus**: Framework Java otimizado para conteinerização e execução em nuvem.
- **Apache Kafka**: Mensageria para integração assíncrona entre microserviços.
- **Docker**: Facilita a execução e configuração do ambiente.

## 🛠️ Configuração do Ambiente
### 📥 Clonando o Repositório
```bash
git clone https://github.com/seu-usuario/cotacao.git
cd cotacao
```

### ⚙️ Configurando o Kafka com Docker
Se ainda não tiver um ambiente Kafka rodando, utilize o Docker Compose:
```bash
docker-compose -f kafka/docker-compose.yml up -d
```

### 🔧 Configurando o Quarkus
Edite o arquivo `application.properties` para ajustar a conexão com o Kafka:
```properties
kafka.bootstrap.servers=localhost:9092
quarkus.smallrye-kafka.bootstrap-servers=localhost:9092
```

### ▶️ Executando o Microserviço
```bash
./mvnw quarkus:dev
```

## 📡 Tópicos Kafka
O microserviço **Cotacao** utiliza os seguintes tópicos para comunicação:
- `cotacao.solicitacoes`: Recebe solicitações de cotação.
- `cotacao.respostas`: Envia os resultados processados.

## 📄 Exemplo de Mensagem Kafka
**Solicitação de Cotação (`cotacao.solicitacoes`)**
```json
{
  "id": "123456",
  "moeda": "USD",
  "valor": 100.00
}
```

**Resposta Processada (`cotacao.respostas`)**
```json
{
  "id": "123456",
  "moeda": "USD",
  "cotacao": 5.25,
  "valorConvertido": 525.00
}
```

## 📝 Licença
Este projeto está sob a licença MIT.

