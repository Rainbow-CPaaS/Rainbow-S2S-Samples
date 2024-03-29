<?php
/**
 * PutApiRainbowLogsLevels
 *
 * PHP version 5
 *
 * @category Class
 * @package  Ale\Rainbow\S2S\Client\AuthPortal
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Rainbow authentication portal
 *
 * # Rainbow authentication portal API guide  ## Preamble  [Download Postman collection][0]  ### Introduction  This guide describes list of API services that are provided by OT Rainbow authentication portal system. Services are used to manage OT Rainbow authentication.  ### Protocol  REST interface is used for sending/receiving OT rainbow API messages.   HTTP request GET is used. Standard HTTP responses are used to provide requested information or error status. There is no session notion in OT Rainbow system, so requests could be issued according stateless model, without transport conservation between them.   JSON is used as a main format for data encoding in message body part. Each request is started with the following pattern /{module}/{version}/ where {module} is a portal module name to address and {version} is a version of used API, par example, “v1.0”.  ### Security considerations  Each request should contain some credential information to authenticate itself. Standard HTTP authentication with basic/bearer modes is used. JSON Web Token mechanism is used to provide authentication information. JWT has a expire timeout that is controlled by OT Rainbow portal to prevent very long token usage. Also authentication with application token is used. The token must be provided in the request HTTP header, using a custom header: APIKey. At server side, token is verified, and if it doesn’t match, 403 Not Allowed response is sent. TLS is used as a transport protocol to support message exchanges between OT Rainbow portal and an application.    [0]: AuthenticationPortalServer_postman.json
 *
 * The version of the OpenAPI document: 1.104.0
 * 
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 4.2.2
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace Ale\Rainbow\S2S\Client\AuthPortal\Model;

use \ArrayAccess;
use \Ale\Rainbow\S2S\Client\AuthPortal\ObjectSerializer;

/**
 * PutApiRainbowLogsLevels Class Doc Comment
 *
 * @category Class
 * @package  Ale\Rainbow\S2S\Client\AuthPortal
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class PutApiRainbowLogsLevels implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'PutApiRainbowLogsLevels';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'console' => 'string',
        'file' => 'string',
        'syslog' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'console' => null,
        'file' => null,
        'syslog' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'console' => 'console',
        'file' => 'file',
        'syslog' => 'syslog'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'console' => 'setConsole',
        'file' => 'setFile',
        'syslog' => 'setSyslog'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'console' => 'getConsole',
        'file' => 'getFile',
        'syslog' => 'getSyslog'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }

    const CONSOLE_DEBUG = 'debug';
    const CONSOLE_INFO = 'info';
    const CONSOLE_WARN = 'warn';
    const CONSOLE_ERROR = 'error';
    const FILE_DEBUG = 'debug';
    const FILE_INFO = 'info';
    const FILE_WARN = 'warn';
    const FILE_ERROR = 'error';
    const SYSLOG_DEBUG = 'debug';
    const SYSLOG_INFO = 'info';
    const SYSLOG_WARNING = 'warning';
    const SYSLOG_ERROR = 'error';
    

    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getConsoleAllowableValues()
    {
        return [
            self::CONSOLE_DEBUG,
            self::CONSOLE_INFO,
            self::CONSOLE_WARN,
            self::CONSOLE_ERROR,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getFileAllowableValues()
    {
        return [
            self::FILE_DEBUG,
            self::FILE_INFO,
            self::FILE_WARN,
            self::FILE_ERROR,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getSyslogAllowableValues()
    {
        return [
            self::SYSLOG_DEBUG,
            self::SYSLOG_INFO,
            self::SYSLOG_WARNING,
            self::SYSLOG_ERROR,
        ];
    }
    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['console'] = isset($data['console']) ? $data['console'] : null;
        $this->container['file'] = isset($data['file']) ? $data['file'] : null;
        $this->container['syslog'] = isset($data['syslog']) ? $data['syslog'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        $allowedValues = $this->getConsoleAllowableValues();
        if (!is_null($this->container['console']) && !in_array($this->container['console'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'console', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        $allowedValues = $this->getFileAllowableValues();
        if (!is_null($this->container['file']) && !in_array($this->container['file'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'file', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        $allowedValues = $this->getSyslogAllowableValues();
        if (!is_null($this->container['syslog']) && !in_array($this->container['syslog'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'syslog', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets console
     *
     * @return string|null
     */
    public function getConsole()
    {
        return $this->container['console'];
    }

    /**
     * Sets console
     *
     * @param string|null $console Level to set for <strong>console</strong> transport
     *
     * @return $this
     */
    public function setConsole($console)
    {
        $allowedValues = $this->getConsoleAllowableValues();
        if (!is_null($console) && !in_array($console, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'console', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['console'] = $console;

        return $this;
    }

    /**
     * Gets file
     *
     * @return string|null
     */
    public function getFile()
    {
        return $this->container['file'];
    }

    /**
     * Sets file
     *
     * @param string|null $file Level to set for <strong>file</strong> transport
     *
     * @return $this
     */
    public function setFile($file)
    {
        $allowedValues = $this->getFileAllowableValues();
        if (!is_null($file) && !in_array($file, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'file', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['file'] = $file;

        return $this;
    }

    /**
     * Gets syslog
     *
     * @return string|null
     */
    public function getSyslog()
    {
        return $this->container['syslog'];
    }

    /**
     * Sets syslog
     *
     * @param string|null $syslog Level to set for <strong>syslog</strong> transport
     *
     * @return $this
     */
    public function setSyslog($syslog)
    {
        $allowedValues = $this->getSyslogAllowableValues();
        if (!is_null($syslog) && !in_array($syslog, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'syslog', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['syslog'] = $syslog;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


