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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * GetSamlAssertionConfigurationSuccess
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-21T22:52:11.612023+01:00[Europe/Paris]")
public class GetSamlAssertionConfigurationSuccess implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_XML = "xml";
  @SerializedName(SERIALIZED_NAME_XML)
  private List<Object> xml = new ArrayList<Object>();


  public GetSamlAssertionConfigurationSuccess xml(List<Object> xml) {
    
    this.xml = xml;
    return this;
  }

  public GetSamlAssertionConfigurationSuccess addXmlItem(Object xmlItem) {
    this.xml.add(xmlItem);
    return this;
  }

   /**
   * Rainbow SAML server metadata
   * @return xml
  **/
  @ApiModelProperty(required = true, value = "Rainbow SAML server metadata")

  public List<Object> getXml() {
    return xml;
  }


  public void setXml(List<Object> xml) {
    this.xml = xml;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSamlAssertionConfigurationSuccess getSamlAssertionConfigurationSuccess = (GetSamlAssertionConfigurationSuccess) o;
    return Objects.equals(this.xml, getSamlAssertionConfigurationSuccess.xml);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xml);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSamlAssertionConfigurationSuccess {\n");
    sb.append("    xml: ").append(toIndentedString(xml)).append("\n");
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
