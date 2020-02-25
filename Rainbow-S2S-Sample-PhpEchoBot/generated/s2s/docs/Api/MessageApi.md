# Ale\Rainbow\S2S\Client\S2S\MessageApi

All URIs are relative to *http://openrainbow.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**messageCreate**](MessageApi.md#messageCreate) | **POST** /api/rainbow/ucs/v1.0/connections/{cnxId}/conversations/{cvId}/messages | Send a new message
[**messageDeleteAll**](MessageApi.md#messageDeleteAll) | **DELETE** /api/rainbow/ucs/v1.0/connections/{cnxId}/conversations/{cvId}/messages | Delete all conversation messages
[**messageIndex**](MessageApi.md#messageIndex) | **GET** /api/rainbow/ucs/v1.0/connections/{cnxId}/conversations/{cvId}/messages | List the messages of a conversation
[**messageReadReceipt**](MessageApi.md#messageReadReceipt) | **PUT** /api/rainbow/ucs/v1.0/connections/{cnxId}/conversations/{cvId}/messages/{id}/read | Send a read receipt
[**messageReceivedReceipt**](MessageApi.md#messageReceivedReceipt) | **PUT** /api/rainbow/ucs/v1.0/connections/{cnxId}/conversations/{cvId}/messages/{id}/received | Send a received receipt



## messageCreate

> \Ale\Rainbow\S2S\Client\S2S\Model\MessageCreateResponse messageCreate($cnx_id, $cv_id, $message_create)

Send a new message

Send a new message to a recipient identified by a conversation Id. **Caution**: prior to sending a message to a room, you will have to 'join' it

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new Ale\Rainbow\S2S\Client\S2S\Api\MessageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$cnx_id = 'cnx_id_example'; // string | Connection id
$cv_id = 'cv_id_example'; // string | Conversation id
$message_create = new \Ale\Rainbow\S2S\Client\S2S\Model\MessageCreate(); // \Ale\Rainbow\S2S\Client\S2S\Model\MessageCreate | Message data

try {
    $result = $apiInstance->messageCreate($cnx_id, $cv_id, $message_create);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MessageApi->messageCreate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cnx_id** | **string**| Connection id |
 **cv_id** | **string**| Conversation id |
 **message_create** | [**\Ale\Rainbow\S2S\Client\S2S\Model\MessageCreate**](../Model/MessageCreate.md)| Message data | [optional]

### Return type

[**\Ale\Rainbow\S2S\Client\S2S\Model\MessageCreateResponse**](../Model/MessageCreateResponse.md)

### Authorization

[Bearer](../../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## messageDeleteAll

> \Ale\Rainbow\S2S\Client\S2S\Model\DeleteAllResponse messageDeleteAll($cnx_id, $cv_id)

Delete all conversation messages

Delete all conversation messages

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new Ale\Rainbow\S2S\Client\S2S\Api\MessageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$cnx_id = 'cnx_id_example'; // string | Connection id
$cv_id = 'cv_id_example'; // string | Conversation id

try {
    $result = $apiInstance->messageDeleteAll($cnx_id, $cv_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MessageApi->messageDeleteAll: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cnx_id** | **string**| Connection id |
 **cv_id** | **string**| Conversation id |

### Return type

[**\Ale\Rainbow\S2S\Client\S2S\Model\DeleteAllResponse**](../Model/DeleteAllResponse.md)

### Authorization

[Bearer](../../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## messageIndex

> \Ale\Rainbow\S2S\Client\S2S\Model\Message[] messageIndex($cnx_id, $cv_id)

List the messages of a conversation

Paginated list the messages of a conversation

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new Ale\Rainbow\S2S\Client\S2S\Api\MessageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$cnx_id = 'cnx_id_example'; // string | Connection id
$cv_id = 'cv_id_example'; // string | Conversation id

try {
    $result = $apiInstance->messageIndex($cnx_id, $cv_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MessageApi->messageIndex: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cnx_id** | **string**| Connection id |
 **cv_id** | **string**| Conversation id |

### Return type

[**\Ale\Rainbow\S2S\Client\S2S\Model\Message[]**](../Model/Message.md)

### Authorization

[Bearer](../../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## messageReadReceipt

> messageReadReceipt($cnx_id, $cv_id, $id)

Send a read receipt

Send a message read receipt

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new Ale\Rainbow\S2S\Client\S2S\Api\MessageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$cnx_id = 'cnx_id_example'; // string | Connection id
$cv_id = 'cv_id_example'; // string | Conversation id
$id = 'id_example'; // string | Message id

try {
    $apiInstance->messageReadReceipt($cnx_id, $cv_id, $id);
} catch (Exception $e) {
    echo 'Exception when calling MessageApi->messageReadReceipt: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cnx_id** | **string**| Connection id |
 **cv_id** | **string**| Conversation id |
 **id** | **string**| Message id |

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


## messageReceivedReceipt

> messageReceivedReceipt($cnx_id, $cv_id, $id)

Send a received receipt

Send a message received receipt

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new Ale\Rainbow\S2S\Client\S2S\Api\MessageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$cnx_id = 'cnx_id_example'; // string | Connection id
$cv_id = 'cv_id_example'; // string | Conversation id
$id = 'id_example'; // string | Message id

try {
    $apiInstance->messageReceivedReceipt($cnx_id, $cv_id, $id);
} catch (Exception $e) {
    echo 'Exception when calling MessageApi->messageReceivedReceipt: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cnx_id** | **string**| Connection id |
 **cv_id** | **string**| Conversation id |
 **id** | **string**| Message id |

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

