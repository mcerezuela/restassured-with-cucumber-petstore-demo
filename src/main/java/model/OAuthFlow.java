package model;

import java.util.Map;

/**
 * Configuration details for a supported OAuth Flow
 */
public class OAuthFlow {

    /**
     * REQUIRED. The authorization URL to be used for this flow. This MUST be in the form of a URL.
     */
    private String authorizationUrl;

    /**
     * REQUIRED. The token URL to be used for this flow. This MUST be in the form of a URL.
     */
    private String tokenUrl;

    /**
     * The URL to be used for obtaining refresh tokens. This MUST be in the form of a URL.
     */
    private String refreshUrl;

    /**
     * REQUIRED. The available scopes for the OAuth2 security scheme. A map between the scope name and a short description for it. The map MAY be empty.
     */
    private Map<String, String> scopes;

    public String getAuthorizationUrl() {
        return authorizationUrl;
    }

    public void setAuthorizationUrl(String authorizationUrl) {
        this.authorizationUrl = authorizationUrl;
    }

    public String getTokenUrl() {
        return tokenUrl;
    }

    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }

    public String getRefreshUrl() {
        return refreshUrl;
    }

    public void setRefreshUrl(String refreshUrl) {
        this.refreshUrl = refreshUrl;
    }

    public Map<String, String> getScopes() {
        return scopes;
    }

    public void setScopes(Map<String, String> scopes) {
        this.scopes = scopes;
    }
}
