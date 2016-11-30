/*
 * Copyright 2016 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.testuser.models

case class AuthenticationRequest(username: String, password: String)

object ErrorCode extends Enumeration {

  type ErrorCode = Value

  val INTERNAL_SERVER_ERROR = Value("INTERNAL_SERVER_ERROR")
  val INVALID_CREDENTIALS = Value("INVALID_CREDENTIALS")
}

case class ErrorResponse(code: ErrorCode.Value, message: String)

object ErrorResponse {
  val internalServerError = ErrorResponse(ErrorCode.INTERNAL_SERVER_ERROR, "An unexpected error occurred")
  val invalidCredentialsError = ErrorResponse(ErrorCode.INVALID_CREDENTIALS, "Invalid Authentication information provided")
}