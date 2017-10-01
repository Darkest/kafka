class KafkaProducer {
  lazy val producerTemplate = CamelCtx.camCtx.createProducerTemplate()
  lazy val consumerTemplate = CamelCtx.camCtx.createConsumerTemplate()


  def getMsg = {

  }
  def sendMsg(msg:String) = {
    producerTemplate.sendBody("kafka:Test", msg)
  }

  def getMsgCount(topic: String) = {
    consumerTemplate
  }
}
