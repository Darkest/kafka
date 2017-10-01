class KafkaProducer {
  def getMsg = {

  }
  def sendMsg(msg:String) = {
    val produserTemplate = CamelCtx.camCtx.createProducerTemplate()
    produserTemplate.sendBody("kafka:Test", msg)
  }
}
