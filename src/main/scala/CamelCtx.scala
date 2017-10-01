import org.apache.camel.component.kafka.KafkaComponent
import org.apache.camel.impl.DefaultCamelContext

object CamelCtx {
  val camCtx = new DefaultCamelContext()
  val kafka = new KafkaComponent()
  kafka.setBrokers(s"${KafkaConnect.host}:${KafkaConnect.port}")
  camCtx.addComponent("kafka", kafka)
  camCtx.start()
}
