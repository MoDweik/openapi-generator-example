package api

import model.ErrorResponse
import model.Request
import model.SuccessResponse

/**
  * Provides a default implementation for [[API2142Api]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-10-08T14:45:32.938869+01:00[Europe/London]", comments = "Generator version: 7.8.0")
class API2142ApiImpl extends API2142Api {
  /**
    * @inheritdoc
    */
  override def createSubscriptionPillar2(environment: String, request: Request, correlationId: Option[String]): SuccessResponse = {
    // TODO: Implement better logic

    SuccessResponse(SuccessResponseSuccess("", "", ""))
  }
}
