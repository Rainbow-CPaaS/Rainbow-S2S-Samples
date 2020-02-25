# # GetLoginUrlSuccessData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorization_endpoint** | **string** | OIDC provider&#39;s authorization endpoint &lt;br/&gt; Only returned if &#x60;type&#x60; is &#x60;OIDC&#x60;. | 
**client_id** | **string** | client_id used for Rainbow application in OIDC provider &lt;br/&gt; Only returned if &#x60;type&#x60; is &#x60;OIDC&#x60;. | 
**discovery_url** | **string** | OIDC provider&#39;s discoveryUrl &lt;br/&gt; Only returned if &#x60;type&#x60; is &#x60;OIDC&#x60;. | [optional] 
**issuer** | **string** | OIDC provider&#39;s Issuer Identifier &lt;br/&gt; Only returned if &#x60;type&#x60; is &#x60;OIDC&#x60;. | 
**jwks_uri** | **string** | OIDC provider&#39;s jwks_uri &lt;br/&gt; Only returned if &#x60;type&#x60; is &#x60;OIDC&#x60;. &lt;br/&gt; This setting is used to retrieve the OIDC provider&#39;s signing key(s) in order to validate the id_token&#39;s signature. | [optional] 
**login_url** | **string** | URL to use to perform a login. &lt;br/&gt; Not returned if authentication type is OIDC with &#x60;onlyUseImplicitFlow&#x60;&#x3D;true | 
**logout_url** | **string** | URL to use to perform a logout. | 
**only_use_implicit_flow** | **bool** | Indicates if configuration allows to use only OIDC implicit flow. &lt;br/&gt; Only returned if &#x60;type&#x60; is &#x60;OIDC&#x60;. &lt;br/&gt; If onlyUseImplicitFlow is set to true, &#x60;loginUrl&#x60; is not returned. &lt;br/&gt;&lt;br/&gt; Implicit flow can be used instead of authorization code grant implemented by Rainbow APIs, but in that case implicit flow has to be implemented by the client. The id_token retrieved by the client using implicit flow can then be used to get a Rainbow token using API GET /api/rainbow/authentication/v1.0/oidc-client/jwt. | 
**type** | **string** | Authentication type. | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)


