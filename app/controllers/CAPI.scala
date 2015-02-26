package controllers

import com.gu.contentapi.client.GuardianContentClient
import com.gu.contentapi.client.model._
import org.joda.time.DateTime
import scala.concurrent.ExecutionContext.Implicits.global

object CAPI {
  val client = new GuardianContentClient("your-api-key")

  def search(path: String) = {
    client.getResponse(SearchQuery().q(path)) map { response =>
      for (result <- response.results) println(result.webTitle)
    }
  }


}
