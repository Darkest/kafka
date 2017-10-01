import org.scalatest.FunSuite

class ProducerTest extends FunSuite {

  val kafkaProducer = new KafkaProducer
  test("send msg to kafka") {
    for (i <- 1 to 10) {
      kafkaProducer.sendMsg("123")
    }
  }
}
