# Ale\Rainbow\S2S\Client\S2S\ConversationApi

All URIs are relative to *http://openrainbow.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversationChatstate**](ConversationApi.md#conversationChatstate) | **PUT** /api/rainbow/ucs/v1.0/connections/{cnxId}/conversations/{cvId}/chatstate/{state} | Send a chat state
[**conversationCreate**](ConversationApi.md#conversationCreate) | **POST** /api/rainbow/ucs/v1.0/connections/{cnxId}/conversations | Create a conversation
[**conversationDelete**](ConversationApi.md#conversationDelete) | **DELETE** /api/rainbow/ucs/v1.0/connections/{cnxId}/conversations/{id} | Delete a conversation
[**conversationIndex**](ConversationApi.md#conversationIndex) | **GET** /api/rainbow/ucs/v1.0/connections/{cnxId}/conversations | Get all conversations
[**conversationShow**](ConversationApi.md#conversationShow) | **GET** /api/rainbow/ucs/v1.0/connections/{cnxId}/conversations/{id} | Get a conversation



## conversationChatstate

> conversationChatstate($cnx_id, $cv_id, $state)

Send a chat state

Send a conversation state

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new Ale\Rainbow\S2S\Client\S2S\Api\ConversationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$cnx_id = 'cnx_id_example'; // string | Connection id
$cv_id = 'cv_id_example'; // string | Conversation id
$state = 'state_example'; // string | Chatstate value

try {
    $apiInstance->conversationChatstate($cnx_id, $cv_id, $state);
} catch (Exception $e) {
    echo 'Exception when calling ConversationApi->conversationChatstate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cnx_id** | **string**| Connection id |
 **cv_id** | **string**| Conversation id |
 **state** | **string**| Chatstate value |

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


## conversationCreate

> \Ale\Rainbow\S2S\Client\S2S\Model\Conversation conversationCreate($cnx_id, $conversation_create)

Create a conversation

Create a conversation

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new Ale\Rainbow\S2S\Client\S2S\Api\ConversationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$cnx_id = 'cnx_id_example'; // string | Connection id
$conversation_create = new \Ale\Rainbow\S2S\Client\S2S\Model\ConversationCreate(); // \Ale\Rainbow\S2S\Client\S2S\Model\ConversationCreate | Conversation data

try {
    $result = $apiInstance->conversationCreate($cnx_id, $conversation_create);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversationApi->conversationCreate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cnx_id** | **string**| Connection id |
 **conversation_create** | [**\Ale\Rainbow\S2S\Client\S2S\Model\ConversationCreate**](../Model/ConversationCreate.md)| Conversation data | [optional]

### Return type

[**\Ale\Rainbow\S2S\Client\S2S\Model\Conversation**](../Model/Conversation.md)

### Authorization

[Bearer](../../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## conversationDelete

> conversationDelete($cnx_id, $id)

Delete a conversation

Delete a conversation

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new Ale\Rainbow\S2S\Client\S2S\Api\ConversationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$cnx_id = 'cnx_id_example'; // string | Connection id
$id = 'id_example'; // string | Conversation id

try {
    $apiInstance->conversationDelete($cnx_id, $id);
} catch (Exception $e) {
    echo 'Exception when calling ConversationApi->conversationDelete: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cnx_id** | **string**| Connection id |
 **id** | **string**| Conversation id |

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


## conversationIndex

> \Ale\Rainbow\S2S\Client\S2S\Model\Conversations conversationIndex($cnx_id)

Get all conversations

Get all conversations

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new Ale\Rainbow\S2S\Client\S2S\Api\ConversationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$cnx_id = 'cnx_id_example'; // string | Connection id

try {
    $result = $apiInstance->conversationIndex($cnx_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversationApi->conversationIndex: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cnx_id** | **string**| Connection id |

### Return type

[**\Ale\Rainbow\S2S\Client\S2S\Model\Conversations**](../Model/Conversations.md)

### Authorization

[Bearer](../../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## conversationShow

> \Ale\Rainbow\S2S\Client\S2S\Model\Conversation conversationShow($cnx_id, $id)

Get a conversation

Get a conversation

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new Ale\Rainbow\S2S\Client\S2S\Api\ConversationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$cnx_id = 'cnx_id_example'; // string | Connection id
$id = 'id_example'; // string | Conversation id

try {
    $result = $apiInstance->conversationShow($cnx_id, $id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversationApi->conversationShow: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cnx_id** | **string**| Connection id |
 **id** | **string**| Conversation id |

### Return type

[**\Ale\Rainbow\S2S\Client\S2S\Model\Conversation**](../Model/Conversation.md)

### Authorization

[Bearer](../../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)

