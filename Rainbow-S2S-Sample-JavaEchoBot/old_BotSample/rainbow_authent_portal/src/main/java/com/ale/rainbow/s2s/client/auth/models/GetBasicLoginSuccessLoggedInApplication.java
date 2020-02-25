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
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * GetBasicLoginSuccessLoggedInApplication
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-17T17:33:57.957423+01:00[Europe/Paris]")
public class GetBasicLoginSuccessLoggedInApplication implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Application activity &lt;ul&gt;  &lt;li&gt; &lt;code&gt;A&lt;/code&gt;: AGRICULTURE, FORESTRY AND FISHING  &lt;li&gt; &lt;code&gt;B&lt;/code&gt;: MINING AND QUARRYING  &lt;li&gt; &lt;code&gt;C&lt;/code&gt;: MANUFACTURING  &lt;li&gt; &lt;code&gt;D&lt;/code&gt;: ELECTRICITY, GAS, STEAM AND AIR CONDITIONING SUPPLY  &lt;li&gt; &lt;code&gt;E&lt;/code&gt;: WATER SUPPLY; SEWERAGE, WASTE MANAGEMENT AND REMEDIATION ACTIVITIES  &lt;li&gt; &lt;code&gt;F&lt;/code&gt;: CONSTRUCTION  &lt;li&gt; &lt;code&gt;G&lt;/code&gt;: WHOLESALE AND RETAIL TRADE; REPAIR OF MOTOR VEHICLES AND MOTORCYCLES  &lt;li&gt; &lt;code&gt;H&lt;/code&gt;: TRANSPORTATION AND STORAGE  &lt;li&gt; &lt;code&gt;I&lt;/code&gt;: ACCOMMODATION AND FOOD SERVICE ACTIVITIES  &lt;li&gt; &lt;code&gt;J&lt;/code&gt;: INFORMATION AND COMMUNICATION  &lt;li&gt; &lt;code&gt;K&lt;/code&gt;: FINANCIAL AND INSURANCE ACTIVITIES  &lt;li&gt; &lt;code&gt;L&lt;/code&gt;: REAL ESTATE ACTIVITIES  &lt;li&gt; &lt;code&gt;M&lt;/code&gt;: PROFESSIONAL, SCIENTIFIC AND TECHNICAL ACTIVITIES  &lt;li&gt; &lt;code&gt;N&lt;/code&gt;: ADMINISTRATIVE AND SUPPORT SERVICE ACTIVITIES  &lt;li&gt; &lt;code&gt;O&lt;/code&gt;: PUBLIC ADMINISTRATION AND DEFENCE; COMPULSORY SOCIAL SECURITY  &lt;li&gt; &lt;code&gt;P&lt;/code&gt;: EDUCATION  &lt;li&gt; &lt;code&gt;Q&lt;/code&gt;: HUMAN HEALTH AND SOCIAL WORK ACTIVITIES  &lt;li&gt; &lt;code&gt;R&lt;/code&gt;: ARTS, ENTERTAINMENT AND RECREATION  &lt;li&gt; &lt;code&gt;S&lt;/code&gt;: OTHER SERVICE ACTIVITIES  &lt;li&gt; &lt;code&gt;T&lt;/code&gt;: ACTIVITIES OF HOUSEHOLDS AS EMPLOYERS; UNDIFFERENTIATED GOODS- AND SERVICES-PRODUCING ACTIVITIES OF HOUSEHOLDS FOR OWN USE  &lt;li&gt; &lt;code&gt;U&lt;/code&gt;: ACTIVITIES OF EXTRATERRITORIAL ORGANISATIONS AND BODIES  &lt;li&gt; &lt;code&gt;NONE&lt;/code&gt;: Undefined activity &lt;/ul&gt;
   */
  @JsonAdapter(ActivityEnum.Adapter.class)
  public enum ActivityEnum {
    A("A"),
    
    B("B"),
    
    C("C"),
    
    D("D"),
    
    E("E"),
    
    F("F"),
    
    G("G"),
    
    H("H"),
    
    I("I"),
    
    J("J"),
    
    K("K"),
    
    L("L"),
    
    M("M"),
    
    N("N"),
    
    O("O"),
    
    P("P"),
    
    Q("Q"),
    
    R("R"),
    
    S("S"),
    
    T("T"),
    
    U("U"),
    
    NONE("NONE");

    private String value;

    ActivityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActivityEnum fromValue(String value) {
      for (ActivityEnum b : ActivityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ActivityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActivityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActivityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActivityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACTIVITY = "activity";
  @SerializedName(SERIALIZED_NAME_ACTIVITY)
  private ActivityEnum activity;

  public static final String SERIALIZED_NAME_DATE_OF_CREATION = "dateOfCreation";
  @SerializedName(SERIALIZED_NAME_DATE_OF_CREATION)
  private OffsetDateTime dateOfCreation;

  public static final String SERIALIZED_NAME_DATE_OF_DEPLOYMENT = "dateOfDeployment";
  @SerializedName(SERIALIZED_NAME_DATE_OF_DEPLOYMENT)
  private OffsetDateTime dateOfDeployment;

  public static final String SERIALIZED_NAME_DATE_OF_DEPLOYMENT_REQUEST = "dateOfDeploymentRequest";
  @SerializedName(SERIALIZED_NAME_DATE_OF_DEPLOYMENT_REQUEST)
  private OffsetDateTime dateOfDeploymentRequest;

  /**
   * Environment where the application is deploy
   */
  @JsonAdapter(EnvEnum.Adapter.class)
  public enum EnvEnum {
    NOT_DEPLOYED("not_deployed"),
    
    IN_DEPLOYMENT("in_deployment"),
    
    DEPLOYED("deployed");

    private String value;

    EnvEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnvEnum fromValue(String value) {
      for (EnvEnum b : EnvEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnvEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnvEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnvEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EnvEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private EnvEnum env;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  /**
   * Platform where the application is running
   */
  @JsonAdapter(PlatformEnum.Adapter.class)
  public enum PlatformEnum {
    OFFICIAL("official"),
    
    SANDBOX("sandbox");

    private String value;

    PlatformEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PlatformEnum fromValue(String value) {
      for (PlatformEnum b : PlatformEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PlatformEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlatformEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PlatformEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PlatformEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private PlatformEnum platform;

  /**
   * State of the application
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    NEW("new"),
    
    ACTIVE("active"),
    
    BLOCKED("blocked"),
    
    DELETED("deleted"),
    
    STOPPED("stopped");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  /**
   * Application type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    WEB("web"),
    
    MOBILE("mobile"),
    
    DESKTOP("desktop"),
    
    SERVER("server"),
    
    BOT("bot"),
    
    IOT("iot"),
    
    ADMIN("admin");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;


  public GetBasicLoginSuccessLoggedInApplication activity(ActivityEnum activity) {
    
    this.activity = activity;
    return this;
  }

   /**
   * Application activity &lt;ul&gt;  &lt;li&gt; &lt;code&gt;A&lt;/code&gt;: AGRICULTURE, FORESTRY AND FISHING  &lt;li&gt; &lt;code&gt;B&lt;/code&gt;: MINING AND QUARRYING  &lt;li&gt; &lt;code&gt;C&lt;/code&gt;: MANUFACTURING  &lt;li&gt; &lt;code&gt;D&lt;/code&gt;: ELECTRICITY, GAS, STEAM AND AIR CONDITIONING SUPPLY  &lt;li&gt; &lt;code&gt;E&lt;/code&gt;: WATER SUPPLY; SEWERAGE, WASTE MANAGEMENT AND REMEDIATION ACTIVITIES  &lt;li&gt; &lt;code&gt;F&lt;/code&gt;: CONSTRUCTION  &lt;li&gt; &lt;code&gt;G&lt;/code&gt;: WHOLESALE AND RETAIL TRADE; REPAIR OF MOTOR VEHICLES AND MOTORCYCLES  &lt;li&gt; &lt;code&gt;H&lt;/code&gt;: TRANSPORTATION AND STORAGE  &lt;li&gt; &lt;code&gt;I&lt;/code&gt;: ACCOMMODATION AND FOOD SERVICE ACTIVITIES  &lt;li&gt; &lt;code&gt;J&lt;/code&gt;: INFORMATION AND COMMUNICATION  &lt;li&gt; &lt;code&gt;K&lt;/code&gt;: FINANCIAL AND INSURANCE ACTIVITIES  &lt;li&gt; &lt;code&gt;L&lt;/code&gt;: REAL ESTATE ACTIVITIES  &lt;li&gt; &lt;code&gt;M&lt;/code&gt;: PROFESSIONAL, SCIENTIFIC AND TECHNICAL ACTIVITIES  &lt;li&gt; &lt;code&gt;N&lt;/code&gt;: ADMINISTRATIVE AND SUPPORT SERVICE ACTIVITIES  &lt;li&gt; &lt;code&gt;O&lt;/code&gt;: PUBLIC ADMINISTRATION AND DEFENCE; COMPULSORY SOCIAL SECURITY  &lt;li&gt; &lt;code&gt;P&lt;/code&gt;: EDUCATION  &lt;li&gt; &lt;code&gt;Q&lt;/code&gt;: HUMAN HEALTH AND SOCIAL WORK ACTIVITIES  &lt;li&gt; &lt;code&gt;R&lt;/code&gt;: ARTS, ENTERTAINMENT AND RECREATION  &lt;li&gt; &lt;code&gt;S&lt;/code&gt;: OTHER SERVICE ACTIVITIES  &lt;li&gt; &lt;code&gt;T&lt;/code&gt;: ACTIVITIES OF HOUSEHOLDS AS EMPLOYERS; UNDIFFERENTIATED GOODS- AND SERVICES-PRODUCING ACTIVITIES OF HOUSEHOLDS FOR OWN USE  &lt;li&gt; &lt;code&gt;U&lt;/code&gt;: ACTIVITIES OF EXTRATERRITORIAL ORGANISATIONS AND BODIES  &lt;li&gt; &lt;code&gt;NONE&lt;/code&gt;: Undefined activity &lt;/ul&gt;
   * @return activity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Application activity <ul>  <li> <code>A</code>: AGRICULTURE, FORESTRY AND FISHING  <li> <code>B</code>: MINING AND QUARRYING  <li> <code>C</code>: MANUFACTURING  <li> <code>D</code>: ELECTRICITY, GAS, STEAM AND AIR CONDITIONING SUPPLY  <li> <code>E</code>: WATER SUPPLY; SEWERAGE, WASTE MANAGEMENT AND REMEDIATION ACTIVITIES  <li> <code>F</code>: CONSTRUCTION  <li> <code>G</code>: WHOLESALE AND RETAIL TRADE; REPAIR OF MOTOR VEHICLES AND MOTORCYCLES  <li> <code>H</code>: TRANSPORTATION AND STORAGE  <li> <code>I</code>: ACCOMMODATION AND FOOD SERVICE ACTIVITIES  <li> <code>J</code>: INFORMATION AND COMMUNICATION  <li> <code>K</code>: FINANCIAL AND INSURANCE ACTIVITIES  <li> <code>L</code>: REAL ESTATE ACTIVITIES  <li> <code>M</code>: PROFESSIONAL, SCIENTIFIC AND TECHNICAL ACTIVITIES  <li> <code>N</code>: ADMINISTRATIVE AND SUPPORT SERVICE ACTIVITIES  <li> <code>O</code>: PUBLIC ADMINISTRATION AND DEFENCE; COMPULSORY SOCIAL SECURITY  <li> <code>P</code>: EDUCATION  <li> <code>Q</code>: HUMAN HEALTH AND SOCIAL WORK ACTIVITIES  <li> <code>R</code>: ARTS, ENTERTAINMENT AND RECREATION  <li> <code>S</code>: OTHER SERVICE ACTIVITIES  <li> <code>T</code>: ACTIVITIES OF HOUSEHOLDS AS EMPLOYERS; UNDIFFERENTIATED GOODS- AND SERVICES-PRODUCING ACTIVITIES OF HOUSEHOLDS FOR OWN USE  <li> <code>U</code>: ACTIVITIES OF EXTRATERRITORIAL ORGANISATIONS AND BODIES  <li> <code>NONE</code>: Undefined activity </ul>")

  public ActivityEnum getActivity() {
    return activity;
  }


  public void setActivity(ActivityEnum activity) {
    this.activity = activity;
  }


  public GetBasicLoginSuccessLoggedInApplication dateOfCreation(OffsetDateTime dateOfCreation) {
    
    this.dateOfCreation = dateOfCreation;
    return this;
  }

   /**
   * Application creation date
   * @return dateOfCreation
  **/
  @ApiModelProperty(required = true, value = "Application creation date")

  public OffsetDateTime getDateOfCreation() {
    return dateOfCreation;
  }


  public void setDateOfCreation(OffsetDateTime dateOfCreation) {
    this.dateOfCreation = dateOfCreation;
  }


  public GetBasicLoginSuccessLoggedInApplication dateOfDeployment(OffsetDateTime dateOfDeployment) {
    
    this.dateOfDeployment = dateOfDeployment;
    return this;
  }

   /**
   * Date of deployment of the application.
   * @return dateOfDeployment
  **/
  @ApiModelProperty(required = true, value = "Date of deployment of the application.")

  public OffsetDateTime getDateOfDeployment() {
    return dateOfDeployment;
  }


  public void setDateOfDeployment(OffsetDateTime dateOfDeployment) {
    this.dateOfDeployment = dateOfDeployment;
  }


  public GetBasicLoginSuccessLoggedInApplication dateOfDeploymentRequest(OffsetDateTime dateOfDeploymentRequest) {
    
    this.dateOfDeploymentRequest = dateOfDeploymentRequest;
    return this;
  }

   /**
   * Date of deployment request of the application.
   * @return dateOfDeploymentRequest
  **/
  @ApiModelProperty(required = true, value = "Date of deployment request of the application.")

  public OffsetDateTime getDateOfDeploymentRequest() {
    return dateOfDeploymentRequest;
  }


  public void setDateOfDeploymentRequest(OffsetDateTime dateOfDeploymentRequest) {
    this.dateOfDeploymentRequest = dateOfDeploymentRequest;
  }


  public GetBasicLoginSuccessLoggedInApplication env(EnvEnum env) {
    
    this.env = env;
    return this;
  }

   /**
   * Environment where the application is deploy
   * @return env
  **/
  @ApiModelProperty(required = true, value = "Environment where the application is deploy")

  public EnvEnum getEnv() {
    return env;
  }


  public void setEnv(EnvEnum env) {
    this.env = env;
  }


  public GetBasicLoginSuccessLoggedInApplication id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Application unique identifier
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Application unique identifier")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public GetBasicLoginSuccessLoggedInApplication name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Application name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Application name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetBasicLoginSuccessLoggedInApplication ownerId(String ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Unique identifier of the application owner
   * @return ownerId
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the application owner")

  public String getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public GetBasicLoginSuccessLoggedInApplication platform(PlatformEnum platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Platform where the application is running
   * @return platform
  **/
  @ApiModelProperty(required = true, value = "Platform where the application is running")

  public PlatformEnum getPlatform() {
    return platform;
  }


  public void setPlatform(PlatformEnum platform) {
    this.platform = platform;
  }


  public GetBasicLoginSuccessLoggedInApplication state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * State of the application
   * @return state
  **/
  @ApiModelProperty(required = true, value = "State of the application")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public GetBasicLoginSuccessLoggedInApplication type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Application type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Application type")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBasicLoginSuccessLoggedInApplication getBasicLoginSuccessLoggedInApplication = (GetBasicLoginSuccessLoggedInApplication) o;
    return Objects.equals(this.activity, getBasicLoginSuccessLoggedInApplication.activity) &&
        Objects.equals(this.dateOfCreation, getBasicLoginSuccessLoggedInApplication.dateOfCreation) &&
        Objects.equals(this.dateOfDeployment, getBasicLoginSuccessLoggedInApplication.dateOfDeployment) &&
        Objects.equals(this.dateOfDeploymentRequest, getBasicLoginSuccessLoggedInApplication.dateOfDeploymentRequest) &&
        Objects.equals(this.env, getBasicLoginSuccessLoggedInApplication.env) &&
        Objects.equals(this.id, getBasicLoginSuccessLoggedInApplication.id) &&
        Objects.equals(this.name, getBasicLoginSuccessLoggedInApplication.name) &&
        Objects.equals(this.ownerId, getBasicLoginSuccessLoggedInApplication.ownerId) &&
        Objects.equals(this.platform, getBasicLoginSuccessLoggedInApplication.platform) &&
        Objects.equals(this.state, getBasicLoginSuccessLoggedInApplication.state) &&
        Objects.equals(this.type, getBasicLoginSuccessLoggedInApplication.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activity, dateOfCreation, dateOfDeployment, dateOfDeploymentRequest, env, id, name, ownerId, platform, state, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBasicLoginSuccessLoggedInApplication {\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    dateOfCreation: ").append(toIndentedString(dateOfCreation)).append("\n");
    sb.append("    dateOfDeployment: ").append(toIndentedString(dateOfDeployment)).append("\n");
    sb.append("    dateOfDeploymentRequest: ").append(toIndentedString(dateOfDeploymentRequest)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
