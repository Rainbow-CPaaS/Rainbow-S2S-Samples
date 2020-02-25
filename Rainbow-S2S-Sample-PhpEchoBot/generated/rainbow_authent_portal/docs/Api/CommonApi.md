# Ale\Rainbow\S2S\Client\AuthPortal\CommonApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMetrics**](CommonApi.md#deleteMetrics) | **DELETE** /api/rainbow/metrics | Clear performance metrics
[**getApiRainbowAuthenticationV10About**](CommonApi.md#getApiRainbowAuthenticationV10About) | **GET** /api/rainbow/authentication/v1.0/about | About authentication portal
[**getApiRainbowPing**](CommonApi.md#getApiRainbowPing) | **GET** /api/rainbow/ping | Get authentication portal status report
[**getMetrics**](CommonApi.md#getMetrics) | **GET** /api/rainbow/metrics | Get performance metrics
[**putApiRainbowLogsLevels**](CommonApi.md#putApiRainbowLogsLevels) | **PUT** /api/rainbow/logs/levels | Change log level



## deleteMetrics

> \Ale\Rainbow\S2S\Client\AuthPortal\Model\DeleteMetricsSuccess deleteMetrics($accept)

Clear performance metrics

Clear metrics

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new Ale\Rainbow\S2S\Client\AuthPortal\Api\CommonApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$accept = 'accept_example'; // string | application/json.  Then the result is in JSON format. For other cases the result is in text format.

try {
    $result = $apiInstance->deleteMetrics($accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CommonApi->deleteMetrics: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**| application/json.  Then the result is in JSON format. For other cases the result is in text format. |

### Return type

[**\Ale\Rainbow\S2S\Client\AuthPortal\Model\DeleteMetricsSuccess**](../Model/DeleteMetricsSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## getApiRainbowAuthenticationV10About

> \Ale\Rainbow\S2S\Client\AuthPortal\Model\GetApiRainbowAuthenticationV10AboutSuccess getApiRainbowAuthenticationV10About($accept)

About authentication portal

Get portal information (module name, version)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new Ale\Rainbow\S2S\Client\AuthPortal\Api\CommonApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$accept = 'accept_example'; // string | application/json

try {
    $result = $apiInstance->getApiRainbowAuthenticationV10About($accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CommonApi->getApiRainbowAuthenticationV10About: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**| application/json |

### Return type

[**\Ale\Rainbow\S2S\Client\AuthPortal\Model\GetApiRainbowAuthenticationV10AboutSuccess**](../Model/GetApiRainbowAuthenticationV10AboutSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## getApiRainbowPing

> \Ale\Rainbow\S2S\Client\AuthPortal\Model\GetApiRainbowPingSuccess getApiRainbowPing($accept)

Get authentication portal status report

This API allows to check authentication portal status. <br/> <br/> If no database connection is available, an error 503 Service Unavailable is returned.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new Ale\Rainbow\S2S\Client\AuthPortal\Api\CommonApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$accept = 'accept_example'; // string | application/json

try {
    $result = $apiInstance->getApiRainbowPing($accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CommonApi->getApiRainbowPing: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**| application/json |

### Return type

[**\Ale\Rainbow\S2S\Client\AuthPortal\Model\GetApiRainbowPingSuccess**](../Model/GetApiRainbowPingSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## getMetrics

> \Ale\Rainbow\S2S\Client\AuthPortal\Model\GetMetricsSuccess getMetrics($accept)

Get performance metrics

Get portal performance metrics<br/> <br/> It allows to show Node specific metrics like: <ul>     <li>processCpuTotal</li>     <li>processStartTime</li>     <li>osMemoryHeap</li>     <li>processOpenFileDescriptors</li>     <li>processMaxFileDescriptors</li>     <li>eventLoopLag</li>     <li>processHandles</li>     <li>processRequests</li>     <li>heapSizeAndUsed</li>     <li>heapSpacesSizeAndUsed</li>     <li>version</li> </ul> Node metrics probes are launched every 10 seconds.<br/><br/>  A first custom metric is available to probe portal Rest API performance (an histogram of response time)<br/> <br/> When 'content-type' header field is set to 'application/json', the result is in JSON format. For other cases the result is in text format.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new Ale\Rainbow\S2S\Client\AuthPortal\Api\CommonApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$accept = 'accept_example'; // string | application/json.  Then the result is in  JSON format. For other cases the result is in text format.

try {
    $result = $apiInstance->getMetrics($accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CommonApi->getMetrics: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**| application/json.  Then the result is in  JSON format. For other cases the result is in text format. |

### Return type

[**\Ale\Rainbow\S2S\Client\AuthPortal\Model\GetMetricsSuccess**](../Model/GetMetricsSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## putApiRainbowLogsLevels

> \Ale\Rainbow\S2S\Client\AuthPortal\Model\PutApiRainbowLogsLevelsSuccess putApiRainbowLogsLevels($body)

Change log level

Allow to change the log level of the portal. The requested log level is applied to the requested transports (console, file, syslog, ...)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new Ale\Rainbow\S2S\Client\AuthPortal\Api\CommonApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$body = new \Ale\Rainbow\S2S\Client\AuthPortal\Model\PutApiRainbowLogsLevels(); // \Ale\Rainbow\S2S\Client\AuthPortal\Model\PutApiRainbowLogsLevels | 

try {
    $result = $apiInstance->putApiRainbowLogsLevels($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CommonApi->putApiRainbowLogsLevels: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Ale\Rainbow\S2S\Client\AuthPortal\Model\PutApiRainbowLogsLevels**](../Model/PutApiRainbowLogsLevels.md)|  |

### Return type

[**\Ale\Rainbow\S2S\Client\AuthPortal\Model\PutApiRainbowLogsLevelsSuccess**](../Model/PutApiRainbowLogsLevelsSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)

