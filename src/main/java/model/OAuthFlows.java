package model;

/**
 * Allows configuration of the supported OAuth Flows.
 */
public class OAuthFlows {
    /**
     * Configuration for the OAuth Implicit flow
     */
    private OAuthFlow implicit;

    /**
     * Configuration for the OAuth Resource Owner Password flow
     */
    private OAuthFlow password;

    /**
     * Configuration for the OAuth Client Credentials flow. Previously called application in OpenAPI 2.0.
     */
    private OAuthFlow clientCredentials;

    /**
     * Configuration for the OAuth Authorization Code flow. Previously called accessCode in OpenAPI 2.0.
     */
    private OAuthFlow authorizationCode;

    public OAuthFlow getImplicit() {
        return implicit;
    }

    public void setImplicit(OAuthFlow implicit) {
        this.implicit = implicit;
    }

    public OAuthFlow getPassword() {
        return password;
    }

    public void setPassword(OAuthFlow password) {
        this.password = password;
    }

    public OAuthFlow getClientCredentials() {
        return clientCredentials;
    }

    public void setClientCredentials(OAuthFlow clientCredentials) {
        this.clientCredentials = clientCredentials;
    }

    public OAuthFlow getAuthorizationCode() {
        return authorizationCode;
    }

    public void setAuthorizationCode(OAuthFlow authorizationCode) {
        this.authorizationCode = authorizationCode;
    }
}
