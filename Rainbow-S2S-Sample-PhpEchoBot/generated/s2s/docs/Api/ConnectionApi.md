# Ale\Rainbow\S2S\Client\S2S\ConnectionApi

All URIs are relative to *http://openrainbow.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**connectionCreate**](ConnectionApi.md#connectionCreate) | **POST** /api/rainbow/ucs/v1.0/connections | Create a new user connection
[**connectionDelete**](ConnectionApi.md#connectionDelete) | **DELETE** /api/rainbow/ucs/v1.0/connections/{id} | Delete a connection
[**connectionIndex**](ConnectionApi.md#connectionIndex) | **GET** /api/rainbow/ucs/v1.0/connections | List all user connections
[**connectionShow**](ConnectionApi.md#connectionShow) | **GET** /api/rainbow/ucs/v1.0/connections/{id} | Get the data of a connection



## connectionCreate

> \Ale\Rainbow\S2S\Client\S2S\Model\ConnectionCreateResponse connectionCreate($connection_create)

Create a new user connection

Create a new user connection. NOTE: If a connection with a same 'resource' or 'callback_url' already exists for a given user, this connection is reused. In such a case, the 'callback_url' may be updated

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new Ale\Rainbow\S2S\Client\S2S\Api\ConnectionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$connection_create = new \Ale\Rainbow\S2S\Client\S2S\Model\ConnectionCreate(); // \Ale\Rainbow\S2S\Client\S2S\Model\ConnectionCreate | Connection creation data

try {
    $result = $apiInstance->connectionCreate($connection_create);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConnectionApi->connectionCreate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connection_create** | [**\Ale\Rainbow\S2S\Client\S2S\Model\ConnectionCreate**](../Model/ConnectionCreate.md)| Connection creation data | [optional]

### Return type

[**\Ale\Rainbow\S2S\Client\S2S\Model\ConnectionCreateResponse**](../Model/ConnectionCreateResponse.md)

### Authorization

[Bearer](../../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## connectionDelete

> connectionDelete($id)

Delete a connection

Delete a connection

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new Ale\Rainbow\S2S\Client\S2S\Api\ConnectionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = 'id_example'; // string | Connection id

try {
    $apiInstance->connectionDelete($id);
} catch (Exception $e) {
    echo 'Exception when calling ConnectionApi->connectionDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| Connection id |

### Return type

void (empty response body)

### Authorization

[Bearer](../../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## connectionIndex

> \Ale\Rainbow\S2S\Client\S2S\Model\Connections connectionIndex()

List all user connections

List all user connections

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new Ale\Rainbow\S2S\Client\S2S\Api\ConnectionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->connectionIndex();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConnectionApi->connectionIndex: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\Ale\Rainbow\S2S\Client\S2S\Model\Connections**](../Model/Connections.md)

### Authorization

[Bearer](../../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## connectionShow

> \Ale\Rainbow\S2S\Client\S2S\Model\Connection connectionShow($id)

Get the data of a connection

Get the data of a connection

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new Ale\Rainbow\S2S\Client\S2S\Api\ConnectionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = 'id_example'; // string | Connection id

try {
    $result = $apiInstance->connectionShow($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConnectionApi->connectionShow: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| Connection id |

### Return type

[**\Ale\Rainbow\S2S\Client\S2S\Model\Connection**](../Model/Connection.md)

### Authorization

[Bearer](../../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)

