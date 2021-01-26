package org.overwatch.genji.flink.tusk

import org.apache.flink.api.scala.createTypeInformation
import org.apache.flink.streaming.api.scala.{DataStream, StreamExecutionEnvironment}

object test {
  def main(args: Array[String]): Unit = {

    val environment: StreamExecutionEnvironment = StreamExecutionEnvironment.getExecutionEnvironment
    val value: DataStream[Int] = environment.fromElements(1)
    value.print()
    environment.execute()
  }
}
