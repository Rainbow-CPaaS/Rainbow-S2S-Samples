/*
 * Rainbow authentication portal
 * # Rainbow authentication portal API guide  ## Preamble  [Download Postman collection][0]  ### Introduction  This guide describes list of API services that are provided by OT Rainbow authentication portal system. Services are used to manage OT Rainbow authentication.  ### Protocol  REST interface is used for sending/receiving OT rainbow API messages.   HTTP request GET is used. Standard HTTP responses are used to provide requested information or error status. There is no session notion in OT Rainbow system, so requests could be issued according stateless model, without transport conservation between them.   JSON is used as a main format for data encoding in message body part. Each request is started with the following pattern /{module}/{version}/ where {module} is a portal module name to address and {version} is a version of used API, par example, “v1.0”.  ### Security considerations  Each request should contain some credential information to authenticate itself. Standard HTTP authentication with basic/bearer modes is used. JSON Web Token mechanism is used to provide authentication information. JWT has a expire timeout that is controlled by OT Rainbow portal to prevent very long token usage. Also authentication with application token is used. The token must be provided in the request HTTP header, using a custom header: APIKey. At server side, token is verified, and if it doesn’t match, 403 Not Allowed response is sent. TLS is used as a transport protocol to support message exchanges between OT Rainbow portal and an application.    [0]: AuthenticationPortalServer_postman.json
 *
 * The version of the OpenAPI document: 1.104.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ale.rainbow.s2s.client.auth.models;

import java.util.Objects;
import java.util.Arrays;
import com.ale.rainbow.s2s.client.auth.models.GetBasicLoginSuccessLoggedInApplication;
import com.ale.rainbow.s2s.client.auth.models.PostSamlAssertionSuccessLoggedInUser;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * PostSamlAssertionSuccess
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-13T09:48:07.123237+01:00[Europe/Paris]")
public class PostSamlAssertionSuccess implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Object data;

  public static final String SERIALIZED_NAME_PHONE_NUMBERS = "phoneNumbers";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBERS)
  private Object phoneNumbers;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_LOGGED_IN_APPLICATION = "loggedInApplication";
  @SerializedName(SERIALIZED_NAME_LOGGED_IN_APPLICATION)
  private GetBasicLoginSuccessLoggedInApplication loggedInApplication;

  public static final String SERIALIZED_NAME_LOGGED_IN_USER = "loggedInUser";
  @SerializedName(SERIALIZED_NAME_LOGGED_IN_USER)
  private PostSamlAssertionSuccessLoggedInUser loggedInUser;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;


  public PostSamlAssertionSuccess data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getData() {
    return data;
  }


  public void setData(Object data) {
    this.data = data;
  }


  public PostSamlAssertionSuccess phoneNumbers(Object phoneNumbers) {
    
    this.phoneNumbers = phoneNumbers;
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPhoneNumbers() {
    return phoneNumbers;
  }


  public void setPhoneNumbers(Object phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public PostSamlAssertionSuccess country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Phone number country (ISO 3166-1 alpha3 format) &lt;br/&gt;&#x60;country&#x60; field is automatically computed using the following algorithm when creating/updating a phoneNumber entry: - If &#x60;number&#x60; is provided and is in E164 format, &#x60;country&#x60; is computed from E164 number - Else if &#x60;country&#x60; field is provided in the phoneNumber entry, this one is used - Else user &#x60;country&#x60; field is used
   * @return country
  **/
  @ApiModelProperty(required = true, value = "Phone number country (ISO 3166-1 alpha3 format) <br/>`country` field is automatically computed using the following algorithm when creating/updating a phoneNumber entry: - If `number` is provided and is in E164 format, `country` is computed from E164 number - Else if `country` field is provided in the phoneNumber entry, this one is used - Else user `country` field is used")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public PostSamlAssertionSuccess loggedInApplication(GetBasicLoginSuccessLoggedInApplication loggedInApplication) {
    
    this.loggedInApplication = loggedInApplication;
    return this;
  }

   /**
   * Get loggedInApplication
   * @return loggedInApplication
  **/
  @ApiModelProperty(required = true, value = "")

  public GetBasicLoginSuccessLoggedInApplication getLoggedInApplication() {
    return loggedInApplication;
  }


  public void setLoggedInApplication(GetBasicLoginSuccessLoggedInApplication loggedInApplication) {
    this.loggedInApplication = loggedInApplication;
  }


  public PostSamlAssertionSuccess loggedInUser(PostSamlAssertionSuccessLoggedInUser loggedInUser) {
    
    this.loggedInUser = loggedInUser;
    return this;
  }

   /**
   * Get loggedInUser
   * @return loggedInUser
  **/
  @ApiModelProperty(required = true, value = "")

  public PostSamlAssertionSuccessLoggedInUser getLoggedInUser() {
    return loggedInUser;
  }


  public void setLoggedInUser(PostSamlAssertionSuccessLoggedInUser loggedInUser) {
    this.loggedInUser = loggedInUser;
  }


  public PostSamlAssertionSuccess token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * JsonWebToken to use for all API requests
   * @return token
  **/
  @ApiModelProperty(required = true, value = "JsonWebToken to use for all API requests")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSamlAssertionSuccess postSamlAssertionSuccess = (PostSamlAssertionSuccess) o;
    return Objects.equals(this.data, postSamlAssertionSuccess.data) &&
        Objects.equals(this.phoneNumbers, postSamlAssertionSuccess.phoneNumbers) &&
        Objects.equals(this.country, postSamlAssertionSuccess.country) &&
        Objects.equals(this.loggedInApplication, postSamlAssertionSuccess.loggedInApplication) &&
        Objects.equals(this.loggedInUser, postSamlAssertionSuccess.loggedInUser) &&
        Objects.equals(this.token, postSamlAssertionSuccess.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, phoneNumbers, country, loggedInApplication, loggedInUser, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSamlAssertionSuccess {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    loggedInApplication: ").append(toIndentedString(loggedInApplication)).append("\n");
    sb.append("    loggedInUser: ").append(toIndentedString(loggedInUser)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

