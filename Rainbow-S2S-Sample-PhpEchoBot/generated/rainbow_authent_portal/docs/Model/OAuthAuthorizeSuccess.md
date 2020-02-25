# # OAuthAuthorizeSuccess

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_token** | **string** | The access token generated by Rainbow authentication server. &lt;br/&gt; Only returned if &#x60;&#x60;&#x60;Implicit&#x60;&#x60;&#x60; grant is used. &lt;br/&gt; &lt;br/&gt; The access token can be used by the application to use Rainbow APIs. | [optional] 
**code** | **string** | The authorization code generated by Rainbow authentication server. &lt;br/&gt; Only returned if &#x60;&#x60;&#x60;Authorization Code&#x60;&#x60;&#x60; grant is used. | 
**expires_in** | **float** | Lifetime in seconds of the access token. &lt;br/&gt; Only returned if &#x60;&#x60;&#x60;Implicit&#x60;&#x60;&#x60; grant is used. &lt;br/&gt; &lt;br/&gt; Once the access token has expired, the application can no longer use it to use Rainbow APIs (it has to request again user authorization with Implicit grant to retrieve a new access token) | [optional] 
**state** | **string** | The state provided by the application to GET /api/rainbow/authentication/v1.0/oauth/authorize endpoint. &lt;br/&gt; Only returned if &#x60;&#x60;&#x60;Authorization Code&#x60;&#x60;&#x60; grant is used. &lt;br/&gt; &lt;br/&gt; To be exchanged against an access token and a refresh token using /oauth/token endpoint (see related &lt;a href&#x3D;\&quot;#api-OAuth_Authentication-OAuthToken\&quot;&gt;documentation&lt;/a&gt;). &lt;br/&gt; Authorization code lifetime is 10 minutes and it can be used only once. | 
**token_type** | **string** | Type of the token returned by Rainbow authentication server. &lt;br/&gt; Only returned if &#x60;&#x60;&#x60;Implicit&#x60;&#x60;&#x60; grant is used. &lt;br/&gt; &lt;br/&gt; It will always be \&quot;access_token\&quot; for Implicit grant. (it has to request again user authorization with Implicit grant to retrieve a new access token) | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

