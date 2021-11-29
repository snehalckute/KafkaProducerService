# KafkaProducerService
KafkaProducerService
1. Start Zookeeper -C:\Kafka\startZooKeeper.cmd
2. Start Kafka - C:\Kafka\startKafka.cmd
3. Check list of topics - C:\Kafka\listAllTopics.cmd
4. Start consumerConsole for monitoring - C:\Kafka\startConsumerConole.cmd
5. Run E:\Workspace_2022\Source_Code\KafkaProducerService OR E:\Workspace_2022\Source_Code\Kafka Producer Consumer with Acknowledgement
6. Hit - http://localhost:8181/produce/{Message} with different messages
7. Check if all messages are being displayed on the ConsumerConsole
8. run E:\Workspace_2022\Source_Code\KafkaConsumerService OR E:\Workspace_2022\Source_Code\Kafka Producer Consumer with Acknowledgement
9. Check in logs of consumer if all the messages are being consumed
10. if you restart consumer all the messages will be listened again because manual acknowledgement is not set true post consumption.
11. Hit - http://localhost:8484/consume  to set the acknowledgement.
12. but after only one hit, all the messages consumption acknowledgement will be set as true but not per message - TO BE CHECKED LATER
