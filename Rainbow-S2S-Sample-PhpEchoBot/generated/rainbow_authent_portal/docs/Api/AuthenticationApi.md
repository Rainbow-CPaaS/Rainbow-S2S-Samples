# Ale\Rainbow\S2S\Client\AuthPortal\AuthenticationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApiRainbowAuthenticationV10Validator**](AuthenticationApi.md#getApiRainbowAuthenticationV10Validator) | **GET** /api/rainbow/authentication/v1.0/validator | Validate user JWT
[**getBasicLogin**](AuthenticationApi.md#getBasicLogin) | **GET** /api/rainbow/authentication/v1.0/login | Login user
[**getLogout**](AuthenticationApi.md#getLogout) | **GET** /api/rainbow/authentication/v1.0/logout | Logout user
[**getRenew**](AuthenticationApi.md#getRenew) | **GET** /api/rainbow/authentication/v1.0/renew | Renew user JWT



## getApiRainbowAuthenticationV10Validator

> \Ale\Rainbow\S2S\Client\AuthPortal\Model\GetApiRainbowAuthenticationV10ValidatorSuccess getApiRainbowAuthenticationV10Validator($accept)

Validate user JWT

This API allows to get a validation status on a token.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = Ale\Rainbow\S2S\Client\AuthPortal\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Ale\Rainbow\S2S\Client\AuthPortal\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new Ale\Rainbow\S2S\Client\AuthPortal\Api\AuthenticationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$accept = 'accept_example'; // string | application/json

try {
    $result = $apiInstance->getApiRainbowAuthenticationV10Validator($accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthenticationApi->getApiRainbowAuthenticationV10Validator: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**| application/json |

### Return type

[**\Ale\Rainbow\S2S\Client\AuthPortal\Model\GetApiRainbowAuthenticationV10ValidatorSuccess**](../Model/GetApiRainbowAuthenticationV10ValidatorSuccess.md)

### Authorization

[Bearer](../../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## getBasicLogin

> \Ale\Rainbow\S2S\Client\AuthPortal\Model\GetBasicLoginSuccess getBasicLogin($x_rainbow_app_auth, $accept, $x_rainbow_client, $x_rainbow_client_version)

Login user

This API allows Rainbow users to login. <br/> <br/> Application is also authenticated during the user login. <br/> <br/> If login is successful, the API returns a <b>JSON Web Token</b> (<abbr title=\"JSON Web Token\">JWT</abbr>) which has to be provided by clients for all Rainbow APIs requiring user authentication: <ul>     <li>The JWT is valid only for a given time period.</li>     <li>The JWT can be renewed a few times using API <a href=\"#api-authentication-GetRenew\">GET /api/rainbow/authentication/v1.0/renew</a>.</li>     <li>The maximum number of renew is given in the JWT payload, as well as the current number of time the token has been renewed (see below).</li>     <li>Once the JWT expired, or if the maximum of token renew has been reached, user must login again using this API.</li> </ul> The JWT returned contains the following data in payload: <pre><code class=\"language-json\">{       \"countRenewed\": 0,  // Number of times the token has been renewed       \"maxTokenRenew\": 5,  // Number of times the token can be renewed       \"user\": {           \"id\": \"572756967bfbca0d0e09a6b4\",  // Logged in user id           \"loginEmail\": \"user@company.com\"  // Logged in user loginEmail       },       \"app\": {           \"id\": \"598983029db9b5b14693a6f0\",  // Application id used for the authentication           \"name\": \"My App\"  // Application name       },       \"iat\": 1463588327,  // (Issued At) Time at which the JWT was issued       \"exp\": 2183588327  // (Expiration Time) Expiration time after which the JWT won't be accepted }</code></pre> <br/> <br/> If login / password combination is wrong, an error 401 is return. <br/> If appId / appSecret combination is wrong, an error 401 is return. <br/>The following login protection is implemented: <ul>     <li>After a given number of login failure (5 by default), the user account is <b>locked</b> for a given time period (60 min by default).</li>     <li>As long as the maximum number of login failure has not been reached, a 401 error with errorDetailsCode <code>401500</code> is returned.</li>     <li>Once the maximum number of login attempts has been reached, a 401 error with errorDetailsCode <code>401501</code> is returned: the user account is locked for the given time period.</li>     <li>While the user account is locked, the same response with errorDetailsCode <code>401501</code> will be returned for each new login attempt for this user account     (even if a good login / password combination is provided). If the login / password combination is wrong, the locked time period restarts from this new wrong attempt.</li>     <li>Once the locked time period is over, a login with the good credentials will be allowed.</li>     <li>While the account is locked, the user can reset his password. In that case, his account will be unlocked and he will be able to login with his new password.</li>     <li>While the account is locked, a superadmin / support / admin (organisation or company level) user can set a new password for this account. In that case, this account will be unlocked     and the user will be able to login with this new password.</li> </ul> <dl>     <dt>Warning</dt>     <dd>login url is case sensitive (lowercase). For example, /Login or /LOGIN won't work.</dd>     <dd>login will be forbidden for a certain delay if too much consecutive wrong password errors occurs, after this user has to request a password change or just wait (see implementation details above).</dd> </dl> <br/>

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure HTTP basic authorization: Basic
$config = Ale\Rainbow\S2S\Client\AuthPortal\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new Ale\Rainbow\S2S\Client\AuthPortal\Api\AuthenticationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$x_rainbow_app_auth = 'x_rainbow_app_auth_example'; // string | Basic <base64encode(appId:sha256(appSecretuserPassword))> (concatenation of appSecret and userPassword, hashed with sha256)
$accept = 'accept_example'; // string | application/json
$x_rainbow_client = 'x_rainbow_client_example'; // string | the app used
$x_rainbow_client_version = 'x_rainbow_client_version_example'; // string | 1.10.7

try {
    $result = $apiInstance->getBasicLogin($x_rainbow_app_auth, $accept, $x_rainbow_client, $x_rainbow_client_version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthenticationApi->getBasicLogin: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_rainbow_app_auth** | **string**| Basic &lt;base64encode(appId:sha256(appSecretuserPassword))&gt; (concatenation of appSecret and userPassword, hashed with sha256) |
 **accept** | **string**| application/json |
 **x_rainbow_client** | **string**| the app used | [optional]
 **x_rainbow_client_version** | **string**| 1.10.7 | [optional]

### Return type

[**\Ale\Rainbow\S2S\Client\AuthPortal\Model\GetBasicLoginSuccess**](../Model/GetBasicLoginSuccess.md)

### Authorization

[Basic](../../README.md#Basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## getLogout

> \Ale\Rainbow\S2S\Client\AuthPortal\Model\GetLogoutSuccess getLogout($accept)

Logout user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = Ale\Rainbow\S2S\Client\AuthPortal\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Ale\Rainbow\S2S\Client\AuthPortal\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new Ale\Rainbow\S2S\Client\AuthPortal\Api\AuthenticationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$accept = 'accept_example'; // string | application/json

try {
    $result = $apiInstance->getLogout($accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthenticationApi->getLogout: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**| application/json |

### Return type

[**\Ale\Rainbow\S2S\Client\AuthPortal\Model\GetLogoutSuccess**](../Model/GetLogoutSuccess.md)

### Authorization

[Bearer](../../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## getRenew

> \Ale\Rainbow\S2S\Client\AuthPortal\Model\GetRenewSuccess getRenew($accept)

Renew user JWT

This API allows Rainbow users to renew their JSON Web Token (<abbr title=\"JSON Web Token\">JWT</abbr>), thus extending the expiration date of their current JWT. <br/> <br/> This API requires user to be authenticated with a valid non expired JWT. <br/> If so, a new JWT is returned, with the expiration date starting from now. <br/> <br/> <b>Warning:</b> The JWT can only be renewed a given number of times, after this user has to login again to get a new token using API <a href=\"#api-authentication-GetLogin\">GET /api/rainbow/authentication/v1.0/login</a>. <br/> The maximum number of renew is given in the JWT, as well as the current number of time the token has been renewed.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = Ale\Rainbow\S2S\Client\AuthPortal\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Ale\Rainbow\S2S\Client\AuthPortal\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new Ale\Rainbow\S2S\Client\AuthPortal\Api\AuthenticationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$accept = 'accept_example'; // string | application/json

try {
    $result = $apiInstance->getRenew($accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthenticationApi->getRenew: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**| application/json |

### Return type

[**\Ale\Rainbow\S2S\Client\AuthPortal\Model\GetRenewSuccess**](../Model/GetRenewSuccess.md)

### Authorization

[Bearer](../../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)

