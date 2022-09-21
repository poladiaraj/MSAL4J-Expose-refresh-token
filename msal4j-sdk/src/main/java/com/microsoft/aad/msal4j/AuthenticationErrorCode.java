// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.aad.msal4j;

/**
 * Class containing error codes returned by the service or generated by the client
 */
public class AuthenticationErrorCode {

    /**
     * In the context of device code user has not yet authenticated via browser. For more details,
     * see https://aka.ms/msal4j-device-code
     */
    public final static String AUTHORIZATION_PENDING = "authorization_pending";

    /**
     * In the context of device code, this error happens when the device code has expired before
     * the user signed-in on another device (this is usually after 15 min). For more details, see
     * https://aka.ms/msal4j-device-code
     */
    public final static String CODE_EXPIRED = "code_expired";

    /**
     * Standard Oauth2 protocol error code. It indicates that the application needs to expose
     * the UI to the user so that user does an interactive action in order to get a new token.
     */
    public final static String INVALID_GRANT = "invalid_grant";

    /**
     * WS-Trust Endpoint not found in Metadata document
     */
    public final static String WSTRUST_ENDPOINT_NOT_FOUND_IN_METADATA_DOCUMENT = "wstrust_endpoint_not_found";

    /**
     * WS-Trust endpoint response did not contain the required fields
     */
    public final static String WSTRUST_INVALID_RESPONSE = "wstrust_invalid_response";

    /**
     * WS-Trust request resulted in service error
     */
    public final static String WSTRUST_SERVICE_ERROR = "wstrust_service_error";

    /**
     * Password is required for managed user. Will typically happen when trying to do integrated windows authentication
     * for managed users. For more information, see https://aka.ms/msal4j-iwa
     */
    public final static String PASSWORD_REQUIRED_FOR_MANAGED_USER = "password_required_for_managed_user";

    /**
     * User realm discovery failed
     */
    public final static String USER_REALM_DISCOVERY_FAILED = "user_realm_discovery_failed";

    /**
     * Not found in the cache
     */
    public final static String CACHE_MISS = "cache_miss";

    /**
     * Not able to parse instance discovery metadata. Ensure data is in valid JSON format, and that
     * it contains relevant fields. For more information, see https://aka.ms/msal4j-instance-discovery
     */
    public final static String INVALID_INSTANCE_DISCOVERY_METADATA = "invalid_instance_discovery_metadata";

    /**
     * Unknown error occurred
     */
    public final static String UNKNOWN = "unknown";

    /**
     * The current redirect URI is not a loopback URL. To use the OS browser, a loopback URL must be
     * configured both during app registration as well as when initializing the InteractiveRequestParameters
     * object. For more details, see https://aka.ms/msal4j-interactive-request
     */
    public final static String LOOPBACK_REDIRECT_URI = "loopback_redirect_uri";

    /**
     * Unable to start Http listener to the specified port. This might be because the port is busy.
     */
    public final static String UNABLE_TO_START_HTTP_LISTENER = "unable_to_start_http_listener";

    /**
     * Authorization result response is invalid. Authorization result must contain authorization
     * code and state.
     */
    public final static String INVALID_AUTHORIZATION_RESULT = "invalid_authorization_result";

    /**
     * Redirect URI provided to MSAL is of invalid format. Redirect URL must be a loopback URL.
     * For more details, see https://aka.ms/msal4j-interactive-request
     */
    public final static String INVALID_REDIRECT_URI = "invalid_redirect_uri";

    /**
     * MSAL was unable to open the user-default browser. This is either because the current platform
     * does not support {@link java.awt.Desktop} or {@link java.awt.Desktop.Action#BROWSE}. Interactive
     * requests require that the client have a system default browser. For more details, see
     * https://aka.ms/msal4j-interactive-request
     */
    public final static String DESKTOP_BROWSER_NOT_SUPPORTED = "desktop_browser_not_supported";

    /**
     * Request was throttled according to instructions from STS.
     */
    public final static String THROTTLED_REQUEST = "throttled_request";

    /**
     * A JSON processing failure, indicating the JSON provided to MSAL is of invalid format.
     */
    public final static String INVALID_JSON = "invalid_json";

    /**
     * A JWT parsing failure, indicating the JWT provided to MSAL is of invalid format.
     */
    public final static String INVALID_JWT = "invalid_jwt";
    /**
     * Indicates that a Broker implementation is missing from the device, such as when an app developer
     * does not include one of our broker packages as a dependency in their project, or otherwise cannot
     * be accessed by MSAL Java
     *
     * TODO: link to repository wiki page describing this more and how to fix
     */
    public final static String MISSING_BROKER = "missing_broker";
}
