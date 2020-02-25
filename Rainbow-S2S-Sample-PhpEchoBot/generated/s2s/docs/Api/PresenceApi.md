# Ale\Rainbow\S2S\Client\S2S\PresenceApi

All URIs are relative to *http://openrainbow.com:443*

Method | HTTP request | Description
------------- | ------------- | -------------
[**presenceShow**](PresenceApi.md#presenceShow) | **GET** /api/rainbow/ucs/v1.0/connections/{cnxId}/presences/{userId} | Probe a user&#39;s presence
[**presenceUpdate**](PresenceApi.md#presenceUpdate) | **PUT** /api/rainbow/ucs/v1.0/connections/{cnxId}/presences | Set the user&#39;s presence



## presenceShow

> \Ale\Rainbow\S2S\Client\S2S\Model\Presence presenceShow($cnx_id, $user_id)

Probe a user's presence

Probe a user's presence

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new Ale\Rainbow\S2S\Client\S2S\Api\PresenceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$cnx_id = 'cnx_id_example'; // string | Connection id
$user_id = 'user_id_example'; // string | User id

try {
    $result = $apiInstance->presenceShow($cnx_id, $user_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PresenceApi->presenceShow: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cnx_id** | **string**| Connection id |
 **user_id** | **string**| User id |

### Return type

[**\Ale\Rainbow\S2S\Client\S2S\Model\Presence**](../Model/Presence.md)

### Authorization

[Bearer](../../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## presenceUpdate

> presenceUpdate($cnx_id, $presence_update)

Set the user's presence

A user presence preference could be managed with the following API :  **_/api/rainbow/enduser/v1.0/users/{userId}/settings**  The mapping between this presence setting and the **show/status** fields of the presence stanza is show here :  | setting   | show | status    | | --------- | ---- | --------- | | away      | xa   | away      | | invisible | xa   | n/a       |  | dnd       | dnd  | n/a       |  | online    | n/a  | mode=auto |   Moreover, the Rainbow webclient sends presence stanzas with the following **show/status** fields to show user (keyboard/focus) state :  | state    | show | status | | -------- | ---- | ------ | | inactive | away | n/a    | | active   | n/a  | n/a    |

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Ale\Rainbow\S2S\Client\S2S\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new Ale\Rainbow\S2S\Client\S2S\Api\PresenceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$cnx_id = 'cnx_id_example'; // string | Connection id
$presence_update = new \Ale\Rainbow\S2S\Client\S2S\Model\PresenceUpdate(); // \Ale\Rainbow\S2S\Client\S2S\Model\PresenceUpdate | Presence data

try {
    $apiInstance->presenceUpdate($cnx_id, $presence_update);
} catch (Exception $e) {
    echo 'Exception when calling PresenceApi->presenceUpdate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cnx_id** | **string**| Connection id |
 **presence_update** | [**\Ale\Rainbow\S2S\Client\S2S\Model\PresenceUpdate**](../Model/PresenceUpdate.md)| Presence data | [optional]

### Return type

void (empty response body)

### Authorization

[Bearer](../../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)

