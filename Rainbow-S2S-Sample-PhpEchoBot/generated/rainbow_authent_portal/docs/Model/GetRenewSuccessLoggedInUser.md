# # GetRenewSuccessLoggedInUser

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activation_date** | [**\DateTime**](\DateTime.md) | User activation date | 
**admin_type** | **string** | In case of user&#39;s is &#39;admin&#39;, define the subtype (organisation_admin, company_admin, site_admin (default undefined) | 
**company_id** | **string** | User company unique identifier | 
**company_name** | **string** | User company name | 
**country** | **string** | User country (ISO 3166-1 alpha3 format) | 
**created_by_admin** | [**\Ale\Rainbow\S2S\Client\AuthPortal\Model\GetBasicLoginSuccessLoggedInUserCreatedByAdmin**](GetBasicLoginSuccessLoggedInUserCreatedByAdmin.md) |  | [optional] 
**created_by_self_register** | **bool** | true if user has been created using self register | 
**creation_date** | [**\DateTime**](\DateTime.md) | User creation date | 
**display_name** | **string** | User display name (firstName + lastName concatenated on server side) | 
**emails** | [**\Ale\Rainbow\S2S\Client\AuthPortal\Model\GetRenewSuccessEmails[]**](GetRenewSuccessEmails.md) | Array of user emails addresses objects | 
**first_login_date** | [**\DateTime**](\DateTime.md) | Date of first user login (only set the first time user logs in, null if user never logged in) | 
**first_name** | **string** | User first name | 
**guest_mode** | **bool** | Indicated a user embedded in a chat or conference room, as guest, with limited rights until he finalizes his registration. | 
**id** | **string** | User unique identifier | 
**initialization_date** | [**\DateTime**](\DateTime.md) | User initialization date | 
**invited_by** | [**\Ale\Rainbow\S2S\Client\AuthPortal\Model\GetBasicLoginSuccessLoggedInUserCreatedByAdmin**](GetBasicLoginSuccessLoggedInUserCreatedByAdmin.md) |  | [optional] 
**is_ad_search_available** | **bool** | Is ActiveDirectory (Office365) search available for this user | 
**is_active** | **bool** | Is user active | 
**is_in_default_company** | **bool** | Is user in default company | 
**is_initialized** | **bool** | Is user initialized | 
**is_terminated** | **bool** | Indicates if the Rainbow account of this user has been deleted | 
**jid_im** | **string** | User Jabber IM identifier | 
**jid_password** | **string** | User Jabber TEL identifier | 
**jid_tel** | **string** | User Jabber TEL identifier | 
**job_title** | **string** | User job title | [optional] 
**language** | **string** | User language (ISO 639-1 code format, with possibility of regional variation. Ex: both &#39;en&#39; and &#39;en-US&#39; are supported) | [optional] 
**last_avatar_update_date** | [**\DateTime**](\DateTime.md) | Date of last user avatar create/update, null if no avatar | 
**last_login_date** | [**\DateTime**](\DateTime.md) | Date of last user login (defined even if user is logged out) | 
**last_name** | **string** | User last name | 
**last_update_date** | [**\DateTime**](\DateTime.md) | Date of last user update (whatever the field updated) | 
**logged_since** | [**\DateTime**](\DateTime.md) | Date of last user login (null if user is logged out) | 
**login_email** | **string** | User email address (used for login) | 
**nick_name** | **string** | User nickName | [optional] 
**organisation_id** | **string** | In addition to User companyId, optional identifier to indicate the user belongs also to an organization | 
**phone_numbers** | [**\Ale\Rainbow\S2S\Client\AuthPortal\Model\GetRenewSuccessPhoneNumbers[]**](GetRenewSuccessPhoneNumbers.md) | Array of user phone numbers objects. &lt;br/&gt; Phone number objects can: &lt;ul&gt;     &lt;li&gt; be created by user (information filled by user),&lt;/li&gt;     &lt;li&gt; come from association with a system (pbx) device (association is done by admin).&lt;/li&gt; &lt;/ul&gt; | 
**profiles** | [**\Ale\Rainbow\S2S\Client\AuthPortal\Model\GetRenewSuccessProfiles[]**](GetRenewSuccessProfiles.md) | User profile Objects. | 
**roles** | **string[]** | List of user roles (Array of String) | 
**site_id** | **string** | In addition to User companyId, optional identifier to indicate the user belongs also to a site | 
**tags** | **string[]** | An Array of free tags associated to the user. &lt;br/&gt; A maximum of 5 tags is allowed, each tag can have a maximum length of 64 characters. &lt;br/&gt; &#x60;tags&#x60; can only be set by users who have administrator rights on the user. The user can&#39;t modify the tags. &lt;br/&gt; The tags are visible by the user and all users belonging to his organisation/company, and can be used with the search API to search the user based on his tags. | [optional] 
**time_to_live** | **float** | Duration in second to wait before automatically starting a user deletion from the creation date. &lt;br/&gt; Once the timeToLive has been reached, the user won&#39;t be usable to use APIs anymore (error 401523). His account may then be deleted from the database at any moment. &lt;br/&gt; Value -1 means timeToLive is disable (i.e. user account will not expire). | [optional] 
**timezone** | **string** | User timezone name | [optional] 
**title** | **string** | User title (honorifics title, like Mr, Mrs, Sir, Lord, Lady, Dr, Prof,...) | [optional] 
**user_info1** | **string** | Free field that admin can use to link their users to their IS/IT tools / to perform analytics (this field is output in the CDR file) | [optional] 
**user_info2** | **string** | 2nd Free field that admin can use to link their users to their IS/IT tools / to perform analytics (this field is output in the CDR file) | [optional] 
**visibility** | **string** | User visibility &lt;/br&gt; Define if the user can be searched by users being in other companies and if the user can search users being in other companies. &lt;br/&gt; Visibility can be: - &#x60;same_than_company&#x60;: The same visibility than the user&#39;s company&#39;s is applied to the user. When this user visibility is used, if the visibility of the company is changed the user&#39;s visibility will use this company new visibility. - &#x60;public&#x60;: User can be searched by external users / can search external users. User can invite external users / can be invited by external users - &#x60;private&#x60;: User **can&#39;t** be searched by external users / can search external users. User can invite external users / can be invited by external users - &#x60;closed&#x60;: User **can&#39;t** be searched by external users / **can&#39;t** search external users. User can invite external users / can be invited by external users - &#x60;isolated&#x60;: User **can&#39;t** be searched by external users / **can&#39;t** search external users. User **can&#39;t** invite external users / **can&#39;t** be invited by external users - &#x60;none&#x60;:  Default value reserved for guest. User **can&#39;t** be searched by **any users** (even within the same company) / can search external users. User can invite external users / can be invited by external users  External users mean public user not being in user&#39;s company nor user&#39;s organisation nor a company visible by user&#39;s company. | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)


